object ProblemSix {
  def run = {
    val numbers = 1 to 100
    val sumSquares = numbers.map { i => i * i }.sum
    val squareSum = numbers.sum * numbers.sum
    squareSum - sumSquares
  }
}
