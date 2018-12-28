#!/usr/bin/env scala

val numNames = Array("zero", "one", "two")
val numNames2 = Array.apply("zero", "one", "two")

println(numNames.mkString(", "))
println(numNames2.mkString(", "))
