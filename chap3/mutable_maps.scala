#!/usr/bin/env scala

import scala.collection.mutable.Map

val locations = Map[Int, String]()

locations += (1 -> "Bern")
locations += (2 -> "Zürich")
locations += (3 -> "Luzern")
locations += (4 -> "Genf")
locations += (5 -> "Solothurn")
locations += (6 -> "Fribourg")

println(locations(2))
locations.foreach(println)
val newLocations = locations.map(t => (t._1, t._2.toUpperCase))

println(newLocations(2))
