package pbouda.jfr;

import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class MonitorEnter {

    public static void main(String[] args) throws InterruptedException, IOException {
        Jfr.start("jdk.BiasedLockRevocation");

        Runnable runnable = () -> {
            while (true) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                innerMethod();
            }
        };

        new Thread(runnable).start();

        Thread.sleep(10_000);

        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();

        Thread.currentThread().join();
    }

    private static synchronized void innerMethod() {
        System.out.println("Protected Area - " + Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
