# MODULE

- `#period: endChunk`

#### MODULE_REQUIRE

```
jdk.ModuleRequire {
  startTime = 16:36:17.394
  source = {
    name = "java.transaction.xa"
    version = "14-ea"
    location = "jrt:/java.transaction.xa"
    classLoader = jdk.internal.loader.ClassLoaders$PlatformClassLoader (id = 4)
  }
  requiredModule = {
    name = "java.base"
    version = "14-ea"
    location = "jrt:/java.base"
    classLoader = null  }
}


jdk.ModuleRequire {
  startTime = 16:36:17.394
  source = {
    name = "jdk.charsets"
    version = "14-ea"
    location = "jrt:/jdk.charsets"
    classLoader = jdk.internal.loader.ClassLoaders$PlatformClassLoader (id = 4)
  }
  requiredModule = {
    name = "java.base"
    version = "14-ea"
    location = "jrt:/java.base"
    classLoader = null  }
}

...
```

#### MODULE_EXPORT

```
jdk.ModuleExport {
  startTime = 16:38:34.186
  exportedPackage = {
    name = "javax/swing/colorchooser"
    module = {
      name = "java.desktop"
      version = "14-ea"
      location = "jrt:/java.desktop"
      classLoader = null    }
    exported = true
  }
  targetModule = N/A
}


jdk.ModuleExport {
  startTime = 16:38:34.186
  exportedPackage = {
    name = "java/time/format"
    module = {
      name = "java.base"
      version = "14-ea"
      location = "jrt:/java.base"
      classLoader = null    }
    exported = true
  }
  targetModule = N/A
}

...
```