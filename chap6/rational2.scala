#!/usr/bin/env scala

import scala.collection.SortedMap

class Rational(n: Int, d:Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)

  val numer = n / g
  val denom = d / g

  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational = new Rational(
    numer * that.denom + that.numer * denom, 
    denom * that.denom
  )

  def +(i: Int): Rational = new Rational(numer + i * denom, denom)

  def *(that: Rational): Rational = new Rational(
    numer * that.denom,
    denom * that.denom
  )

  def *(i: Int): Rational = new Rational(numer * i, denom)

  def /(that: Rational): Rational = new Rational(
    numer * that.denom,
    denom * that.numer
  )

  def /(i: Int): Rational = new Rational(numer, denom * i)


  def unary_! = new Rational(denom, numer)
  def unary_~ = new Rational(denom, numer)
  def unary_- = new Rational(-numer, denom)
  def unary_+ = this

  def ! = !this

  override def toString = numer + "/" + denom

  private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a % b)
}

implicit def intToRational(x: Int) = new Rational(x, 1)

val r1 = new Rational(1, 4)
val r2 = r1 * 2
val r3 = 2 * r1
val r4 = r1 + 1/2
val r5 = 1/2 + r1
val r6 = r1 / r1
val r7 = r1 / 2
val results = SortedMap("r1" -> r1, "r2" -> r2, "r3" -> r3, "r4" -> r4, "r5" -> r5,
  "r6" -> r6, "r7" -> r7)
                .map(t => t._1 + "=" + t._2)
                .toList
println(results.mkString("\n"))
