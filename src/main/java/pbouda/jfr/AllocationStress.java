package pbouda.jfr;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AllocationStress {

    private static final int MIN_GARBAGE = 50_000;
    private static final int MAX_GARBAGE = 100_000;
    private static final int MIN_LIFESET = 40_000;
    private static final int MAX_LIFESET = 60_000;

    private static final int PARALLEL_USERS = 4;

    public static void main(String[] args) {
        Jfr.start("jdk.MetaspaceGCThreshold", "jdk.MetaspaceAllocationFailure", "jdk.MetaspaceOOM", "jdk.MetaspaceChunkFreeListSummary");

        AtomicInteger counter = new AtomicInteger();

        Runnable runnable = () -> {
            Contact[] biggerLifeSet = new Contact[]{};
            Contact[] longerLifeSet = new Contact[]{};

            for (int i = 0; i < 20; i++) {
                int index = counter.incrementAndGet();
//                System.out.println("INDEX: " + index);

                Contact[] contacts1 = Utility.generate("contact-1 " + index,
                        MIN_GARBAGE, MAX_GARBAGE, MIN_LIFESET, MAX_LIFESET);
                Contact[] contacts2 = Utility.generate("contact-2 " + index,
                        MIN_GARBAGE, MAX_GARBAGE, MIN_LIFESET, MAX_LIFESET);

                biggerLifeSet = Utility.biggerLifeSet(index, biggerLifeSet, contacts1);
                longerLifeSet = Utility.longerLifeSet(index, longerLifeSet, contacts2);

//                System.out.println("Size ALL: " + (biggerLifeSet.length + longerLifeSet.length + contacts1.length));
            }

            if (counter.get() > 20_000) {
                System.exit(0);
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(PARALLEL_USERS);

        // More parallel users
        for (int i = 0; i < PARALLEL_USERS; i++) {
            executor.scheduleWithFixedDelay(runnable, 0, 50, TimeUnit.MILLISECONDS);
        }
    }

    private static class Contact {

        private final String firstname;
        private final String lastname;

        Contact(String firstname, String lastname) {
            this.firstname = firstname;
            this.lastname = lastname;
        }
    }

    private static class Utility {

        static Contact[] longerLifeSet(int index, Contact[] current, Contact[] contacts1) {
            if (index % 10 == 0) {
                return contacts1;
            } else {
                return getSample(.8f, current);
            }
        }

        static Contact[] biggerLifeSet(int index, Contact[] current, Contact[] contacts) {
            Contact[] preserved = getSample(.5f, current);
            Contact[] newSample = getSample(.5f, contacts);
            Contact[] newLifeSet = combine(newSample, preserved);

            return index % 2 == 0 ? getSample(.5f, newLifeSet) : newLifeSet;
        }

        private static Contact[] getSample(float percentage, Contact[] contacts) {
            return Arrays.copyOf(contacts, Math.round(contacts.length * percentage));
        }

        private static Contact[] combine(Contact[] a, Contact[] b) {
            int length = a.length + b.length;
            Contact[] result = new Contact[length];
            System.arraycopy(a, 0, result, 0, a.length);
            System.arraycopy(b, 0, result, a.length, b.length);
            return result;
        }

        static Contact[] generate(String label, int minGarbage, int maxGarbage, int minLifeSet, int maxLifeSet) {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            int lifesetIteration = random.nextInt(minGarbage, maxGarbage);

            int overallSize = 0;
            for (int i = 0; i < random.nextInt(minLifeSet, maxLifeSet); i++) {
                String garbage = "Garbage: " + i + " Index: " + label;
                overallSize += garbage.length();
            }
//            System.out.println(label + ": Size: " + overallSize);

            Contact[] contacts = new Contact[lifesetIteration];
            for (int i = 0; i < lifesetIteration; i++) {
                contacts[i] = new Contact("FirstName " + i + " | " + label, "LastName " + i + " | " + label);
            }
            return contacts;
        }
    }
}