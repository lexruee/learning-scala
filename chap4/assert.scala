#!/usr/bin/env scala

val res1 = 1+2*3
val res2 = 1.+(2).*(3)

assert(res1 != res2)
Predef.assert(res1 != res2)
