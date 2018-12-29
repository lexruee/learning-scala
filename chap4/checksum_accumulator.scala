#!/usr/bin/env scala

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xff) + 1
}

val acc1 = new ChecksumAccumulator
val acc2 = new ChecksumAccumulator()

acc1.add(1)
println(acc1.checksum)

acc2.add(2)
println(acc2.checksum)
