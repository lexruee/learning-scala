#!/usr/bin/env scala

val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val twoThree = List(2, 3)

val oneTwoThreeFour = oneTwo ::: threeFour // concat lists
val oneTwoThree = 1 :: twoThree // prepend 1 to the list

val numbers = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: Nil
val numbers2 = Nil.::(6).::(5).::(4).::(3).::(2).::(1)
val numbers3 = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: List()

println(oneTwoThreeFour.mkString(", "))
println(oneTwoThree.mkString(", "))
println(numbers.mkString(", "))
println(numbers2.mkString(", "))
println(numbers3.mkString(", "))
