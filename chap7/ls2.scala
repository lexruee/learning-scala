#!/usr/bin/env scala

import java.io.File

def showUsage { 
  println("""
    |Usage: ls.scala [-h | --help] [directory]
    |Lists the contents of the specified directory.""".stripMargin)
}

def ls(dir: String): List[File] = (new File(dir))
                                    .listFiles
                                    .toList
                                    .sortWith((f1, f2) => f1.getName <= f2.getName)

def formatLs(files: List[File]): String = {
  (for { file <- files } yield file.getName).mkString("\n")
}

if (args.length == 0) {
  showUsage
  System.exit(1)
}

if (List("--help", "-h").contains(args(0))) 
  showUsage
else 
  println(formatLs(ls(args(0))))


