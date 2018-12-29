#!/usr/bin/env scala

import scala.io.Source

def longestline(lines: List[String]): String = { 
  lines.reduceLeft((a, b) => if (a.length > b.length) a else b)
}

def widthOfLength(s: String): Int = s.length.toString.length

if (args.length > 0) {
  val lines = Source.fromFile(args(0)).getLines().toList
  val maxWidth = widthOfLength(longestline(lines))
  lines.foreach(line => {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  })
} else {
  Console.err.println("Usage: countchars2.scala FILE")
}
