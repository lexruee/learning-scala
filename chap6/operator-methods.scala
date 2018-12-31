#!/usr/bin/env scala

val r1 = 1.+(2).*(3)
val r11 = (1 + 2) * 3
assert(r1 == r11)

val r2 = 1.+((2).*(3))
val r21 = 1 + 2 * 3
assert(r2 == r21)

