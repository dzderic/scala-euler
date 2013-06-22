object ProblemOne {
  def isMultiple3or5(i: Int) = i % 3 == 0 || i % 5 == 0
  def run = (1 to 999).filter(isMultiple3or5).sum
}
