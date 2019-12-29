## JAVA_MONITOR_ENTER

- [custom-profile](custom-profile.xml)
- `jdk.JavaMonitorEnter`
- time spent in a critical path must be longer than 10ms
- the monitor needs to be contended (inflated) otherwise lightweight lock is used
and the event is not thrown

```java
public class MonitorEnter {

    public static void main(String[] args) {
        Jfr.start("jdk.JavaMonitorEnter");

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(5);
        executor.scheduleWithFixedDelay(MonitorEnter::innerMethod, 0, 10, TimeUnit.MILLISECONDS);

        while(true) {
            innerMethod();
        }
    }

    private static synchronized void innerMethod() {
        System.out.println("Protected Area - " + Thread.currentThread().getName());
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {}
    }
}
```

```
jdk.JavaMonitorEnter {
  startTime = 19:11:29.873
  duration = 13.3 s
  monitorClass = java.lang.Class (classLoader = bootstrap)
  previousOwner = "main" (javaThreadId = 1)
  address = 0x7F77C8021888
  eventThread = "pool-1-thread-2" (javaThreadId = 17)
  stackTrace = [
    pbouda.jfr.MonitorEnter.innerMethod() line: 22
    pbouda.jfr.MonitorEnter$$Lambda$22.1560911714.run()
    java.util.concurrent.Executors$RunnableAdapter.call() line: 515
    java.util.concurrent.FutureTask.runAndReset() line: 305
    java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run() line: 305
    ...
  ]
}
```

## JAVA_MONITOR_WAIT

- [custom-profile](custom-profile.xml)
- `jdk.JavaMonitorWait`
- thread needs to wait for acquiring a lock longer than 10 ms

```
jdk.JavaMonitorWait {
  startTime = 19:14:11.474
  duration = 22.7 ms
  monitorClass = java.lang.Object (classLoader = bootstrap)
  notifier = N/A
  timeout = 20.0 ms
  timedOut = true
  address = 0x7F3B64007408
  eventThread = "JFR Periodic Tasks" (javaThreadId = 18)
  stackTrace = [
    java.lang.Object.wait(long)
    jdk.jfr.internal.PlatformRecorder.takeNap(long) line: 481
    jdk.jfr.internal.PlatformRecorder.periodicTask() line: 474
    jdk.jfr.internal.PlatformRecorder.lambda$startDiskMonitor$1() line: 417
    jdk.jfr.internal.PlatformRecorder$$Lambda$63.678689676.run()
    ...
  ]
}
```

## JAVA_MONITOR_INFLATE

- `COULD NOT REPRODUCE`


## BIASED_LOCK_REVOCATION

- [custom-profile](custom-profile.xml)
- `jdk.BiasedLockRevocation`
- one thread needs to get biased lock and another thread tries to get the lock for itself

```
jdk.BiasedLockRevocation {
  startTime = 20:22:07.422
  duration = 0.102 ms
  lockClass = jdk.jfr.internal.MetadataRepository (classLoader = bootstrap)
  safepointId = 0
  previousOwner = "jfr-0" (javaThreadId = 14)
  eventThread = "JFR Periodic Tasks" (javaThreadId = 17)
  stackTrace = [
    jdk.jfr.internal.MetadataRepository.flush() line: 320
    jdk.jfr.internal.RequestEngine.run_requests(Collection) line: 265
    jdk.jfr.internal.RequestEngine.doPeriodic() line: 186
    jdk.jfr.internal.PlatformRecorder.periodicTask() line: 472
    jdk.jfr.internal.PlatformRecorder.lambda$startDiskMonitor$1() line: 417
    ...
  ]
}
```