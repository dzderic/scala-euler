object ProblemTwo {
  val fib: Stream[BigInt] = {
    def rec(n1: BigInt, n2: BigInt): Stream[BigInt] = n1 #:: rec(n2, n1 + n2)
    rec(0, 1)
  }
  def run = fib.takeWhile(_ < 4000000).filter(_ % 2 == 0).sum
}
