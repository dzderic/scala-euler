object ProblemTwelve {
  def triangle = new Iterator[Long] {
    var i = 1
    var cur = 0
    def hasNext = true
    def next() = {
      cur += i
      i += 1
      cur
    }
  }

  def roughFactors(n: Long) = {
    val divisors = ProblemThree.numbers.takeWhile { i => i*i <= n }.filter(n != 1 && n % _ == 0)
    divisors.length * 2 + 2
  }

  def run = triangle.find(roughFactors(_) >= 500)
}
