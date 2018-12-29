#!/usr/bin/env scala

import scala.collection.immutable.HashSet

var jetSet = HashSet("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

