object Hello {
  def main(args: Array[String]) {
    val startTime = System.currentTimeMillis()
    var a = 2
    var b = 0
    var evenFib = 2
    var sum = 0

    while (evenFib < 3600000) {
      sum = sum + evenFib
      evenFib = 4 * a + b
      b = a
      a = evenFib

    }
    println(sum)
    val endTime = System.currentTimeMillis()
    println("Time took: " + (endTime - startTime))
    }
  }
































