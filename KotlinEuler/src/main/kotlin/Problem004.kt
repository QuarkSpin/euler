class Problem004 : IProblem<Int> {
    override fun solve(): Int {
        return (999 downTo 100).flatMap {
            x -> (x downTo 100).map { x * it }
        }.filter { isPalindrome(it) }.maxOf { it }
    }

    private fun isPalindrome(n: Int): Boolean {
        return "$n" == "$n".reversed()
    }
}