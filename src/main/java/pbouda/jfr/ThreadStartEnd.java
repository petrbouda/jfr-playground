package pbouda.jfr;

public class ThreadStartEnd {

    public static void main(String[] args) throws InterruptedException {
        Jfr.start("jdk.ThreadStart", "jdk.ThreadEnd");

        NamedThreadFactory factory = new NamedThreadFactory("wasted");
        while (true) {
            Thread thread = factory.newThread(() -> System.out.println(Thread.currentThread().getName()));
            thread.start();
            Thread.sleep(1000);
        }
    }
}
