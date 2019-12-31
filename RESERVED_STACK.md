# RESERVED_STACK_ALLOCATION

`jdk.ReservedStackActivation`

```
Reserve extra space on thread stacks for use by critical sections, 
so that they can complete even when stack overflows occur.
```

```
Provide a mechanism to mitigate the risk of deadlocks caused by 
the corruption of critical data such as java.util.concurrent locks 
(such as ReentrantLock) caused by a StackOverflowError being 
thrown in a critical section.

The solution must be mostly JVM-based in order not to require 
modifications to java.util.concurrent algorithms or published 
interfaces, or existing library and application code.

The solution must not be limited to the ReentrantLock case, 
and should be applicable to any critical section in privileged code.
```