# CLASS

- `disabled` by default

#### CLASS_LOAD

```
jdk.ClassLoad {
  startTime = 16:27:51.712
  duration = 0.847 ms
  loadedClass = java.util.concurrent.ForkJoinPool$ManagedBlocker (classLoader = bootstrap)
  definingClassLoader = null  initiatingClassLoader = null  eventThread = "pool-1-thread-3" (javaThreadId = 17)
  stackTrace = [
    java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(long) line: 1650
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take() line: 1182
    java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take() line: 899
    java.util.concurrent.ThreadPoolExecutor.getTask() line: 1056
    java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor$Worker) line: 1116
    ...
  ]
}
```

#### CLASS_UNLOAD

```
jdk.ClassUnload {
  startTime = 16:27:49.573
  unloadedClass = java.lang.invoke.LambdaForm$MH.1387135337 (classLoader = bootstrap)
  definingClassLoader = N/A
}
```

#### CLASS_DEFINE

```
jdk.ClassDefine {
  startTime = 16:27:50.046
  definedClass = jdk.jfr.internal.consumer.AbstractEventStream$1 (classLoader = bootstrap)
  definingClassLoader = null  eventThread = "jfr-0" (javaThreadId = 14)
  stackTrace = [
    jdk.jfr.internal.consumer.AbstractEventStream.run(AccessControlContext) line: 262
    jdk.jfr.internal.consumer.AbstractEventStream.start(long) line: 222
    jdk.jfr.consumer.RecordingStream.start() line: 344
    pbouda.jfr.Jfr.lambda$start$2(Configuration, String[]) line: 48
    pbouda.jfr.Jfr$$Lambda$21.1342443276.run()
    ...
  ]
}
```