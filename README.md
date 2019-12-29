# Streaming JFR (Java Flight Recorder)
 
Settings shipped with JDK:
- [default](default-jre.txt) 
    - Low overhead configuration safe for continuous use in production environments, typically less than 1 % overhead.
- [profile](profile-jre.txt) 
    - Low overhead configuration for profiling, typically around 2 % overhead.

#### CPU 

- `jdk.CPULoad`
- execution: `#period: beginChunk`

```
jdk.CPULoad {
  startTime = 00:05:56.420
  jvmUser = 10.64%
  jvmSystem = 0.49%
  machineTotal = 20.78%
}
```

#### SYSTEM_INFORMATION

- `jdk.OSInformation`
- execution: `#period: beginChunk`

```
jdk.OSInformation {
  startTime = 23:50:58.983
  osVersion = "DISTRIB_ID=LinuxMint
DISTRIB_RELEASE=19.3
DISTRIB_CODENAME=tricia
DISTRIB_DESCRIPTION="Linux Mint 19.3 Tricia"
uname:Linux 5.0.0-37-generic #40~18.04.1-Ubuntu SMP Thu Nov 14 12:06:39 UTC 2019 x86_64
libc:glibc 2.27 NPTL 2.27 
"
}
```

#### VIRTUALIZATION_INFORMATION

- `jdk.VirtualizationInformation`
- execution: `#period: beginChunk`

```
jdk.VirtualizationInformation {
  startTime = 23:54:29.158
  name = "No virtualization detected"
}
```

#### CPU_INFORMATION

- `jdk.CPUInformation`
- execution: `#period: beginChunk`

```
jdk.CPUInformation {
  startTime = 23:52:20.278
  cpu = "Intel (null) (HT) SSE SSE2 SSE3 SSSE3 SSE4.1 SSE4.2 Core Intel64"
  description = "Brand: Intel(R) Core(TM) i5-8250U CPU @ 1.60GHz, Vendor: GenuineIntel
Family: <unknown> (0x6), Model: <unknown> (0x8e), Stepping: 0xa
Ext. family: 0x0, Ext. model: 0x8, Type: 0x0, Signature: 0x000806ea
Features: ebx: 0x04100800, ecx: 0x7ffafbbf, edx: 0xbfebfbff
Ext. features: eax: 0x00000000, ebx: 0x00000000, ecx: 0x00000121, edx: 0x2c100800
Supports: On-Chip FPU, Virtual Mode Extensions, Debugging Extensions, Page Size Extensions, Time Stamp Counter, Model Specific Registers, Physical Address Extension, Machine Check Exceptions, CMPXCHG8B Instruction, On-Chip APIC, Fast System Call, Memory Type Range Registers, Page Global Enable, Machine Check Architecture, Conditional Mov Instruction, Page Attribute Table, 36-bit Page Size Extension, CLFLUSH Instruction, Debug Trace Store feature, ACPI registers in MSR space, Intel Architecture MMX Technology, Fast Float Point Save and Restore, Streaming SIMD extensions, Streaming SIMD extensions 2, Self-Snoop, Hyper Threading, Thermal Monitor, Streaming SIMD Extensions 3, PCLMULQDQ, 64-bit DS Area, MONITOR/MWAIT instructions, CPL Qualified Debug Store, Virtual Machine Extensions, Enhanced Intel SpeedStep technology, Thermal Monitor 2, Supplemental Streaming SIMD Extensions 3, Fused Multiply-Add, CMPXCHG16B, xTPR Update Control, Perfmon and Debug Capability, Process-context identifiers, Streaming SIMD extensions 4.1, Streaming SIMD extensions 4.2, x2APIC, MOVBE, Popcount instruction, TSC-Deadline, AESNI, XSAVE, OSXSAVE, AVX, F16C, LAHF/SAHF instruction support, Advanced Bit Manipulations: LZCNT, SYSCALL/SYSRET, Execute Disable Bit, RDTSCP, Intel 64 Architecture, Invariant TSC"
  sockets = 1
  cores = 4
  hwThreads = 8
}
```

#### CPU_TIMESTAMP_COUNTER

- `jdk.CPUTimeStampCounter`
- execution: `#period: beginChunk`

```
jdk.CPUTimeStampCounter {
  startTime = 00:00:41.481
  fastTimeEnabled = true
  fastTimeAutoEnabled = true
  osFrequency = 1000000000 Hz
  fastTimeFrequency = 1600000000 Hz
}
```

#### JVM_INFORMATION

- `jdk.JVMInformation`
- execution: `#period: beginChunk`

```
jdk.JVMInformation {
  startTime = 22:41:27.680
  jvmName = "OpenJDK 64-Bit Server VM"
  jvmVersion = "OpenJDK 64-Bit Server VM (14-ea+28-1366) for linux-amd64 JRE (14-ea+28-1366), built on Dec 18 2019 20:09:37 by "mach5one" with gcc 8.3.0"
  jvmArguments = "-Dvisualvm.id=257396015513599 -javaagent:/home/pbouda/.local/share/JetBrains/Toolbox/apps/IDEA-U/ch-0/193.5662.31/lib/idea_rt.jar=39229:/home/pbouda/.local/share/JetBrains/Toolbox/apps/IDEA-U/ch-0/193.5662.31/bin -Dfile.encoding=UTF-8"
  jvmFlags = N/A
  javaArguments = "pbouda.jfr.Jfr"
  jvmStartTime = 22:41:26.876
  pid = 20919
}
```

#### INITIAL_SYSTEM_PROPERTY

- `jdk.InitialSystemProperty`
- execution: `#period: beginChunk`

```
jdk.InitialSystemProperty {
  startTime = 22:42:50.913
  key = "java.vm.specification.name"
  value = "Java Virtual Machine Specification"
}


jdk.InitialSystemProperty {
  startTime = 22:42:50.913
  key = "java.vm.version"
  value = "14-ea+28-1366"
}


jdk.InitialSystemProperty {
  startTime = 22:42:50.913
  key = "java.vm.name"
  value = "OpenJDK 64-Bit Server VM"
}

...
```

#### INITIAL_ENVIRONMENT_PROPERTY

- `jdk.InitialEnvironmentVariable`
- execution: `#period: beginChunk`

```
jdk.InitialEnvironmentVariable {
  startTime = 23:56:45.069
  key = "LANGUAGE"
  value = "en_US"
}


jdk.InitialEnvironmentVariable {
  startTime = 23:56:45.069
  key = "GJS_DEBUG_TOPICS"
  value = "JS ERROR;JS LOG"
}

...
```

#### EXECUTE_VM_OPERATION

- `jdk.ExecuteVMOperation`
- execution: `#threshold: 0ms`
- catch all VM operations

```
jdk.ExecuteVMOperation {
  startTime = 23:13:43.190
  duration = 2.97 ms
  operation = "G1TryInitiateConcMark"
  safepoint = true
  blocking = true
  caller = "allocator-0" (javaThreadId = 15)
  safepointId = 14
}
```


#### EXECUTION_SAMPLE

- `jdk.ExecutionSample`
- execution: `#period: 10 ms` (every 10 ms)

```
jdk.ExecutionSample {
  startTime = 22:59:28.082
  sampledThread = "main" (javaThreadId = 1)
  state = "STATE_RUNNABLE"
  stackTrace = [
    java.io.FileOutputStream.write(byte[], int, int) line: 0
    java.io.BufferedOutputStream.flushBuffer() line: 0
    java.io.BufferedOutputStream.flush() line: 0
    java.io.PrintStream.write(byte[], int, int) line: 0
    sun.nio.cs.StreamEncoder.writeBytes() line: 0
    ...
  ]
}
```