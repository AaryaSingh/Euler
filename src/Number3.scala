import scala.util.control.Breaks._
object Number3 {
  def main(args: Array[String]): Unit = {
    primeNumberFinder()
  }

  def primeNumberFinder(): Unit = {
    var testInt = 0
    var tester = 0
    breakable(): Unit; {
      for (testInt <- 2 to 100) {
        for (tester <- 2 to testInt) {
          if (testInt % tester == 0) {
          }
          if (testInt==tester) break
        }
      }
    }

  }


}
