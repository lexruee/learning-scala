#!/usr/bin/env scala

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import java.util.Scanner

object ReadingAFile {

  def showUsage() { 
    println("""
      |Usage: reading-file.scala [-h | --help] FILE
      |Reads the contents of text file.""".stripMargin)
  }

  def readArgs(args: Array[String]): Boolean = {
    if (args.isEmpty) { 
      showUsage()
      false
    } else if (List("-h", "--help").contains(args(0))) { 
      showUsage()
      false
    } else {
      true
    }
  }

  def main(args: Array[String]) {
    if (!readArgs(args)) System.exit(0)

    val f = new FileReader(args(0))
    try {
      val scanner = new Scanner(f)
      while (scanner.hasNextLine()) {
        println(scanner.nextLine())
      }
    } catch {
      case ex: FileNotFoundException => { /* do nothing */ }
      case ex: IOException => { /* do nothing */ }
    } finally {
      f.close()
    }
  }

}


