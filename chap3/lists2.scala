#!/usr/bin/env scala

val numbers = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: Nil

val evenNumbers = numbers.filter(_ % 2 == 0)
val oddNumbers = numbers.filterNot(_ % 2 == 0)

println(numbers.mkString(", "))
println("even: " + evenNumbers.mkString(", "))
println("odd: " + oddNumbers.mkString(", "))
println("reversed: " + numbers.reverse.mkString(", "))
println("length: " + numbers.length)
println("isEmpty: " + numbers.isEmpty)
println("head: " + numbers.head)
println("last: " + numbers.last)
println("tail: " + numbers.tail.mkString(", "))
println("map: " + numbers.map(_ + 1).mkString(", "))
println("count: " + numbers.count(_ % 2 == 0))
val sortWith = numbers.reverse.sortWith((a: Int, b: Int) =>  a > b )
println("sortWith: " + sortWith.mkString(", "))
println("concat: " + (evenNumbers ::: oddNumbers).mkString(", "))
println("reduce: " + numbers.reduce((acc, n) => acc + n))
println("sum: " + numbers.sum)
println("product: " + numbers.product)
println("take: " + numbers.take(3))
println("drop: " + numbers.drop(3))
println("dropRight: " + numbers.dropRight(3))
println("exits: " + numbers.exists(_ % 3 == 0))
println("forall: " + numbers.forall(_ % 3 == 0))
println("apply: " + numbers.apply(3))
println("(3): " + numbers.apply(3))

numbers.foreach(println)
