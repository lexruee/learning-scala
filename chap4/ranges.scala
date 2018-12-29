#!/usr/bin/env scala

val rangeFromZeroToTen = 0 to 10
val rangeFromZeroUntilTen = 0 until 10

val list1 = rangeFromZeroToTen.toList
val list2 = rangeFromZeroUntilTen.toList

val evenNumbers = (0 to 20).filter(_% 2 == 0)
val oddNumbers = (0 to 20).filterNot(_% 2 == 0)

println(list1.mkString(", "))
println(list2.mkString(", "))
println(evenNumbers.mkString(", "))
println(oddNumbers.mkString(", "))


def createCartesianProduct(xs: List[Int], ys: List[Int]) = {
  xs.map(x => ys.map(y => (x, y))).flatten
}


val xs = (0 to 10).toList
val ys = (0 to 10).toList
val cartesianProduct = createCartesianProduct(xs, ys)
println(cartesianProduct.mkString(", "))

