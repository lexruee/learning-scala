#!/usr/bin/env scala

val res = 10 +
          30 +
          20 *
          20 /
          20

val foo = (  10
           + 30
           + 20
           * 20
           / 20)

val bar = 10.+(30).+(20.*(20)./(20))

println(res)
println(foo)
println(bar)

println(1+2*3)
println(1.+(2).*(3))
println(1.+(2.*(3)))

val a = 10; val b = 20; val c = a + b;
println(c)


val rangeFromZeroToTen = 0.to(10)
val rangeFromZeroToTen2 = 0 to 10
val rangeFromZeroUntilTen = 0.until(10)
val rangeFromZeroUntilTen2 = 0 until 10

println(rangeFromZeroToTen2.length)
println(rangeFromZeroUntilTen2.length)
