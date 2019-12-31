# VM_OPTIONS

- VM Options loaded at the startup
- Possibility to handle changes of `Ergonomic` options

```
jdk.IntFlag#enabled: true
jdk.IntFlag#period: beginChunk
jdk.UnsignedIntFlag#enabled: true
jdk.UnsignedIntFlag#period: beginChunk
jdk.LongFlag#enabled: true
jdk.LongFlag#period: beginChunk
jdk.UnsignedLongFlag#enabled: true
jdk.UnsignedLongFlag#period: beginChunk
jdk.DoubleFlag#enabled: true
jdk.DoubleFlag#period: beginChunk
jdk.BooleanFlag#enabled: true
jdk.BooleanFlag#period: beginChunk
jdk.StringFlag#enabled: true
jdk.StringFlag#period: beginChunk

jdk.IntFlagChanged#enabled: true
jdk.UnsignedIntFlagChanged#enabled: true
jdk.LongFlagChanged#enabled: true
jdk.UnsignedLongFlagChanged#enabled: true
jdk.DoubleFlagChanged#enabled: true
jdk.BooleanFlagChanged#enabled: true
jdk.StringFlagChanged#enabled: true
```

```
jdk.LongFlag {
  startTime = 09:52:40.647
  name = "ObjectAlignmentInBytes"
  value = 8
  origin = "Default"
}

jdk.LongFlag {
  startTime = 09:52:40.647
  name = "CICompilerCount"
  value = 4
  origin = "Ergonomic"
}

...
```