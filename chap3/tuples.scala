#!/usr/bin/env scala

val pair = (99, "Luftballons")
val pair2: Tuple2[Int, String] = (99, "Luftballons")
var (a, b): Tuple2[Int, Int] = (10, 20)

println(pair._1)
println(pair._2)

val person = ("Alex", "Rüedlinger", "Bern", "Software developer")
val (firstName, lastName, location, job) = person

println(firstName, lastName, location, job)

