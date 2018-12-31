#!/usr/bin/env scala

var lines: List[String] = List()
var line = ""

println("Please enter some something")
do {
  line = readLine()
  println("Read: " + line)
  lines ++ line
} while(line != "")
