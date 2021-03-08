class Problem001 : IProblem<Int> {
    override fun Solve(): Int {
        return (1..999).filter { x -> x % 3 == 0 || x % 5 == 0 }.sum();
    }
}