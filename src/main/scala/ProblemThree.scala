object ProblemThree {
  // can't use a range for numbers > 2**31
  def numbers = new Iterator[Int] {
    var i = 1
    def hasNext = true
    def next(): Int = {
      i += 1
      i
    }
  }

  def primeFactors(n: Long): List[Long] = {
    if (n <= 1) return List()
    val end = n / 2
  
    val factors = numbers.takeWhile(_ < end).filter(n % _ == 0).take(1).toList
    factors.headOption match {
      case None => List(n)
      case Some(factor) => primeFactors(factor) ::: primeFactors(n / factor)
    }
  }

  def run = primeFactors(600851475143L)
}
