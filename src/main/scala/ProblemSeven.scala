object ProblemSeven {
  def run = {
    val primes = ProblemThree.numbers.filter { i =>
      val factors = ProblemThree.primeFactors(i)
      factors.length == 1 && factors.head == i
    }
    primes.take(10001).toList.last
  }
}
