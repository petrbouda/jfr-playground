# IHOP (The Initiating Heap Occupancy Percent)

The Initiating Heap Occupancy Percent (IHOP) is the threshold at which an 
Initial Mark collection is triggered and it is defined as a percentage of 
the old generation size.

G1 by default automatically determines an optimal IHOP by observing how 
long marking takes and how much memory is typically allocated in the old 
generation during marking cycles. This feature is called Adaptive IHOP. 
If this feature is active, then the option `-XX:InitiatingHeapOccupancyPercent`
determines the initial value as a percentage of the size of the current old
generation as long as there aren't enough observations to make a good 
prediction of the Initiating Heap Occupancy threshold. Turn off this 
behavior of G1 using the option `-XX:-G1UseAdaptiveIHOP`. In this case, 
the value of `-XX:InitiatingHeapOccupancyPercent` always determines this threshold.

Internally, Adaptive IHOP tries to set the Initiating Heap Occupancy 
so that the first mixed garbage collection of the space-reclamation 
phase starts when the old generation occupancy is at a current maximum 
old generation size minus the value of `-XX:G1HeapReservePercent` as the 
extra buffer.


```
jdk.G1BasicIHOP {
  startTime = 11:06:11.545
  gcId = 201
  threshold = 115.2 MB
  thresholdPercentage = 45.00%
  targetOccupancy = 256.0 MB
  currentOccupancy = 121.9 MB
  recentMutatorAllocationSize = 31.2 MB
  recentMutatorDuration = 14.0 ms
  recentAllocationRate = 2.1 GB/s
  lastMarkingDuration = 0 s
}


jdk.G1AdaptiveIHOP {
  startTime = 11:06:11.545
  gcId = 201
  threshold = 115.2 MB
  thresholdPercentage = 52.94%
  ihopTargetOccupancy = 217.6 MB
  currentOccupancy = 40.0 MB
  additionalBufferSize = 121.9 MB
  predictedAllocationRate = 3.9 GB/s
  predictedMarkingDuration = 0 s
  predictionActive = false
}

```