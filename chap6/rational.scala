#!/usr/bin/env scala

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

  def *(that: Rational): Rational = new Rational(
    numer * that.denom,
    denom * that.denom
  )

  def unary_! = new Rational(denom, numer)
  def unary_~ = new Rational(denom, numer)
  def unary_- = new Rational(-numer, denom)
  def unary_+ = this

  override def toString = numer + "/" + denom

  private def gcd(a: Int, b: Int): Int = if (b==0) a else gcd(b, a % b)
}

val r1 = new Rational(1, 4)
val r2 = new Rational(1, 4)
val r3 = r1 + r2
val r4 = r1 * r2
val r5 = new Rational(10, 5)
println(r1 + "+" + r2 + "=" + r3)
println(r1 + "*" + r2 + "=" + r4)
println(r5)
println(!r5)
println(~r5)
println(-r5)
println(+r5)
