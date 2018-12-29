#!/usr/bin/env scala

import scala.io.Source

if (args.length > 0) {
  Source.fromFile(args(0)).getLines().foreach(line => {
    println(line.length + " " + line)
  })
} else {
  Console.err.println("Usage: countchars.scala FILE")
}
