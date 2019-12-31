# EXECUTE_VM_OPERATION

- `threshold: 0 ms`
- useful if you want to log only long running VM Operations

```
jdk.ExecuteVMOperation {
  startTime = 11:19:38.029
  duration = 0.00209 ms
  operation = "JFROldObject"
  safepoint = true
  blocking = true
  caller = "jfr-0" (javaThreadId = 14)
  safepointId = 18
  eventThread = "VM Thread" (osThreadId = 19742)
}


jdk.ExecuteVMOperation {
  startTime = 11:19:38.049
  duration = 37.4 ms
  operation = "GenCollectForAllocation"
  safepoint = true
  blocking = true
  caller = "pool-1-thread-1" (javaThreadId = 15)
  safepointId = 19
  eventThread = "VM Thread" (osThreadId = 19742)
}


jdk.ExecuteVMOperation {
  startTime = 11:19:38.098
  duration = 4.18 ms
  operation = "RedefineClasses"
  safepoint = true
  blocking = true
  caller = "jfr-0" (javaThreadId = 14)
  safepointId = 20
  eventThread = "VM Thread" (osThreadId = 19742)
}


jdk.ExecuteVMOperation {
  startTime = 11:19:38.109
  duration = 131 ms
  operation = "GenCollectForAllocation"
  safepoint = true
  blocking = true
  caller = "pool-1-thread-3" (javaThreadId = 17)
  safepointId = 21
  eventThread = "VM Thread" (osThreadId = 19742)
}


jdk.ExecuteVMOperation {
  startTime = 11:19:38.246
  duration = 0.111 ms
  operation = "ClassLoaderStatsOperation"
  safepoint = true
  blocking = true
  caller = "jfr-0" (javaThreadId = 14)
  safepointId = 22
  eventThread = "VM Thread" (osThreadId = 19742)
}

...

jdk.ExecuteVMOperation {
  startTime = 11:19:41.891
  duration = 176 ms
  operation = "GenCollectForAllocation"
  safepoint = true
  blocking = true
  caller = "pool-1-thread-1" (javaThreadId = 15)
  safepointId = 53
  eventThread = "VM Thread" (osThreadId = 19742)
}


jdk.ExecuteVMOperation {
  startTime = 11:19:42.067
  duration = 0.122 ms
  operation = "ClassLoaderStatsOperation"
  safepoint = true
  blocking = true
  caller = "JFR: Shutdown Hook" (javaThreadId = 23)
  safepointId = 54
  eventThread = "VM Thread" (osThreadId = 19742)
}

```