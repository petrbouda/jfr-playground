#### HEAP REGIONS

- type of the region changed
- after the evacuation OLD Region change to FREE Region

```
jdk.G1HeapRegionTypeChange {
  startTime = 12:27:05.633
  index = 224
  from = "Old"
  to = "Free"
  start = 0xFE000000
  used = 0 bytes
}
```

- FREE Region changed to EDEN type

```
jdk.G1HeapRegionTypeChange {
  startTime = 12:27:07.590
  index = 246
  from = "Free"
  to = "Eden"
  start = 0xFF600000
  used = 0 bytes
}
```

#### HEAP REGION INFORMATION

```
jdk.G1HeapRegionInformation {
  startTime = 12:30:33.773
  index = 70
  type = "Old"
  start = 0xF4600000
  used = 1024.0 kB
}


jdk.G1HeapRegionInformation {
  startTime = 12:30:33.773
  index = 71
  type = "Free"
  start = 0xF4700000
  used = 0 bytes
}


jdk.G1HeapRegionInformation {
  startTime = 12:30:33.773
  index = 254
  type = "OpenArchive"
  start = 0xFFE00000
  used = 328.0 kB
}


jdk.G1HeapRegionInformation {
  startTime = 12:30:33.773
  index = 255
  type = "ClosedArchive"
  start = 0xFFF00000
  used = 504.0 kB
}
```