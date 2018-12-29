#!/usr/bin/env scala

val romanNumeral = Map(
  1 -> "I",
  2 -> "II",
  3 -> "III",
  4 -> "IV",
  5 -> "V",
  6 -> "VI",
  7 -> "VII",
  8 -> "VIII",
  9 -> "IX",
  10 -> "X"
)

romanNumeral.foreach(tuple => {
  println("key: " + tuple._1 + ", value: " + tuple._2)
})

println("4 is: " + romanNumeral(4))

