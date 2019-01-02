#!/usr/bin/env scala

import java.io.File
import scala.io.Source

def showUsage { 
  println("""
    |Usage: grep.scala [-h | --help] PATTERN [directory]
    |Lists the contents of the specified directory.""".stripMargin)
}

def fileLines(file: File): List[String] =  Source.fromFile(file).getLines.toList

def ls(dir: String): List[File] = { 
  (new File(dir))
    .listFiles
    .toList
    .sortWith((f1, f2) => f1.getName <= f2.getName)
}

def grepFiles(files: List[File], pattern: String): List[String] = { 
  for {
    file <- files if file.isFile
    line <- fileLines(file) 
    trimmed = line.trim
    if trimmed.matches(pattern)
  } yield file + ": " + line.trim
}

if (List("--help", "-h").contains(args(0))) {
  showUsage
} else if (args.length >=1) {
  val pattern = args(0)
  val dir = if (args.length == 2) args(1) else "."
  val files = ls(dir)
  val result = grepFiles(files, pattern)
  println(result.mkString("\n"))
} else {
  showUsage
  System.exit(1)
}


