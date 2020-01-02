# COMPILER

- Compiler Configuration
- `jdk.CompilerConfiguration`
- `#period: beginChunk`

```
jdk.CompilerConfiguration {
  startTime = 10:14:15.397
  threadCount = 4
  tieredCompilation = true
}
```

#### COMPILER_STATISTICS

- every 1 seconds (by default)
- `jdk.CompilerStatistics`
- cumulative information 

```
jdk.CompilerStatistics {
  startTime = 10:22:58.986
  compileCount = 1737
  bailoutCount = 9
  invalidatedCount = 0
  osrCompileCount = 11
  standardCompileCount = 1726
  osrBytesCompiled = 0 bytes
  standardBytesCompiled = 0 bytes
  nmethodsSize = 2.9 MB
  nmethodCodeSize = 2.0 MB
  peakTimeSpent = 759 ms
  totalTimeSpent = 8.22 s
}
```

#### COMPILATION

```
jdk.Compilation {
  startTime = 10:31:08.598
  duration = 169 ms
  compileId = 1834
  compiler = "c1"
  method = pbouda.jfr.AllocationStress$Utility.getSample(float, AllocationStress$Contact[])
  compileLevel = 3
  succeded = true
  isOsr = false
  codeSize = 968 bytes
  inlinedBytes = 10 bytes
  eventThread = "C1 CompilerThread0" (javaThreadId = 9)
}
```

#### COMPILER_INLINING

- `message = "force inline by annotation"`
- `message = "already compiled into a big method"`
- `message = "callee is too large"`

```
jdk.CompilerInlining {
  startTime = 10:18:41.347
  compileId = 1394
  caller = java.lang.String.equalsIgnoreCase(String)
  callee = {
    type = "java/lang/String"
    name = "length"
    descriptor = "()I"
  }
  succeeded = true
  message = "inline"
  bci = 14
  eventThread = "C1 CompilerThread0" (javaThreadId = 9)
}
```

#### COMPILATION_FAILURE

```
jdk.CompilationFailure {
  startTime = 10:33:04.033
  failureMessage = "Jvmti state change invalidated dependencies"
  compileId = 1478
  eventThread = "C2 CompilerThread1" (javaThreadId = 7)
}
```

#### COMPILER_PHASE

```
jdk.CompilerPhase {
  startTime = 10:36:32.845
  duration = 0.261 ms
  phase = "PhaseIdealLoop 2"
  compileId = 1369
  phaseLevel = 2
  eventThread = "C2 CompilerThread2" (javaThreadId = 8)
}


jdk.CompilerPhase {
  startTime = 10:36:32.846
  duration = 0.0225 ms
  phase = "Before beautify loops"
  compileId = 1369
  phaseLevel = 3
  eventThread = "C2 CompilerThread2" (javaThreadId = 8)
}


jdk.CompilerPhase {
  startTime = 10:36:32.846
  duration = 0.185 ms
  phase = "PhaseIdealLoop 3"
  compileId = 1369
  phaseLevel = 2
  eventThread = "C2 CompilerThread2" (javaThreadId = 8)
}


jdk.CompilerPhase {
  startTime = 10:36:32.843
  duration = 2.90 ms
  phase = "Final Code"
  compileId = 1316
  phaseLevel = 1
  eventThread = "C2 CompilerThread1" (javaThreadId = 7)
}

...
```

#### DEOPTIMIZATION

```
jdk.Deoptimization {
  startTime = 12:33:57.271
  compileId = 1655
  compiler = "c2"
  method = jdk.jfr.internal.EventWriter.putStackTrace()
  lineNumber = 170
  bci = 7
  instruction = "ifeq"
  reason = "unstable_if"
  action = "reinterpret"
  eventThread = "JFR Periodic Tasks" (javaThreadId = 22)
  stackTrace = [
    jdk.jfr.internal.EventWriter.putStackTrace() line: 170
    jdk.jfr.internal.handlers.EventHandler1872_1577964835419-26342.write(long, long, long)
    jdk.jfr.events.ExceptionStatisticsEvent.commit()
    jdk.jfr.internal.instrument.JDKEvents.emitExceptionStatistics() line: 136
    jdk.jfr.internal.instrument.JDKEvents$$Lambda$37.1361501771.run()
    ...
  ]
}
```