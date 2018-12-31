#!/usr/bin/env scala

object FizzBuzz {

  def showUsage { 
    println("""|Usage: fizzbuzz.scala [-h | --help] MAX
               |Basic FizzBuzz program.""".stripMargin)
  }

  def fizzBuzz(max: Int): List[String] = (1 to max).map(x => {
    if ((x % 3 == 0) && (x % 5 == 0)) "Fizz Buzz"
    else if (x % 3 == 0) "Fizz"
    else if (x % 5 == 0) "Buzz"
    else x.toString
  }).toList

  def formatFizzBuzz(result: List[String]) = result.mkString("\n")

  def main(args: Array[String]) {
    if (args.length == 0) {
      showUsage
      System.exit(1)
    }

    if (List("--help", "-h").contains(args(0))) 
      showUsage
    else 
      println(formatFizzBuzz(fizzBuzz(args(0).toInt)))
  }

}
