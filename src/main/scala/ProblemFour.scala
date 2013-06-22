object ProblemFour {
  def isPalindrome(n: Long) = n.toString == n.toString.reverse
  def run = {
    (999 to 100 by -1).flatMap { n1 =>
      (999 to 100 by -1).filter { n2 =>
        isPalindrome(n1 * n2)
      }.headOption.map(n1 * _)
    }.sorted.last
  }
}
