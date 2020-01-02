# ZGC

- `jdk.ZPageAllocation` could not reproduce

```
jdk.ZStatisticsSampler {
  startTime = 12:49:56.808
  duration = 0.000011 ms
  id = "Allocation Stall"
  value = 216019
  eventThread = "pool-1-thread-4" (javaThreadId = 18)
}
```

```
jdk.ZStatisticsCounter {
  startTime = 12:52:28.279
  duration = 0.000046 ms
  id = "Page Cache Hit L1"
  increment = 1
  value = 58
  eventThread = "pool-1-thread-2" (javaThreadId = 16)
}


jdk.ZStatisticsCounter {
  startTime = 12:52:28.279
  duration = 0.000008 ms
  id = "Allocation Rate"
  increment = 2097152
  value = 113246208
  eventThread = "pool-1-thread-2" (javaThreadId = 16)
}


jdk.ZStatisticsCounter {
  startTime = 12:52:28.279
  duration = 0.000009 ms
  id = "Undo Page Allocation"
  increment = 1
  value = 15
  eventThread = "pool-1-thread-2" (javaThreadId = 16)
}

...
```

```
jdk.ZThreadPhase {
  startTime = 12:55:16.122
  duration = 0.000799 ms
  gcId = 7
  name = "Pause Roots Setup"
}


jdk.ZThreadPhase {
  startTime = 12:55:16.122
  duration = 0.000309 ms
  gcId = 7
  name = "Pause Roots ObjectSynchronizer"
}


jdk.ZThreadPhase {
  startTime = 12:55:16.122
  duration = 0.00219 ms
  gcId = 7
  name = "Pause Roots Universe"
  eventThread = "ZWorker#0" (osThreadId = 29358)
}


jdk.ZThreadPhase {
  startTime = 12:55:16.122
  duration = 0.00103 ms
  gcId = 7
  name = "Pause Roots Management"
}


jdk.ZThreadPhase {
  startTime = 12:55:16.122
  duration = 0.00126 ms
  gcId = 7
  name = "Pause Roots JVMTIExport"
}


jdk.ZThreadPhase {
  startTime = 12:55:16.122
  duration = 0.0155 ms
  gcId = 7
  name = "Pause Roots SystemDictionary"
}


jdk.ZThreadPhase {
  startTime = 12:55:16.122
  duration = 1.34 ms
  gcId = 7
  name = "Pause Roots Threads"
  eventThread = "ZWorker#0" (osThreadId = 29358)
}


jdk.ZThreadPhase {
  startTime = 12:55:16.124
  duration = 0.00178 ms
  gcId = 7
  name = "Pause Roots JVMTIWeakExport"
  eventThread = "ZWorker#0" (osThreadId = 29358)
}


jdk.ZThreadPhase {
  startTime = 12:55:16.122
  duration = 1.37 ms
  gcId = 7
  name = "Pause Roots"
  eventThread = "ZWorker#0" (osThreadId = 29358)
}


jdk.ZThreadPhase {
  startTime = 12:55:16.122
  duration = 1.56 ms
  gcId = 7
  name = "Pause Roots Threads"
}


jdk.ZThreadPhase {
  startTime = 12:55:16.122
  duration = 1.60 ms
  gcId = 7
  name = "Pause Roots"
}


jdk.ZThreadPhase {
  startTime = 12:55:16.124
  duration = 0.00109 ms
  gcId = 7
  name = "Pause Roots Teardown"
}


jdk.ZThreadPhase {
  startTime = 12:55:16.120
  duration = 4.49 ms
  gcId = -1
  name = "Allocation Stall"
  eventThread = "pool-1-thread-4" (javaThreadId = 18)
}

...
```