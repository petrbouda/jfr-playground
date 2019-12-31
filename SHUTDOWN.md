# SHUTDOWN

- `System.exit(1)`

```
jdk.Shutdown {
  startTime = 11:27:06.295
  reason = "Shutdown requested from Java"
  eventThread = "main" (javaThreadId = 1)
  stackTrace = [
    java.lang.Shutdown.beforeHalt()
    java.lang.Shutdown.exit(int) line: 173
    java.lang.Runtime.exit(int) line: 114
    java.lang.System.exit(int) line: 1783
    pbouda.jfr.Shutdown.main(String[]) line: 8
    ...
  ]
}
```

- `SIGKINT` - interrupt

```
jdk.Shutdown {
  startTime = 11:35:54.311
  reason = "Shutdown requested from Java"
  eventThread = "SIGINT handler" (javaThreadId = 22)
  stackTrace = [
    java.lang.Shutdown.beforeHalt()
    java.lang.Shutdown.exit(int) line: 173
    java.lang.Terminator$1.handle(Signal) line: 51
    jdk.internal.misc.Signal$1.run() line: 220
    java.lang.Thread.run() line: 832
    ...
  ]
}
```

#### Linux Signals

```
SIGINT is the interrupt signal. The terminal sends it to the foreground 
process when the user presses ctrl-c. The default behavior is to terminate 
the process, but it can be caught or ignored. The intention is to provide 
a mechanism for an orderly, graceful shutdown.

SIGQUIT is the dump core signal. The terminal sends it to the foreground 
process when the user presses ctrl-\. The default behavior is to terminate 
the process and dump core, but it can be caught or ignored. The intention 
is to provide a mechanism for the user to abort the process. You can look 
at SIGINT as "user-initiated happy termination" and SIGQUIT as 
"user-initiated unhappy termination."

SIGTERM is the termination signal. The default behavior is to terminate 
the process, but it also can be caught or ignored. The intention is to 
kill the process, gracefully or not, but to first allow it a chance to 
cleanup.

SIGKILL is the kill signal. The only behavior is to kill the process, 
immediately. As the process cannot catch the signal, it cannot cleanup, 
and thus this is a signal of last resort.

SIGSTOP is the pause signal. The only behavior is to pause the process; 
the signal cannot be caught or ignored. The shell uses pausing (and its 
counterpart, resuming via SIGCONT) to implement job control.
```