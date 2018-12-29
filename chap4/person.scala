#!/usr/bin/env scala

class Person(
  val firstName: String, 
  val lastName: String, 
  val job: String, 
  val age: Int) {

  def toTuple = (firstName, lastName, job, age)
  def toList = List(firstName, lastName, job.toString, age.toString)
  def toMap = {
    Map("firstName" -> firstName, "lastName" -> lastName, "job" -> job, "age" -> age)
  }
  override def toString: String = toTuple.toString

}

val p = new Person("Peter", "Müller", "Code Monkey", 0x1e)

println(p.toTuple)
println(p.toString)
println(p.toList)

// accessing each property
println("firstName: " + p.firstName)
println("lastName: " + p.lastName)
println("age: " + p.age)
println("job: " + p.job)

p.toMap.foreach(t=> println(t._1 + ": " + t._2))
