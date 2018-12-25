# Scala

From Wikipedia:

```
Scala is a general-purpose programming language providing support for functional programming 
and a strong static type system. Designed to be concise, many of Scala's design decisions 
aimed to address criticisms of Java.
```

## Installing Scala on Arch Linux

First, we need to install the Scala package:

```
sudo pacman -S scala
```

Once installed, you should have a working Scala compiler `scalac` 
and a Scala interpreter or repl `scala`.

Lastly, we install the Scala build tool called `sbt`:

```
sudo pacman -S sbt
```

## Scala Compiler

```
scalac -help
scalac -version
```

## Scala REPL

```
scala -help
scala -version
```

## Scala Build Tool

```
sbt -help
sbt help
```

## Creating an empty Scala project

```
sbt new scala/hello-world.g8
```

## Running the hello-world project

```
cd hello-world
sbt run
```

## Running Scala scripts

```
scala ./chap2/hello-world.scala
```

## Making Scala scripts executable on POSIX systems

1) Add the following shebang line to the scala script:

```
#!/usr/bin/env scala
```

2) Make the Scala script executable by setting the execute bit:

```
chmod +x zyx.scala
```

## Learning Resources

 * https://docs.scala-lang.org/getting-started-sbt-track/getting-started-with-scala-and-sbt-on-the-command-line.html
 * https://learnxinyminutes.com/docs/scala/
 * https://www.scala-exercises.org/scala_tutorial/terms_and_types
 * https://wiki.archlinux.org/index.php/Scala
 * https://en.wikipedia.org/wiki/Scala_(programming_language)

## Books

 * Programming in Scala: A comprehensive step-by-step guide, Martin Odersky, Lex Spoon, Bill Venners
