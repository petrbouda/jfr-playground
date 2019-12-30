# OLD_OBJECT_SAMPLE

- `jdk.OldObjectSample`
- execution: `#cutoff: 0 ns`
- JFR contains internal priority queue that keeps 256 objects (by default)
    - the priority becomes higher for neighbours when an object is garbage-collected 
    - weak-references - objects are collected and automatically deleted from the queue
    - the latest ones (survivals) become `OldObjectSample`
    -  paths-to-gc-roots you also get the reference chains:
        - `-XX:StartFlightRecording=path-to-gc-roots=true`
        - `jcmd <pid> JFR.dump path-to-gc-roots=true`
    - the number of objects to track:
        - `-XX:FlightRecordingOptions=old-object-queue-size=256`
    - dump the queue at the end of the recording.

Information from the event:
- Time of allocation
- The thread doing the allocation
- The last known heap usage at the time of allocation
    - Which can be used to plot the live set, 
    even if we don’t have data from the time of allocation anymore
- The allocation stack trace (In other words, where was this object allocated?)
- The reference chain back to the GC root at the time of dumping the recording
    - In other words, who is still holding on to this object?
- The address of the object

```
jdk.OldObjectSample {
  startTime = 14:21:37.294
  allocationTime = 14:21:36.222
  objectAge = 1.07 s
  lastKnownHeapUsage = 59.2 MB
  object =  [
    byte[31]
  ]
  arrayElements = 31
  root = N/A
  eventThread = "pool-1-thread-2" (javaThreadId = 16)
  stackTrace = [
    jdk.internal.misc.Unsafe.allocateUninitializedArray(Class, int) line: 1387
    java.lang.StringConcatHelper.newArray(long) line: 458
    java.lang.invoke.DirectMethodHandle$Holder.invokeStatic(Object, long)
    java.lang.invoke.LambdaForm$MH.141200640.invoke(Object, int, Object)
    java.lang.invoke.Invokers$Holder.linkToTargetMethod(int, Object, Object)
    ...
  ]
}
```