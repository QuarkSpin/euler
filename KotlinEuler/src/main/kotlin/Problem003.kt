import kotlin.math.*

class Problem003 : IProblem<Long> {
    private fun Long.isPrime() = when {
        this == 1L -> false
        this == 2L -> true
        this % 2 == 0L -> false
        else -> (3..sqrt(this.toDouble()).toLong() step 2).none { this % it == 0L }
    }

    private fun largestPrimeFactor(n: Long): Long {
        return (sqrt(n.toDouble()).toLong() downTo 1).first { n % it == 0L && it.isPrime() }
    }

    override fun solve(): Long {
        return largestPrimeFactor(600851475143)
    }
}