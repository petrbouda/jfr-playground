# G1_GARBAGE_COLLECTION

- `jdk.GarbageCollection`
- `jdk.YoungGarbageCollection`
- `jdk.OldGarbageCollection`
- `jdk.GCPhasePause`

#### ALLOCATION REQUIRING GC

```
jdk.AllocationRequiringGC {
  startTime = 12:22:13.564
  gcId = 191
  size = 2.0 kB
  eventThread = "pool-1-thread-4" (javaThreadId = 18)
  stackTrace = [
    jdk.internal.misc.Unsafe.allocateUninitializedArray(Class, int) line: 1387
    java.lang.StringConcatHelper.newArray(long) line: 458
    java.lang.invoke.DirectMethodHandle$Holder.invokeStatic(Object, long)
    java.lang.invoke.LambdaForm$MH.2109640190.invoke(Object, int, Object)
    java.lang.invoke.Invokers$Holder.linkToTargetMethod(int, Object, Object)
    ...
  ]
}
```

#### TENURING DISTRIBUTION

```
jdk.TenuringDistribution {
  startTime = 12:24:20.360
  gcId = 132
  age = 3
  size = 0 bytes
}
```

#### YOUNG GARBAGE COLLECTION

```
jdk.GCPhasePause {
  startTime = 23:51:39.260
  duration = 48.4 ms
  gcId = 43
  name = "GC Pause"
}


jdk.GarbageCollection {
  startTime = 23:51:39.260
  duration = 48.4 ms
  gcId = 43
  name = "G1New"
  cause = "G1 Evacuation Pause"
  sumOfPauses = 48.4 ms
  longestPause = 48.4 ms
}


jdk.YoungGarbageCollection {
  startTime = 23:51:39.260
  duration = 48.4 ms
  gcId = 43
  tenuringThreshold = 15
}


jdk.G1GarbageCollection {
  startTime = 23:51:39.260
  duration = 48.4 ms
  gcId = 43
  type = "Normal"
}
```

#### OLD GARBAGE COLLECTION

```
jdk.GarbageCollection {
  startTime = 00:04:46.908
  duration = 431 ms
  gcId = 180
  name = "G1Old"
  cause = "G1 Evacuation Pause"
  sumOfPauses = 0 s
  longestPause = 0 s
}


jdk.OldGarbageCollection {
  startTime = 00:04:46.908
  duration = 431 ms
  gcId = 180
}
```

#### FULL GARBAGE COLLECTION

```
jdk.GCPhasePause {
  startTime = 23:56:17.629
  duration = 218 ms
  gcId = 382
  name = "GC Pause"
}


jdk.GarbageCollection {
  startTime = 23:56:17.629
  duration = 218 ms
  gcId = 382
  name = "G1Full"
  cause = "G1 Evacuation Pause"
  sumOfPauses = 218 ms
  longestPause = 218 ms
}
```

#### GC PHASE PARALLEL

```
jdk.GCPhaseParallel {
  startTime = 12:35:59.262
  duration = 1.82 ms
  gcId = 172
  gcWorkerId = 5
  name = "ObjCopy"
  eventThread = "GC Thread#0" (osThreadId = 26694)
}


jdk.GCPhaseParallel {
  startTime = 12:35:59.260
  duration = 5.31 ms
  gcId = 172
  gcWorkerId = 6
  name = "ScanHR"
}

jdk.GCPhaseParallel {
  startTime = 12:35:59.264
  duration = 1.32 ms
  gcId = 172
  gcWorkerId = 5
  name = "Termination"
  eventThread = "GC Thread#0" (osThreadId = 26694)
}

jdk.GCPhaseParallel {
  startTime = 12:35:59.265
  duration = 0.000330 ms
  gcId = 172
  gcWorkerId = 2
  name = "RedirtyCards"
}

jdk.GCPhaseParallel {
  startTime = 12:35:59.265
  duration = 0.00296 ms
  gcId = 172
  gcWorkerId = 1
  name = "NonYoungFreeCSet"
}

jdk.GCPhaseParallel {
  startTime = 12:35:59.265
  duration = 0.00189 ms
  gcId = 172
  gcWorkerId = 3
  name = "YoungFreeCSet"
}
```