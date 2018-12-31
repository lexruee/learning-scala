#!/usr/bin/env scala

for { num <- (0 to 10) } { print(num + " ") }
println()
for (num <- (0 to 10)) { print(num + " ") }
println()

val numbers = for { num <- (0 to 10) } yield num
println(numbers.mkString(" "))


val evenNumbers = for { num <- (0 to 10) if num % 2 == 0} yield num
val oddNumbers = for { num <- (0 to 10) if num % 2 != 0} yield num
println(evenNumbers.mkString(" "))
println(oddNumbers.mkString(" "))
