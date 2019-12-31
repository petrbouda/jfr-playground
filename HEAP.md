# HEAP

```
jdk.GCHeapSummary#enabled: true
jdk.PSHeapSummary#enabled: true
jdk.G1HeapSummary#enabled: true
```

#### HEAP_SUMMARY

```
jdk.GCHeapSummary {
  startTime = 12:13:47.734
  gcId = 15
  when = "Before GC"
  heapSpace = {
    start = 0xC0000000
    committedEnd = 0xE8200000
    committedSize = 642.0 MB
    reservedEnd = 0x100000000
    reservedSize = 1.0 GB
  }
  heapUsed = 427.8 MB
}


jdk.GCHeapSummary {
  startTime = 12:13:47.771
  gcId = 15
  when = "After GC"
  heapSpace = {
    start = 0xC0000000
    committedEnd = 0xEE300000
    committedSize = 739.0 MB
    reservedEnd = 0x100000000
    reservedSize = 1.0 GB
  }
  heapUsed = 332.8 MB
}
```

#### G1_HEAP_SUMMARY

```
jdk.G1HeapSummary {
  startTime = 12:13:47.734
  gcId = 15
  when = "Before GC"
  edenUsedSize = 151.0 MB
  edenTotalSize = 152.0 MB
  survivorUsedSize = 24.0 MB
  numberOfRegions = 642
}


jdk.G1HeapSummary {
  startTime = 12:13:47.771
  gcId = 15
  when = "After GC"
  edenUsedSize = 0 bytes
  edenTotalSize = 163.0 MB
  survivorUsedSize = 22.0 MB
  numberOfRegions = 739
}
```