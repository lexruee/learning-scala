#!/usr/bin/env scala

def quicksort(xs: Array[Int]): Array[Int] = {
  if (xs.length <= 1) xs
  else {
    val pivot = xs(xs.length/2)
    Array.concat(
      quicksort(xs filter(pivot >)),
      xs filter(pivot ==),
      quicksort(xs filter(pivot <))
    )
  }
}

var xs = (0 until 20).map(_ => (Math.random() * 100).toInt).toArray
var ys = quicksort(xs)

println("quicksort input:  " + xs.mkString(", "))
println("quicksort output: " + ys.mkString(", "))
