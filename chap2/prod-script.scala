#!/usr/bin/env scala

// Simple Hello script

if (args.length > 0)
  println(args.map(_.toInt).product)
else
  println("Usage: prod-script.scala NUM1 NUM2 NUM3 ...")

