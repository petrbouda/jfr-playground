package pbouda.jfr;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class NamedThreadFactory implements ThreadFactory {

    private final AtomicInteger counter = new AtomicInteger();
    private final String prefix;
    private final Thread.UncaughtExceptionHandler exceptionHandler;

    /**
     * Creates new ThreadFactory instance with a predefined prefix of a thread's name.
     *
     * @param prefix thread's prefix.
     */
    public NamedThreadFactory(String prefix) {
        this(prefix, null);
    }

    /**
     * Creates new ThreadFactory instance with a predefined prefix of a thread's name and a handler when completes
     * exceptionally.
     *
     * @param prefix thread's prefix.
     * @param exceptionHandler handler to process when thread completes exceptionally.
     */
    public NamedThreadFactory(String prefix, Thread.UncaughtExceptionHandler exceptionHandler) {
        this.prefix = prefix;
        this.exceptionHandler = exceptionHandler;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, prefix + "-" + counter.getAndIncrement());
        if (exceptionHandler != null) {
            thread.setUncaughtExceptionHandler(exceptionHandler);
        }
        return thread;
    }
}