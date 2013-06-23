object ProblemFourteen {
  def lengthCollatz(n: Int) = {
    def aux(n: Long, c: Long): Long = {
      if (n == 1) return c + 1
      (n % 2 == 0) match {
        case true => aux(n/2, c+1)
        case false => aux(3*n + 1, c+1)
      }
    }
    aux(n.toLong, 0)
  }

  def run = (1 until 1000000).maxBy(lengthCollatz)
}
