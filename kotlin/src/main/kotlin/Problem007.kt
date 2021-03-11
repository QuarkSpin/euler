import utils.primes

class Problem007 : IProblem<Long> {
    override fun solve(): Long {
        return primes().take(10_001).last()
    }
}