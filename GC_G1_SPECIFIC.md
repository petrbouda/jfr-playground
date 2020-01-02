# G1_SPECIFIC

```
jdk.G1EvacuationYoungStatistics {
  startTime = 11:02:49.668
  statistics = {
    gcId = 146
    allocated = 2.0 MB
    wasted = 800 bytes
    used = 2.0 MB
    undoWaste = 0 bytes
    regionEndWaste = 0 bytes
    regionsRefilled = 2 bytes
    directAllocated = 0 bytes
    failureUsed = 0 bytes
    failureWaste = 0 bytes
  }
}


jdk.G1EvacuationOldStatistics {
  startTime = 11:02:49.668
  statistics = {
    gcId = 146
    allocated = 5.8 MB
    wasted = 1.0 kB
    used = 5.8 MB
    undoWaste = 0 bytes
    regionEndWaste = 21.0 kB
    regionsRefilled = 7 bytes
    directAllocated = 220.5 kB
    failureUsed = 3.9 MB
    failureWaste = 6.1 MB
  }
}


jdk.G1MMU {
  startTime = 11:02:49.668
  gcId = 146
  timeSlice = 201 ms
  gcTime = 66.0 ms
  pauseTarget = 200 ms
}
```

#### G1 SPECIFIC EVENTS

```
jdk.G1GarbageCollection {
  startTime = 00:06:26.297
  duration = 8.54 ms
  gcId = 206
  type = "During Mark"
}


jdk.G1GarbageCollection {
  startTime = 00:06:26.547
  duration = 19.1 ms
  gcId = 208
  type = "Normal"
}


jdk.G1GarbageCollection {
  startTime = 00:06:26.572
  duration = 11.2 ms
  gcId = 209
  type = "Initial Mark"
}

```

#### CONCURRENT_MODE_FAILURE

```
jdk.ConcurrentModeFailure {
  startTime = 12:21:08.568
  gcId = 267
}
```