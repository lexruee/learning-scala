#!/usr/bin/env scala

val msg = "Hello World" // immutable value
val msg2: String = "Hello World" // immutable value
val msg3: java.lang.String = "Hello World" // immutable value

println(msg)
println(msg2)
println(msg3)

var greeting = "Hello World!" // mutable variable
greeting = "Leave me alone, world!"

println(greeting)

var multiline = 
  "This is the next line."

println(multiline)


