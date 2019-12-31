# FILE

#### FILE_FORCE

- NOT REPRODUCED
- Description: `force updates to be written to file`

```
jdk.FileForce#enabled: true
jdk.FileForce#stackTrace: true
jdk.FileForce#threshold: 10 ms
```

#### FILE_READ

- only one emitted event
- `ChannelInputStream` automatically allocate `HeapByteBuffer` with capacity for an entire file
- therefore, we need only one READ operation 

```
jdk.FileRead {
  startTime = 14:59:55.873
  duration = 969 ms
  path = "/home/pbouda/movie.avi"
  bytesRead = 1.1 GB
  endOfFile = false
  eventThread = "main" (javaThreadId = 1)
  stackTrace = [
    sun.nio.ch.FileChannelImpl.read(ByteBuffer) line: 83
    sun.nio.ch.ChannelInputStream.read(ReadableByteChannel, ByteBuffer, boolean) line: 65
    sun.nio.ch.ChannelInputStream.read(ByteBuffer) line: 107
    sun.nio.ch.ChannelInputStream.read(byte[], int, int) line: 101
    java.nio.file.Files.read(InputStream, int) line: 3228
    ...
  ]
}
```

#### FILE_WRITE

- one file is written using multiple events
- every event takes `0.167 ms` and writes `8.0 kB` (buffer size)

```
...

jdk.FileWrite {
  startTime = 15:08:53.932
  duration = 0.194 ms
  path = "/home/pbouda/movie-copy.avi"
  bytesWritten = 8.0 kB
  eventThread = "main" (javaThreadId = 1)
  stackTrace = [
    sun.nio.ch.FileChannelImpl.write(ByteBuffer) line: 151
    java.nio.channels.Channels.writeFullyImpl(WritableByteChannel, ByteBuffer) line: 74
    java.nio.channels.Channels.writeFully(WritableByteChannel, ByteBuffer) line: 97
    java.nio.channels.Channels$1.write(byte[], int, int) line: 172
    java.nio.file.Files.write(Path, byte[], OpenOption[]) line: 3494
    ...
  ]
}


jdk.FileWrite {
  startTime = 15:08:53.932
  duration = 0.194 ms
  path = "/home/pbouda/movie-copy.avi"
  bytesWritten = 8.0 kB
  eventThread = "main" (javaThreadId = 1)
  stackTrace = [
    sun.nio.ch.FileChannelImpl.write(ByteBuffer) line: 151
    java.nio.channels.Channels.writeFullyImpl(WritableByteChannel, ByteBuffer) line: 74
    java.nio.channels.Channels.writeFully(WritableByteChannel, ByteBuffer) line: 97
    java.nio.channels.Channels$1.write(byte[], int, int) line: 172
    java.nio.file.Files.write(Path, byte[], OpenOption[]) line: 3494
    ...
  ]
}


jdk.FileWrite {
  startTime = 15:08:53.932
  duration = 0.194 ms
  path = "/home/pbouda/movie-copy.avi"
  bytesWritten = 6.1 kB
  eventThread = "main" (javaThreadId = 1)
  stackTrace = [
    sun.nio.ch.FileChannelImpl.write(ByteBuffer) line: 151
    java.nio.channels.Channels.writeFullyImpl(WritableByteChannel, ByteBuffer) line: 74
    java.nio.channels.Channels.writeFully(WritableByteChannel, ByteBuffer) line: 97
    java.nio.channels.Channels$1.write(byte[], int, int) line: 172
    java.nio.file.Files.write(Path, byte[], OpenOption[]) line: 3494
    ...
  ]
}
```