# CODE_CACHE

- https://openjdk.java.net/jeps/197
- Divide the code cache into distinct segments, each of which contains compiled code of a particular type
    - `(-XX:NonMethodCodeHeapSize)` A non-method code heap containing non-method code, such as compiler 
    buffers and bytecode interpreter. This code type will stay in the code cache forever.
    - `(-XX:ProfiledCodeHeapSize)` A profiled code heap containing lightly optimized, profiled methods 
    with a short lifetime.
    - `(-XX:NonMethodCodeHeapSize)` A non-profiled code heap containing fully optimized, non-profiled 
    methods with a potentially long lifetime.
- Code cache sweeper: Now only iterates over the method-code heaps

#### CODE_SWEEPER_CONFIGURATION

- `#period: beginChunk`

```
jdk.CodeSweeperConfiguration {
  startTime = 10:40:38.191
  sweeperEnabled = true
  flushingEnabled = true
}
```

#### CODE_SWEEPER_STATISTICS

- `#period: everyChunk`

```
jdk.CodeSweeperStatistics {
  startTime = 10:48:25.405
  sweepCount = 10
  methodReclaimedCount = 1081
  totalSweepTime = 112 ms
  peakFractionTime = 102 ms
  peakSweepTime = 102 ms
}
```

#### SWEEP_CODE_CACHE

- `#threshold: 100 ms`

```
jdk.SweepCodeCache {
  startTime = 10:50:23.906
  duration = 149 ms
  sweepId = 2
  sweptCount = 1811
  flushedCount = 0
  zombifiedCount = 1096
  eventThread = "Sweeper thread" (javaThreadId = 10)
}
```

#### CODE_CACHE_CONFIGURATION

- `#period: beginChunk`

```
jdk.CodeCacheConfiguration {
  startTime = 10:54:13.401
  initialSize = 2.4 MB
  reservedSize = 240.0 MB
  nonNMethodSize = 5.6 MB
  profiledSize = 117.2 MB
  nonProfiledSize = 117.2 MB
  expansionSize = 64.0 kB
  minBlockLength = 6 bytes
  startAddress = 0x7F62A46FE000
  reservedTopAddress = 0x7F62B36FE000
}
```

#### CODE_CACHE_STATISTICS

- `#period: everyChunk`
- statistics of all 3 types of storage

```
jdk.CodeCacheStatistics {
  startTime = 10:54:13.401
  codeBlobType = "CodeHeap 'non-profiled nmethods'"
  startAddress = 0x7F62AC1C7000
  reservedTopAddress = 0x7F62B36FE000
  entryCount = 510
  methodCount = 510
  adaptorCount = 0
  unallocatedCapacity = 116.6 MB
  fullCount = 0
}


jdk.CodeCacheStatistics {
  startTime = 10:54:13.401
  codeBlobType = "CodeHeap 'profiled nmethods'"
  startAddress = 0x7F62A4C90000
  reservedTopAddress = 0x7F62AC1C7000
  entryCount = 975
  methodCount = 975
  adaptorCount = 0
  unallocatedCapacity = 115.0 MB
  fullCount = 0
}


jdk.CodeCacheStatistics {
  startTime = 10:54:13.401
  codeBlobType = "CodeHeap 'non-nmethods'"
  startAddress = 0x7F62A46FE000
  reservedTopAddress = 0x7F62A4C90000
  entryCount = 964
  methodCount = 0
  adaptorCount = 342
  unallocatedCapacity = 4.4 MB
  fullCount = 0
}
```

#### CODE_CACHE_FULL

- `jdk.CodeCacheFull#enabled: true`
- not reproduced