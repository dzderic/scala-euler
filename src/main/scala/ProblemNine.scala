object ProblemNine {
  def run = {
    val range = 1 to 500
    val candidates = for {
      a <- range
      b <- range
      c <- range
      if a + b + c == 1000
      if a < b && b < c
    } yield (a, b, c)
    val triple = candidates.filter { case (a, b, c) =>
      a*a + b*b == c*c
    }.head
    triple._1 * triple._2 * triple._3
  }
}
