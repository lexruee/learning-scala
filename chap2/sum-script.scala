#!/usr/bin/env scala

// Simple Hello script

if (args.length > 0)
  println(args.map(_.toInt).sum)
else
  println("Usage: sum-script.scala NUM1 NUM2 NUM3 ...")

