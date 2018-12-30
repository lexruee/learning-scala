#!/usr/bin/env scala


// int / hex literals
val hex = 0xcaffe
val hex1 = 0xaffe
val hex2 = 0xbeef
val res = hex2 << 32 | hex1
println(res)

val ii: Int = 100

// float literal
val f = 100.10f
val ff = 1.5e2f


// double literal
val d = 10.10d
val dd = 1.5e2d

// char literal
val c = 'a' + 1
println(c)

// string literal
val s = "Hello World"
val ms = """
Python-like Strings!
"""
println(ms)

// long literal
val l = 100l

// short literal
val i: Short = 100

// unicode literal 
val u = '\u0041'
println(u)

// symbol literal
val sym: Symbol = 'aSymbol
println(sym)
println(sym.name)

