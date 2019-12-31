# CLASSES

## CLASSLOADER

#### CLASS_LOADER_STATISTICS

- [custom-profile](custom-profile.xml)
- `jdk.ClassLoaderStatistics`
- generated `everyChunk`
- for every classloader

```
jdk.ClassLoaderStatistics {
  startTime = 16:18:05.203
  classLoader = N/A
  parentClassLoader = N/A
  classLoaderData = 0x7FA3F827B5E0
  classCount = 1568
  chunkSize = 4.4 MB
  blockSize = 4.0 MB
  unsafeAnonymousClassCount = 104
  unsafeAnonymousChunkSize = 287.0 kB
  unsafeAnonymousBlockSize = 185.2 kB
}


jdk.ClassLoaderStatistics {
  startTime = 16:18:05.203
  classLoader = jdk.internal.loader.ClassLoaders$AppClassLoader (id = 4)
  parentClassLoader = N/A
  classLoaderData = 0x7FA3F8306BC0
  classCount = 6
  chunkSize = 84.0 kB
  blockSize = 23.1 kB
  unsafeAnonymousClassCount = 4
  unsafeAnonymousChunkSize = 12.0 kB
  unsafeAnonymousBlockSize = 7.5 kB
}

...
```

#### CLASS_LOADING_STATISTICS

- [custom-profile](custom-profile.xml)
- `jdk.ClassLoadingStatistics`
- generated every 1s

```
jdk.ClassLoadingStatistics {
  startTime = 16:13:52.017
  loadedClassCount = 1715
  unloadedClassCount = 0
}
```

## LOADING OF SINGLE CLASSES

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