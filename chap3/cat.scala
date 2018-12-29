#!/usr/bin/env scala

import scala.io.Source

if (args.length > 0) {
  args.foreach(Source.fromFile(_).getLines().foreach(println))
} else {
  Console.err.println("Usage: cat.scala FILE ...")
}
