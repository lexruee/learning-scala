#!/usr/bin/env scala

val locations = Map(
  1 -> "Bern",
  2 -> "Zürich",
  3 -> "Luzern",
  4 -> "Genf",
  5 -> "Solothurn",
  6 -> "Fribourg"
)

println(locations(2))
locations.foreach(println)
val newLocations = locations.map(t => (t._1, t._2.toUpperCase))

println(newLocations(2))
