#!/usr/bin/env scala

def quicksort(xs: Array[Int]): Array[Int] = {
  if (xs.length <= 1) xs
  else {
    val pivot = xs(xs.length/2)
    Array.concat(
      quicksort(xs.filter(_ < pivot)),
      xs.filter(_ == pivot),
      quicksort(xs.filter(_ > pivot))
    )
  }
}

val array_to_str = (xs:Array[Int]) => {
  xs.map(x => x.toString).reduce((acc,x) => acc + ", " + x)
}

var xs = (0 until 20).map(_ => (Math.random() * 100).toInt).toArray
var ys = quicksort(xs)

println("quicksort input:  " + array_to_str(xs))
println("quicksort output: " + array_to_str(ys))
