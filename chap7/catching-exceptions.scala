#!/usr/bin/env scala

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
  val f = new FileReader("input.txt")

} catch {
  case ex: FileNotFoundException => { /* do nothing */ }
  case ex: IOException => { /* do nothing */ }
}
