object ProblemFive {
  def run = {
    ProblemThree.numbers.filter { i =>
      val multiples = (1 to 20).filter(i % _ == 0)
      multiples.length == 20
    }.take(1).toList.head
  }
}
