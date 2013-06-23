import collection.mutable.MutableList

object ProblemTen {
  def primes(n: Int) = {
    val primes = MutableList[Long]()
    val marked = new Array[Boolean](n+1)

    var p = 2
    while (p < n) {
      (p to n by p).foreach(marked(_) = true)
      primes += p.toLong
      p = (p to n).find(!marked(_)).getOrElse(n)
    }

    primes
  }
  def run = primes(2000000).sum
}
