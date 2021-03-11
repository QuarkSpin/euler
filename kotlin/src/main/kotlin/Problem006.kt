import kotlin.math.pow

class Problem006 : IProblem<Double> {
    override fun solve(): Double {
        return (1L..100L).sum().toDouble().pow(2) - (1L..100L).map { it * it }.sum()
    }
}