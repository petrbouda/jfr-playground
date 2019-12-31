# SYSTEM

#### SYSTEM_PROCESS

- `#period: endChunk`
- set of all system processes

```
jdk.SystemProcess {
  startTime = 16:10:52.744
  pid = "2500"
  commandLine = "/home/pbouda/.local/share/JetBrains/Toolbox/bin/jetbrains-toolbox --minimize "
}


jdk.SystemProcess {
  startTime = 16:10:52.744
  pid = "2496"
  commandLine = "usr/share/jetbrains-toolbox/jetbrains-toolbox --minimize "
}


jdk.SystemProcess {
  startTime = 16:10:52.744
  pid = "6772"
  commandLine = "/opt/google/chrome/chrome --type=renderer --disable-webrtc-apm-in-audio-service --field-trial-handle=9262132349396412343,11079563146144832410,131072 --lang=en-US --disable-oor-cors --enable-auto-reload --num-raster-threads=4 --enable-main-frame-before-activation --service-request-channel-token=8394591454617458873 --renderer-client-id=745 --no-v8-untrusted-code-mitigations --shared-files=v8_context_snapshot_data:100,v8_natives_data:101 "
}

...
```

#### NETWORK_UTILIZATION

- `#period: 5 s`

```
jdk.NetworkUtilization {
  startTime = 16:14:21.542
  networkInterface = "wlp61s0"
  readRate = 376 bps
  writeRate = 720 bps
}
```

#### PHYSICAL_MEMORY

- `#period: everyChunk`

```
jdk.PhysicalMemory {
  startTime = 16:14:10.605
  totalSize = 19.4 GB
  usedSize = 16.4 GB
}
```
