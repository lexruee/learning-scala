import ChecksumAccumulator.calculate

object FallWinterSpringSummer extends App {

  List("Fall", "Winter", "Spring", "Summer")
    .map(season => season + ": " + calculate(season))
    .foreach(println)
}
