# JFR_EVENTS

```
jdk.ActiveRecording#enabled: true
jdk.ActiveSetting#enabled: true
jdk.Flush#enabled: true
jdk.Flush#threshold: 0 ns
jdk.FlushStorage#enabled: true
jdk.FlushStorage#threshold: 0 ns
jdk.FlushStacktrace#enabled: true
jdk.FlushStacktrace#threshold: 0 ns
jdk.FlushStringPool#enabled: true
jdk.FlushStringPool#threshold: 0 ns
jdk.FlushMetadata#enabled: true
jdk.FlushMetadata#threshold: 0 ns
jdk.FlushTypeSet#enabled: true
jdk.FlushTypeSet#threshold: 0 ns
jdk.DataLoss#enabled: true
jdk.DumpReason#enabled: true
```

```
jdk.ActiveRecording {
  startTime = 16:19:41.508
  id = 1
  name = "1"
  destination = N/A
  maxAge = 106751991167 d 7 h
  flushInterval = 1.00 s
  maxSize = 0 bytes
  recordingStart = 16:19:41.237
  recordingDuration = 106751991167 d 7 h
  eventThread = "jfr-0" (javaThreadId = 14)
}
```

```
jdk.Flush {
  startTime = 16:19:42.336
  duration = 1.60 ms
  flushId = 1
  elements = 1148
  size = 284.8 kB
}
```


```
jdk.FlushStorage {
  startTime = 16:22:13.454
  duration = 1.55 ms
  flushId = 3
  elements = 21
  size = 263.4 kB
}
```

```
jdk.FlushStacktrace {
  startTime = 16:22:13.455
  duration = 0.218 ms
  flushId = 3
  elements = 9
  size = 938 bytes
}
```

```
jdk.FlushMetadata {
  startTime = 16:23:36.835
  duration = 0.136 ms
  flushId = 1
  elements = 1
  size = 80.5 kB
}
```

```
jdk.FlushTypeSet {
  startTime = 16:23:36.835
  duration = 0.816 ms
  flushId = 1
  elements = 1013
  size = 23.0 kB
}
```