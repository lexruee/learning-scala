#!/usr/bin/env scala

def greet() = println("Hello World!")

def max(x:Int, y:Int):Int = if (x > y) x else y

def min(x:Int, y:Int):Int = { 
  if (x < y) x 
  else y
}

def fac(n:Int, acc:Int):Int = { 
  if (n == 0) acc
  else fac(n-1, acc * n)
}

def fib(n:Int, a:Int, b:Int):Int = {
  if (n == 0) b
  else fib(n-1, b, a + b)
}

def gcd(a:Int, b:Int):Int = {
  if (b == 0) a
  else if (b < 0) a
  else if (b > a) gcd(b, b-a)
  else gcd(b, a-b)
}

greet()

println("max(10,12)=" + max(10, 12))
println("min(10,12)=" + min(10, 12))
println("fac(5,1)=" + fac(5, 1))
println("fib(5,0,1)=" + fib(5,0,1))
println("gcd(12,9)=" + gcd(12,9))
println("gcd(9,12)=" + gcd(9,12))
