#!/usr/bin/env scala

import scala.io.Source

def cat(args: Array[String]) { 
  args.foreach(Source.fromFile(_).getLines().foreach(println))
}

def showUsage { 
  val usage = """Usage: cat.scala [-h | --help] [FILE1 [FILE2 [FILE3 ... ]
Concatenates multiples files and prints the result to stdout.  
"""
  print(usage) 
}

if (args.length > 0) {
  if (List("--help", "-h").contains(args(0))) showUsage
  else cat(args)
} else {
  showUsage
}
