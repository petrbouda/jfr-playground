# OBJECT_ALLOCATION

- TLAB is Thread-Local Allocation Buffer and is always dedicated to one thread
- the thread allocates new objects into TLAB to avoid contention among other threads
- if TLAB is full then the thread receives from GC a new TLAB to allocate to
- if there is no TLAB available at the certain moment then allocate the object outside a TLAB to shared memory (synchronization)

```
jdk.ObjectAllocationInNewTLAB#enabled: true
jdk.ObjectAllocationInNewTLAB#stackTrace: true
jdk.ObjectAllocationOutsideTLAB#enabled: true
jdk.ObjectAllocationOutsideTLAB#stackTrace: true
```

#### OBJECT_ALLOCATION_IN_NEW_TLAB

- the event is emitted always when we need to created a new TLAB for the given thread to be able to allocation the object
- the bigger TLABs we have the less objects we produce
- the same technique is used even in profilers such as `AsyncProfiler` when me measure object allocation

```
jdk.ObjectAllocationInNewTLAB {
  startTime = 12:29:02.559
  objectClass = java.lang.String (classLoader = bootstrap)
  allocationSize = 24 bytes
  tlabSize = 512.0 kB
  eventThread = "pool-1-thread-2" (javaThreadId = 16)
  stackTrace = [
    java.lang.StringConcatHelper.newString(byte[], long) line: 397
    java.lang.invoke.DirectMethodHandle$Holder.invokeStatic(Object, Object, long)
    java.lang.invoke.LambdaForm$MH.1186189638.invoke(Object, int, Object)
    java.lang.invoke.Invokers$Holder.linkToTargetMethod(int, Object, Object)
    pbouda.jfr.AllocationStress$Utility.generate(String, int, int, int, int) line: 110
    ...
  ]
}
```

#### OBJECT_ALLOCATION_OUTSIDE_TLAB

- the event is emitted always for an allocation outside the TLAB
- this is a bad hint because our thread is not able to withstand the allocation inside TLAB

```
jdk.ObjectAllocationOutsideTLAB {
  startTime = 12:29:02.563
  objectClass = pbouda.jfr.AllocationStress$Contact[] (classLoader = app)
  allocationSize = 276.3 kB
  eventThread = "pool-1-thread-4" (javaThreadId = 18)
  stackTrace = [
    pbouda.jfr.AllocationStress$Utility.generate(String, int, int, int, int) line: 108
    pbouda.jfr.AllocationStress.lambda$main$0(AtomicInteger) line: 34
    pbouda.jfr.AllocationStress$$Lambda$22.443308702.run()
    java.util.concurrent.Executors$RunnableAdapter.call() line: 515
    java.util.concurrent.FutureTask.runAndReset() line: 305
    ...
  ]
}
```