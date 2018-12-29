
import ChecksumAccumulator.calculate

object Summer {

  def main(args: Array[String]) {
    args.foreach(arg => {
      println(arg + ": " + calculate(arg))
    })
    
    if (args.length == 0)
      Console.err.println("Usage: Summer S1 S2 S3 ...")
  }

}
