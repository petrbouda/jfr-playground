# METASPACE

#### Metaspace Information

```
Metaspace itself is not garbage-collected. But the java heap is. When java.lang.Class 
objects get collected the underlying metadata gets freed too. So in most circumstances 
regular GC cycles will also free up metaspace if there are any classes that are eligible 
for unloading.
```

```
As predicting the need for metadata was a complex and inconvenient exercise, 
the Permanent Generation was removed in Java 8 in favor of the Metaspace. 
From this point on, most of the miscellaneous things were moved to regular 
Java heap.

The class definitions, however, are now loaded into something called Metaspace. 
It is located in the native memory and does not interfere with the regular heap 
objects. By default, Metaspace size is only limited by the amount of native 
memory available to the Java process. This saves developers from a situation 
when adding just one more class to the application results in the 
java.lang.OutOfMemoryError: Permgen space. Notice that having such seemingly 
unlimited space does not ship without costs – letting the Metaspace to grow 
uncontrollably you can introduce heavy swapping and/or reach native allocation 
failures instead.

In case you still wish to protect yourself for such occasions you can limit the 
growth of Metaspace similar to following, limiting Metaspace size to 256 MB:

java -XX:MaxMetaspaceSize=256m com.mycompany.MyApplication
```

#### Metaspace Options

```
jdk.MetaspaceSummary#enabled: true
jdk.MetaspaceGCThreshold#enabled: true
jdk.MetaspaceAllocationFailure#enabled: true
jdk.MetaspaceAllocationFailure#stackTrace: true
jdk.MetaspaceOOM#enabled: true
jdk.MetaspaceOOM#stackTrace: true
jdk.MetaspaceChunkFreeListSummary#enabled: true
```

#### METASPACE_SUMMARY

- after every GC

```
jdk.MetaspaceSummary {
  startTime = 11:59:06.231
  gcId = 17
  when = "Before GC"
  gcThreshold = 20.8 MB
  metaspace = {
    committed = 5.1 MB
    used = 4.4 MB
    reserved = 1.0 GB
  }
  dataSpace = {
    committed = 4.5 MB
    used = 4.0 MB
    reserved = 8.0 MB
  }
  classSpace = {
    committed = 640.0 kB
    used = 477.5 kB
    reserved = 1.0 GB
  }
}


jdk.MetaspaceSummary {
  startTime = 11:59:06.368
  gcId = 17
  when = "After GC"
  gcThreshold = 20.8 MB
  metaspace = {
    committed = 5.1 MB
    used = 4.4 MB
    reserved = 1.0 GB
  }
  dataSpace = {
    committed = 4.5 MB
    used = 4.0 MB
    reserved = 8.0 MB
  }
  classSpace = {
    committed = 640.0 kB
    used = 477.5 kB
    reserved = 1.0 GB
  }
}
```

#### METASPACE_CHUNK_FREE_LIST_SUMMARY

```
jdk.MetaspaceChunkFreeListSummary {
  startTime = 12:07:17.168
  gcId = 15
  when = "Before GC"
  metadataType = "Metadata"
  specializedChunks = 0
  specializedChunksTotalSize = 0 bytes
  smallChunks = 0
  smallChunksTotalSize = 0 bytes
  mediumChunks = 0
  mediumChunksTotalSize = 0 bytes
  humongousChunks = 0
  humongousChunksTotalSize = 0 bytes
}

jdk.MetaspaceChunkFreeListSummary {
  startTime = 12:07:17.273
  gcId = 15
  when = "After GC"
  metadataType = "Metadata"
  specializedChunks = 0
  specializedChunksTotalSize = 0 bytes
  smallChunks = 0
  smallChunksTotalSize = 0 bytes
  mediumChunks = 0
  mediumChunksTotalSize = 0 bytes
  humongousChunks = 0
  humongousChunksTotalSize = 0 bytes
}
```