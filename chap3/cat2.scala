#!/usr/bin/env scala

import scala.io.Source

if (args.length > 0) {
  args.foreach(arg => {
    Source.fromFile(arg).getLines().foreach(line => {
      println(line)
    })
  })
} else {
  Console.err.println("Usage: cat2.scala FILE ...")
}
