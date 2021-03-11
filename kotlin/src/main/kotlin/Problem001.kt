class Problem001 : IProblem<Int> {
    override fun solve(): Int {
        return (1..999).filter { it % 3 == 0 || it % 5 == 0 }.sum();
    }
}