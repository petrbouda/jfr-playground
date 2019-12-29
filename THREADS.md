## JAVA_THREAD_STATISTICS

- [custom-profile](custom-profile.xml)
- `jdk.JavaThreadStatistics`
- generated every 1s

```
jdk.JavaThreadStatistics {
  startTime = 16:24:05.108
  activeCount = 12
  daemonCount = 10
  accumulatedCount = 14
  peakCount = 12
}
```

## THREAD_ALLOCATION_STATISTICS 

- [custom-profile](custom-profile.xml)
- `jdk.ThreadAllocationStatistics`
- generated every 1s (by default `everyChunk`)
- all Java and JVM Threads (all threads from ThreadDump)

```
jdk.ThreadAllocationStatistics {
  startTime = 16:07:58.795
  allocated = 858.1 MB
  thread = "allocator-0" (javaThreadId = 15)
}

jdk.ThreadAllocationStatistics {
  startTime = 16:07:58.795
  allocated = 40 bytes
  thread = "C2 CompilerThread0" (javaThreadId = 6)
}


jdk.ThreadAllocationStatistics {
  startTime = 16:07:58.795
  allocated = 4.7 kB
  thread = "C1 CompilerThread0" (javaThreadId = 9)
}

...
```

## THREAD_START_END

- [custom-profile](custom-profile.xml)
- `jdk.ThreadStart`
- `jdk.ThreadEnd`
- generated every occasion

```
// JVM Compiler Threads

jdk.ThreadEnd {
  startTime = 22:07:40.977
  thread = "C2 CompilerThread2" (javaThreadId = 8)
  eventThread = "C2 CompilerThread2" (javaThreadId = 8)
}


jdk.ThreadEnd {
  startTime = 22:07:40.977
  thread = "C2 CompilerThread1" (javaThreadId = 7)
  eventThread = "C2 CompilerThread1" (javaThreadId = 7)
}

// User Java threads 

jdk.ThreadStart {
  startTime = 22:07:41.552
  thread = "wasted-3" (javaThreadId = 25)
  eventThread = "wasted-3" (javaThreadId = 25)
}


jdk.ThreadEnd {
  startTime = 22:07:41.553
  thread = "wasted-3" (javaThreadId = 25)
  eventThread = "wasted-3" (javaThreadId = 25)
}
```

## THREAD_SLEEP

- [custom-profile](custom-profile.xml)
- `jdk.ThreadSleep`
- generated every occasion

```
jdk.ThreadSleep {
  startTime = 22:36:28.750
  duration = 1.13 s
  time = 1.00 s
  eventThread = "main" (javaThreadId = 1)
  stackTrace = [
    java.lang.Thread.sleep(long)
    pbouda.jfr.ThreadSleep.main(String[]) line: 9
  ]
}
```

## THREAD_PARK (LockSupport#parkNanos)

- [custom-profile](custom-profile.xml)
- `jdk.ThreadPark`
- generated when parking is higher than 10 ms
- calling `parkNanos` only

```java
new Thread(() -> {
    while (true)
        LockSupport.parkNanos(Duration.ofMillis(100).toNanos());
}).start();
```

```
jdk.ThreadPark {
  startTime = 23:25:12.305
  duration = 113 ms
  parkedClass = N/A
  timeout = 100 ms
  until = N/A
  address = 0x00000000
  eventThread = "Thread-0" (javaThreadId = 15)
  stackTrace = [
    jdk.internal.misc.Unsafe.park(boolean, long)
    java.util.concurrent.locks.LockSupport.parkNanos(long) line: 376
    pbouda.jfr.MonitorEnter.lambda$main$0() line: 14
    pbouda.jfr.MonitorEnter$$Lambda$22.396180261.run()
    java.lang.Thread.run() line: 832
    ...
  ]
}
```

## THREAD_PARK (LockSupport#park(blocker))

- [custom-profile](custom-profile.xml)
- `jdk.ThreadPark`
- generated when parking is higher than 10 ms
- generated events with and without `Blocker`
- calling `park` and `unpark` methods

```java
Thread clock = new Thread(() -> {
    while (true)
        LockSupport.park(new Object());
});
clock.start();

while (true) {
    Thread.currentThread().join(100);
    LockSupport.unpark(clock);
}
```

```
// Parking without any Blocker object

jdk.ThreadPark {
  startTime = 23:08:51.534
  duration = 2.25 s
  parkedClass = N/A
  timeout = N/A
  until = N/A
  address = 0x00000000
  eventThread = "Thread-0" (javaThreadId = 15)
  stackTrace = [
    jdk.internal.misc.Unsafe.park(boolean, long)
    java.util.concurrent.locks.LockSupport.park() line: 341
    pbouda.jfr.MonitorEnter.lambda$main$0() line: 13
    pbouda.jfr.MonitorEnter$$Lambda$22.625576447.run()
    java.lang.Thread.run() line: 832
    ...
  ]
}

// Parking with Blocker Object

jdk.ThreadPark {
  startTime = 23:11:44.143
  duration = 2.25 s
  parkedClass = java.lang.Object (classLoader = bootstrap)
  timeout = N/A
  until = N/A
  address = 0x6DC0001F0
  eventThread = "Thread-0" (javaThreadId = 15)
  stackTrace = [
    jdk.internal.misc.Unsafe.park(boolean, long)
    java.util.concurrent.locks.LockSupport.park(Object) line: 211
    pbouda.jfr.MonitorEnter.lambda$main$0(Object) line: 15
    pbouda.jfr.MonitorEnter$$Lambda$22.1128032093.run()
    java.lang.Thread.run() line: 832
    ...
  ]
}
```

## THREAD_PARK (LockSupport#parkUntil(blocker, deadline))

- [custom-profile](custom-profile.xml)
- `jdk.ThreadPark`
- generated when parking is higher than 10 ms
- generated event with `Blocker` and `Deadline`
- calling `parkUntil` only

```java
new Thread(() -> {
    while (true)
        LockSupport.parkUntil(new Object(), Instant.now().plusMillis(100).toEpochMilli());
}).start();
```

```
jdk.ThreadPark {
  startTime = 23:15:37.775
  duration = 112 ms
  parkedClass = java.lang.Object (classLoader = bootstrap)
  timeout = N/A
  until = 23:15:37.236
  address = 0x6DC005E80
  eventThread = "Thread-0" (javaThreadId = 15)
  stackTrace = [
    jdk.internal.misc.Unsafe.park(boolean, long)
    java.util.concurrent.locks.LockSupport.parkUntil(Object, long) line: 293
    pbouda.jfr.MonitorEnter.lambda$main$0(Object) line: 16
    pbouda.jfr.MonitorEnter$$Lambda$22.443308702.run()
    java.lang.Thread.run() line: 832
    ...
  ]
}
```