# NATIVE

#### NATIVE_METHOD_SAMPLE

- `#period: 20 ms`
- `ctrl-break` just waits on read operation 

```
jdk.NativeMethodSample {
  startTime = 16:02:33.251
  sampledThread = "Monitor Ctrl-Break" (javaThreadId = 12)
  state = "STATE_RUNNABLE"
  stackTrace = [
    sun.nio.ch.SocketDispatcher.read0(FileDescriptor, long, int) line: 0
    sun.nio.ch.SocketDispatcher.read(FileDescriptor, long, int) line: 0
    sun.nio.ch.NioSocketImpl.tryRead(FileDescriptor, byte[], int, int) line: 0
    sun.nio.ch.NioSocketImpl.implRead(byte[], int, int) line: 0
    sun.nio.ch.NioSocketImpl.read(byte[], int, int) line: 0
    ...
  ]
}


jdk.NativeMethodSample {
  startTime = 16:02:33.304
  sampledThread = "main" (javaThreadId = 1)
  state = "STATE_RUNNABLE"
  stackTrace = [
    sun.nio.ch.FileDispatcherImpl.read0(FileDescriptor, long, int) line: 0
    sun.nio.ch.FileDispatcherImpl.read(FileDescriptor, long, int) line: 0
    sun.nio.ch.IOUtil.readIntoNativeBuffer(FileDescriptor, ByteBuffer, long, boolean, int, NativeDispatcher) line: 0
    sun.nio.ch.IOUtil.read(FileDescriptor, ByteBuffer, long, boolean, int, NativeDispatcher) line: 0
    sun.nio.ch.FileChannelImpl.read(ByteBuffer) line: 0
    ...
  ]
}
```

#### NATIVE_LIBRARY

```
jdk.NativeLibrary {
  startTime = 16:05:56.569
  name = "13502329"
  baseAddress = 0x00400000
  topAddress = 0x00401000
}


jdk.NativeLibrary {
  startTime = 16:05:56.569
  name = "13502329"
  baseAddress = 0x00401000
  topAddress = 0x00402000
}

...
```