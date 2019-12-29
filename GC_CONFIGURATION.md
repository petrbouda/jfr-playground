# GARBAGE_COLLECTION

### Configuration

- `jdk.GCConfiguration`
- `jdk.GCHeapConfiguration`
- `jdk.YoungGenerationConfiguration`
- `jdk.GCTLABConfiguration`
- `jdk.GCSurvivorConfiguration`
- execution: `#period: beginChunk`

```
jdk.GCConfiguration {
  startTime = 23:38:17.951
  youngCollector = "G1New"
  oldCollector = "G1Old"
  parallelGCThreads = 8
  concurrentGCThreads = 2
  usesDynamicGCThreads = true
  isExplicitGCConcurrent = false
  isExplicitGCDisabled = false
  pauseTarget = N/A
  gcTimeRatio = 12
}


jdk.GCSurvivorConfiguration {
  startTime = 23:38:17.951
  maxTenuringThreshold = 15
  initialTenuringThreshold = 7
}


jdk.GCTLABConfiguration {
  startTime = 23:38:17.951
  usesTLABs = true
  minTLABSize = 2.0 kB
  tlabRefillWasteLimit = 64 bytes
}


jdk.GCHeapConfiguration {
  startTime = 23:38:17.951
  minSize = 8.0 MB
  maxSize = 4.8 GB
  initialSize = 310.0 MB
  usesCompressedOops = true
  compressedOopsMode = "Zero based"
  objectAlignment = 8 bytes
  heapAddressBits = 32
}


jdk.YoungGenerationConfiguration {
  startTime = 23:38:17.951
  minSize = 1.3 MB
  maxSize = 2.9 GB
  newRatio = 2
}
```