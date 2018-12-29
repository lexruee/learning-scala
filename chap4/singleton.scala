#!/usr/bin/env scala

import scala.collection.mutable

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xff) + 1
}

object ChecksumAccumulator {
  private val cache = mutable.Map.empty[String, Int]

  def calculate(s: String): Int = 
    if (cache.contains(s)) cache(s)
    else {
      val acc = new ChecksumAccumulator
      s.foreach(c => acc.add(c.toByte))
      val cs = acc.checksum
      cache += (s -> cs)
      cs
    }

}

if (args.length != 0) {
  val checksums = args.map(ChecksumAccumulator.calculate(_))
  val res = args.zip(checksums)
  println("(in, out)")
  res.foreach(println)

} else {
  println("Usage: singleton.scala S1 S2 S3 ...")
}
