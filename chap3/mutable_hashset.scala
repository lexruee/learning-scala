#!/usr/bin/env scala

import scala.collection.mutable.HashSet

val jetSet = HashSet("Boeing", "Airbus")
jetSet + "Lear"
println(jetSet.contains("Cessna"))

