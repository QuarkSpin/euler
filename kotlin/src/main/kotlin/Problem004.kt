import utils.isPalindrome

class Problem004 : IProblem<Int> {
    override fun solve(): Int {
        return (999 downTo 100).flatMap {
            x -> (x downTo 100).map { x * it }
        }.filter { it.isPalindrome() }.maxOf { it }
    }
}

