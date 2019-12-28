package pbouda.jfr;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadAllocation {

    public static void main(String[] args) throws InterruptedException {
        Jfr.start("jdk.ThreadAllocationStatistics");

        var scheduler = Executors.newSingleThreadScheduledExecutor(new NamedThreadFactory("allocator"));
        scheduler.scheduleWithFixedDelay(ThreadAllocation::allocate, 0, 10, TimeUnit.MILLISECONDS);

        Thread.currentThread().join();
    }

    private static String allocate() {
        byte[] allocation = new byte[1024 * 512];
        return new String(allocation);
    }
}
