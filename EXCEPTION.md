# EXCEPTION

#### JAVA_EXCEPTION_STATISTICS

- `#period: 1000 ms`

```
jdk.ExceptionStatistics {
  startTime = 15:56:23.646
  throwables = 11
  eventThread = "JFR Periodic Tasks" (javaThreadId = 16)
}
```

#### JAVA_EXCEPTION_THROW

- by default `disabled`

```
jdk.JavaExceptionThrow {
  startTime = 15:56:23.949
  message = "My Exception"
  thrownClass = java.lang.Exception (classLoader = bootstrap)
  eventThread = "main" (javaThreadId = 1)
  stackTrace = [
    java.lang.Throwable.<init>(String) line: 274
    java.lang.Exception.<init>(String) line: 67
    pbouda.jfr.Exceptions.main(String[]) line: 10
  ]
}
```

#### JAVA_ERROR_THROW

- by default `enabled`

```
jdk.JavaErrorThrow {
  startTime = 15:58:31.383
  message = "My Error"
  thrownClass = java.lang.Error (classLoader = bootstrap)
  eventThread = "main" (javaThreadId = 1)
  stackTrace = [
    java.lang.Error.<init>(String) line: 72
    pbouda.jfr.Exceptions.main(String[]) line: 10
  ]
}
```