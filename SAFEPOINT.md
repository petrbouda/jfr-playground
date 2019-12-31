# SAFEPOINT

#### SAFEPOINT_START AND SAFEPOINT_END

- `#threshold: 0 ms`

```
jdk.SafepointBegin {
  startTime = 11:09:07.380
  duration = 0.117 ms
  safepointId = 25
  totalThreadCount = 22
  jniCriticalThreadCount = 0
  eventThread = "VM Thread" (osThreadId = 18787)
}


jdk.SafepointEnd {
  startTime = 11:09:07.380
  duration = 0.0125 ms
  safepointId = 25
  eventThread = "VM Thread" (osThreadId = 18787)
}


jdk.SafepointBegin {
  startTime = 11:09:07.398
  duration = 0.130 ms
  safepointId = 26
  totalThreadCount = 22
  jniCriticalThreadCount = 0
  eventThread = "VM Thread" (osThreadId = 18787)
}


jdk.SafepointEnd {
  startTime = 11:09:07.548
  duration = 0.0216 ms
  safepointId = 26
  eventThread = "VM Thread" (osThreadId = 18787)
}

...
```

#### SAFEPOINT_STATE_SYNCHRONIZATION

```
jdk.SafepointStateSynchronization {
  startTime = 11:12:40.809
  duration = 0.0832 ms
  safepointId = 19
  initialThreadCount = 5
  runningThreadCount = 0
  iterations = 3
  eventThread = "VM Thread" (osThreadId = 19116)
}
```

#### SAFEPOINT_CLEANUP AND SAFEPOINT_CLEANUP_TASK

```
jdk.SafepointCleanupTask {
  startTime = 11:14:21.358
  duration = 0.000171 ms
  safepointId = 71
  name = "deflating global idle monitors"
  eventThread = "VM Thread" (osThreadId = 19278)
}


jdk.SafepointCleanupTask {
  startTime = 11:14:21.358
  duration = 0.000239 ms
  safepointId = 71
  name = "updating inline caches"
  eventThread = "VM Thread" (osThreadId = 19278)
}


jdk.SafepointCleanupTask {
  startTime = 11:14:21.358
  duration = 0.000220 ms
  safepointId = 71
  name = "compilation policy safepoint handler"
  eventThread = "VM Thread" (osThreadId = 19278)
}


jdk.SafepointCleanup {
  startTime = 11:14:21.358
  duration = 0.0222 ms
  safepointId = 71
  eventThread = "VM Thread" (osThreadId = 19278)
}
``` 