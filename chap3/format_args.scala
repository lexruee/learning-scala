#!/usr/bin/env scala

def formatArgs(args: Array[String]): String = args.mkString("\n")

val input = Array("one", "two", "three")

val res = formatArgs(input)
assert(res == "one\ntwo\nthree")
