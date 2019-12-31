# THREAD_DUMP

- `#period: 60 s`

```
jdk.ThreadDump {
  startTime = 12:23:59.509
  result = "2019-12-31 12:23:58
Full thread dump OpenJDK 64-Bit Server VM (14-ea+28-1366 mixed mode, sharing):

Threads class SMR info:
_java_thread_list=0x00007fc79400d0f0, length=20, elements={
0x00007fc7f41f0800, 0x00007fc7f41f2800, 0x00007fc7f41f9800, 0x00007fc7f41fb800,
0x00007fc7f41fd800, 0x00007fc7f41ff800, 0x00007fc7f4201800, 0x00007fc7f421f000,
0x00007fc7f42b8000, 0x00007fc7f42b8800, 0x00007fc7f42ed800, 0x00007fc7f4309000,
0x00007fc7f430a800, 0x00007fc7f430c000, 0x00007fc7f430e000, 0x00007fc7f402b800,
0x00007fc78403f000, 0x00007fc7840ce800, 0x00007fc748001800, 0x00007fc7ac001000
}

"Reference Handler" #2 daemon prio=10 os_prio=0 cpu=1,02ms elapsed=5,99s tid=0x00007fc7f41f0800 nid=0x6637 waiting on condition  [0x00007fc7d8562000]
   java.lang.Thread.State: RUNNABLE
	at java.lang.ref.Reference.waitForReferencePendingList(java.base@14-ea/Native Method)
	at java.lang.ref.Reference.processPendingReferences(java.base@14-ea/Reference.java:241)
	at java.lang.ref.Reference$ReferenceHandler.run(java.base@14-ea/Reference.java:213)

"Finalizer" #3 daemon prio=8 os_prio=0 cpu=0,45ms elapsed=5,99s tid=0x00007fc7f41f2800 nid=0x6638 in Object.wait()  [0x00007fc7d8461000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(java.base@14-ea/Native Method)
	- waiting on <0x00000000c3d00178> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(java.base@14-ea/ReferenceQueue.java:155)
	- locked <0x00000000c3d00178> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(java.base@14-ea/ReferenceQueue.java:176)
	at java.lang.ref.Finalizer$FinalizerThread.run(java.base@14-ea/Finalizer.java:170)

"Signal Dispatcher" #4 daemon prio=9 os_prio=0 cpu=0,26ms elapsed=5,99s tid=0x00007fc7f41f9800 nid=0x6639 runnable  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Service Thread" #5 daemon prio=9 os_prio=0 cpu=0,70ms elapsed=5,99s tid=0x00007fc7f41fb800 nid=0x663a runnable  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread0" #6 daemon prio=9 os_prio=0 cpu=1202,76ms elapsed=5,99s tid=0x00007fc7f41fd800 nid=0x663b waiting on condition  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE
   No compile task

"C1 CompilerThread0" #9 daemon prio=9 os_prio=0 cpu=552,09ms elapsed=5,99s tid=0x00007fc7f41ff800 nid=0x663c waiting on condition  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE
   No compile task

"Sweeper thread" #10 daemon prio=9 os_prio=0 cpu=11,63ms elapsed=5,99s tid=0x00007fc7f4201800 nid=0x663d runnable  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Common-Cleaner" #11 daemon prio=8 os_prio=0 cpu=0,90ms elapsed=5,96s tid=0x00007fc7f421f000 nid=0x6641 in Object.wait()  [0x00007fc7c99ed000]
   java.lang.Thread.State: TIMED_WAITING (on object monitor)
	at java.lang.Object.wait(java.base@14-ea/Native Method)
	- waiting on <0x00000000c3ba4db8> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(java.base@14-ea/ReferenceQueue.java:155)
	- locked <0x00000000c3ba4db8> (a java.lang.ref.ReferenceQueue$Lock)
	at jdk.internal.ref.CleanerImpl.run(java.base@14-ea/CleanerImpl.java:148)
	at java.lang.Thread.run(java.base@14-ea/Thread.java:832)
	at jdk.internal.misc.InnocuousThread.run(java.base@14-ea/InnocuousThread.java:134)

"Monitor Ctrl-Break" #12 daemon prio=5 os_prio=0 cpu=17,00ms elapsed=5,91s tid=0x00007fc7f42b8000 nid=0x6643 runnable  [0x00007fc7c97eb000]
   java.lang.Thread.State: RUNNABLE
	at sun.nio.ch.SocketDispatcher.read0(java.base@14-ea/Native Method)
	at sun.nio.ch.SocketDispatcher.read(java.base@14-ea/SocketDispatcher.java:47)
	at sun.nio.ch.NioSocketImpl.tryRead(java.base@14-ea/NioSocketImpl.java:261)
	at sun.nio.ch.NioSocketImpl.implRead(java.base@14-ea/NioSocketImpl.java:312)
	at sun.nio.ch.NioSocketImpl.read(java.base@14-ea/NioSocketImpl.java:350)
	at sun.nio.ch.NioSocketImpl$1.read(java.base@14-ea/NioSocketImpl.java:803)
	at java.net.Socket$SocketInputStream.read(java.base@14-ea/Unknown Source)
	at sun.nio.cs.StreamDecoder.readBytes(java.base@14-ea/StreamDecoder.java:297)
	at sun.nio.cs.StreamDecoder.implRead(java.base@14-ea/StreamDecoder.java:339)
	at sun.nio.cs.StreamDecoder.read(java.base@14-ea/StreamDecoder.java:188)
	- locked <0x00000000c3b58bc8> (a java.io.InputStreamReader)
	at java.io.InputStreamReader.read(java.base@14-ea/InputStreamReader.java:181)
	at java.io.BufferedReader.fill(java.base@14-ea/BufferedReader.java:161)
	at java.io.BufferedReader.readLine(java.base@14-ea/BufferedReader.java:326)
	- locked <0x00000000c3b58bc8> (a java.io.InputStreamReader)
	at java.io.BufferedReader.readLine(java.base@14-ea/BufferedReader.java:392)
	at com.intellij.rt.execution.application.AppMainV2$1.run(AppMainV2.java:64)

"Notification Thread" #13 daemon prio=9 os_prio=0 cpu=0,12ms elapsed=5,91s tid=0x00007fc7f42b8800 nid=0x6644 runnable  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"jfr-0" #14 prio=5 os_prio=0 cpu=808,68ms elapsed=5,82s tid=0x00007fc7f42ed800 nid=0x6647 in Object.wait()  [0x00007fc7c94e6000]
   java.lang.Thread.State: TIMED_WAITING (on object monitor)
	at java.lang.Object.wait(java.base@14-ea/Native Method)
	- waiting on <0x00000000d8100450> (a java.lang.Object)
	at jdk.jfr.internal.Utils.waitFlush(jdk.jfr@14-ea/Utils.java:713)
	- locked <0x00000000d8100450> (a java.lang.Object)
	at jdk.jfr.internal.consumer.ChunkParser.awaitUpdatedHeader(jdk.jfr@14-ea/ChunkParser.java:297)
	at jdk.jfr.internal.consumer.ChunkParser.readStreamingEvent(jdk.jfr@14-ea/ChunkParser.java:202)
	at jdk.jfr.internal.consumer.EventDirectoryStream.processOrdered(jdk.jfr@14-ea/EventDirectoryStream.java:193)
	at jdk.jfr.internal.consumer.EventDirectoryStream.processRecursionSafe(jdk.jfr@14-ea/EventDirectoryStream.java:139)
	at jdk.jfr.internal.consumer.EventDirectoryStream.process(jdk.jfr@14-ea/EventDirectoryStream.java:97)
	at jdk.jfr.internal.consumer.AbstractEventStream.execute(jdk.jfr@14-ea/AbstractEventStream.java:243)
	at jdk.jfr.internal.consumer.AbstractEventStream$1.run(jdk.jfr@14-ea/AbstractEventStream.java:265)
	at jdk.jfr.internal.consumer.AbstractEventStream$1.run(jdk.jfr@14-ea/AbstractEventStream.java:262)
	at java.security.AccessController.executePrivileged(java.base@14-ea/AccessController.java:753)
	at java.security.AccessController.doPrivileged(java.base@14-ea/AccessController.java:391)
	at jdk.jfr.internal.consumer.AbstractEventStream.run(jdk.jfr@14-ea/AbstractEventStream.java:262)
	at jdk.jfr.internal.consumer.AbstractEventStream.start(jdk.jfr@14-ea/AbstractEventStream.java:222)
	at jdk.jfr.consumer.RecordingStream.start(jdk.jfr@14-ea/RecordingStream.java:344)
	at pbouda.jfr.Jfr.lambda$start$2(Jfr.java:48)
	at pbouda.jfr.Jfr$$Lambda$21/0x0000000800b77040.run(Unknown Source)
	at java.util.concurrent.Executors$RunnableAdapter.call(java.base@14-ea/Executors.java:515)
	at java.util.concurrent.FutureTask.run(java.base@14-ea/FutureTask.java:264)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(java.base@14-ea/ThreadPoolExecutor.java:1130)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(java.base@14-ea/ThreadPoolExecutor.java:630)
	at java.lang.Thread.run(java.base@14-ea/Thread.java:832)

"pool-1-thread-1" #15 prio=5 os_prio=0 cpu=2372,41ms elapsed=5,82s tid=0x00007fc7f4309000 nid=0x6648 waiting on condition  [0x00007fc7c93e6000]
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@14-ea/Native Method)
	- parking to wait for  <0x00000000d8100f48> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
	at java.util.concurrent.locks.LockSupport.park(java.base@14-ea/LockSupport.java:341)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionNode.block(java.base@14-ea/AbstractQueuedSynchronizer.java:505)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@14-ea/ForkJoinPool.java:3137)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(java.base@14-ea/AbstractQueuedSynchronizer.java:1614)
	at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(java.base@14-ea/ScheduledThreadPoolExecutor.java:1177)
	at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(java.base@14-ea/ScheduledThreadPoolExecutor.java:899)
	at java.util.concurrent.ThreadPoolExecutor.getTask(java.base@14-ea/ThreadPoolExecutor.java:1056)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(java.base@14-ea/ThreadPoolExecutor.java:1116)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(java.base@14-ea/ThreadPoolExecutor.java:630)
	at java.lang.Thread.run(java.base@14-ea/Thread.java:832)

"pool-1-thread-2" #16 prio=5 os_prio=0 cpu=2401,80ms elapsed=5,82s tid=0x00007fc7f430a800 nid=0x6649 waiting on condition  [0x00007fc7c92e5000]
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@14-ea/Native Method)
	- parking to wait for  <0x00000000d8100f48> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
	at java.util.concurrent.locks.LockSupport.park(java.base@14-ea/LockSupport.java:341)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionNode.block(java.base@14-ea/AbstractQueuedSynchronizer.java:505)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@14-ea/ForkJoinPool.java:3137)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(java.base@14-ea/AbstractQueuedSynchronizer.java:1614)
	at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(java.base@14-ea/ScheduledThreadPoolExecutor.java:1177)
	at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(java.base@14-ea/ScheduledThreadPoolExecutor.java:899)
	at java.util.concurrent.ThreadPoolExecutor.getTask(java.base@14-ea/ThreadPoolExecutor.java:1056)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(java.base@14-ea/ThreadPoolExecutor.java:1116)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(java.base@14-ea/ThreadPoolExecutor.java:630)
	at java.lang.Thread.run(java.base@14-ea/Thread.java:832)

"pool-1-thread-3" #17 prio=5 os_prio=0 cpu=2362,10ms elapsed=5,82s tid=0x00007fc7f430c000 nid=0x664a waiting on condition  [0x00007fc7c91e4000]
   java.lang.Thread.State: TIMED_WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@14-ea/Native Method)
	- parking to wait for  <0x00000000d8100f48> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
	at java.util.concurrent.locks.LockSupport.parkNanos(java.base@14-ea/LockSupport.java:252)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.awaitNanos(java.base@14-ea/AbstractQueuedSynchronizer.java:1661)
	at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(java.base@14-ea/ScheduledThreadPoolExecutor.java:1182)
	at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(java.base@14-ea/ScheduledThreadPoolExecutor.java:899)
	at java.util.concurrent.ThreadPoolExecutor.getTask(java.base@14-ea/ThreadPoolExecutor.java:1056)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(java.base@14-ea/ThreadPoolExecutor.java:1116)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(java.base@14-ea/ThreadPoolExecutor.java:630)
	at java.lang.Thread.run(java.base@14-ea/Thread.java:832)

"pool-1-thread-4" #18 prio=5 os_prio=0 cpu=2467,58ms elapsed=5,82s tid=0x00007fc7f430e000 nid=0x664b waiting on condition  [0x00007fc7c90e3000]
   java.lang.Thread.State: WAITING (parking)
	at jdk.internal.misc.Unsafe.park(java.base@14-ea/Native Method)
	- parking to wait for  <0x00000000d8100f48> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
	at java.util.concurrent.locks.LockSupport.park(java.base@14-ea/LockSupport.java:341)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionNode.block(java.base@14-ea/AbstractQueuedSynchronizer.java:505)
	at java.util.concurrent.ForkJoinPool.managedBlock(java.base@14-ea/ForkJoinPool.java:3137)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(java.base@14-ea/AbstractQueuedSynchronizer.java:1614)
	at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(java.base@14-ea/ScheduledThreadPoolExecutor.java:1177)
	at java.util.concurrent.ScheduledThreadPoolExecutor$DelayedWorkQueue.take(java.base@14-ea/ScheduledThreadPoolExecutor.java:899)
	at java.util.concurrent.ThreadPoolExecutor.getTask(java.base@14-ea/ThreadPoolExecutor.java:1056)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(java.base@14-ea/ThreadPoolExecutor.java:1116)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(java.base@14-ea/ThreadPoolExecutor.java:630)
	at java.lang.Thread.run(java.base@14-ea/Thread.java:832)

"DestroyJavaVM" #19 prio=5 os_prio=0 cpu=178,57ms elapsed=5,82s tid=0x00007fc7f402b800 nid=0x6626 waiting on condition  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"JFR Recorder Thread" #20 daemon prio=5 os_prio=0 cpu=4,85ms elapsed=5,78s tid=0x00007fc78403f000 nid=0x664d waiting on condition  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"JFR Periodic Tasks" #21 daemon prio=5 os_prio=0 cpu=15,76ms elapsed=5,02s tid=0x00007fc7840ce800 nid=0x6659 waiting on condition  [0x00007fc7736ed000]
   java.lang.Thread.State: RUNNABLE
	at jdk.jfr.internal.JVM.emitEvent(jdk.jfr@14-ea/Native Method)
	at jdk.jfr.internal.RequestEngine$RequestHook.execute(jdk.jfr@14-ea/RequestEngine.java:69)
	at jdk.jfr.internal.RequestEngine.run_requests(jdk.jfr@14-ea/RequestEngine.java:235)
	at jdk.jfr.internal.RequestEngine.doPeriodic(jdk.jfr@14-ea/RequestEngine.java:186)
	at jdk.jfr.internal.PlatformRecorder.periodicTask(jdk.jfr@14-ea/PlatformRecorder.java:472)
	at jdk.jfr.internal.PlatformRecorder.lambda$startDiskMonitor$1(jdk.jfr@14-ea/PlatformRecorder.java:417)
	at jdk.jfr.internal.PlatformRecorder$$Lambda$63/0x0000000800b81c40.run(jdk.jfr@14-ea/Unknown Source)
	at java.lang.Thread.run(java.base@14-ea/Thread.java:832)

"JFR Recording Scheduler" #24 daemon prio=5 os_prio=0 cpu=0,11ms elapsed=5,00s tid=0x00007fc748001800 nid=0x665f in Object.wait()  [0x00007fc7734eb000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(java.base@14-ea/Native Method)
	- waiting on <0x00000000c3ba5510> (a java.util.TaskQueue)
	at java.lang.Object.wait(java.base@14-ea/Object.java:321)
	at java.util.TimerThread.mainLoop(java.base@14-ea/Timer.java:527)
	- locked <0x00000000c3ba5510> (a java.util.TaskQueue)
	at java.util.TimerThread.run(java.base@14-ea/Timer.java:506)

"Attach Listener" #26 daemon prio=9 os_prio=0 cpu=18,77ms elapsed=4,96s tid=0x00007fc7ac001000 nid=0x6663 runnable  [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"VM Thread" os_prio=0 cpu=1640,76ms elapsed=6,00s tid=0x00007fc7f41ed800 nid=0x6635 runnable  

"GC Thread#0" os_prio=0 cpu=1091,94ms elapsed=6,01s tid=0x00007fc7f405c000 nid=0x6627 runnable  

"GC Thread#1" os_prio=0 cpu=1138,80ms elapsed=5,75s tid=0x00007fc7c0001000 nid=0x664e runnable  

"GC Thread#2" os_prio=0 cpu=1118,44ms elapsed=5,75s tid=0x00007fc7c0002800 nid=0x664f runnable  

"GC Thread#3" os_prio=0 cpu=1111,30ms elapsed=5,75s tid=0x00007fc7c0003800 nid=0x6650 runnable  

"GC Thread#4" os_prio=0 cpu=1114,90ms elapsed=5,75s tid=0x00007fc7c0005000 nid=0x6651 runnable  

"GC Thread#5" os_prio=0 cpu=1111,05ms elapsed=5,75s tid=0x00007fc7c0006800 nid=0x6652 runnable  

"GC Thread#6" os_prio=0 cpu=1098,08ms elapsed=5,75s tid=0x00007fc7c0007800 nid=0x6653 runnable  

"GC Thread#7" os_prio=0 cpu=1093,97ms elapsed=5,75s tid=0x00007fc7c0009000 nid=0x6654 runnable  

"G1 Main Marker" os_prio=0 cpu=3,42ms elapsed=6,01s tid=0x00007fc7f4066000 nid=0x6628 runnable  

"G1 Conc#0" os_prio=0 cpu=931,30ms elapsed=6,01s tid=0x00007fc7f4067800 nid=0x662b runnable  

"G1 Conc#1" os_prio=0 cpu=929,50ms elapsed=5,27s tid=0x00007fc7cc001000 nid=0x6657 runnable  

"G1 Refine#0" os_prio=0 cpu=7,89ms elapsed=6,00s tid=0x00007fc7f417c000 nid=0x662c runnable  

"G1 Refine#1" os_prio=0 cpu=2,36ms elapsed=3,77s tid=0x00007fc7c4001000 nid=0x667a runnable  

"G1 Refine#2" os_prio=0 cpu=1,45ms elapsed=2,99s tid=0x00007fc734001000 nid=0x667b runnable  

"G1 Refine#3" os_prio=0 cpu=3,72ms elapsed=2,99s tid=0x00007fc778179800 nid=0x667c runnable  

"G1 Young RemSet Sampling" os_prio=0 cpu=0,86ms elapsed=6,00s tid=0x00007fc7f417d800 nid=0x662d runnable  
"VM Periodic Task Thread" os_prio=0 cpu=2,94ms elapsed=5,91s tid=0x00007fc7f42ba800 nid=0x6645 waiting on condition  

JNI global refs: 33, weak refs: 3

"
}
```