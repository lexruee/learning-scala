#!/usr/bin/env scala

import scala.io.Source

def findPrimes(max: Int): IndexedSeq[Tuple3[Int, Boolean, List[Int]]] = {
  val primeCandidates = 2 until max
  primeCandidates.map(primeCandidate => {
    val factors = 2 until primeCandidate
    val dividableTests = factors.map(factor => primeCandidate % factor == 0)
    val isPrime = dividableTests.forall(_ == false)
    val dividers = factors.zip(dividableTests)
                          .filter(t => t._2 == true)
                          .map(t => t._1).toList
                          
    (primeCandidate, isPrime, dividers)
  })
}

def formatResult(result: IndexedSeq[Tuple3[Int, Boolean, List[Int]]]): String = {
  result.map(t => {
    "Num: " + t._1 + ", isPrime: " + t._2 + ", dividers: " + t._3.mkString(", ")
  }).mkString("\n")
}

def showUsage { 
  val usage = """Usage: findPrimes.scala [-h | --help] GRIDSIZE
  Finds the primes below the given GRIDSIZE upper bound.
"""
  print(usage) 
}

if (args.length > 0) {
  if (List("--help", "-h").contains(args(0))) showUsage
  else println(formatResult(findPrimes(args(0).toInt)))
} else {
  showUsage
}
