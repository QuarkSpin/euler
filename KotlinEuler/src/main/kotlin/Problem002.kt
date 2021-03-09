import utils.*

class Problem002 : IProblem<Int> {
    override fun solve(): Int {
        return fibonacci().takeWhile { it <= 4_000_000 }.filter { it % 2 !=0 }.sum();
    }
}