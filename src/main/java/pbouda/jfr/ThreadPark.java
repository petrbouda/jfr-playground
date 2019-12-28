package pbouda.jfr;

import java.util.concurrent.locks.LockSupport;

public class ThreadPark {

    public static void main(String[] args) throws InterruptedException {
        Jfr.start("jdk.ThreadPark");

        Thread clock = new Thread(() -> {
            while (true)
                LockSupport.park(new Object());
        });
        clock.start();

        while (true) {
            Thread.currentThread().join(100);
            LockSupport.unpark(clock);
        }
    }
}
