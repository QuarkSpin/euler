class Problem002 : IProblem<Int> {
    private fun fibonacci() = sequence {
        var pair = Pair(0, 1)

        while (true) {
            yield(pair.first);
            pair = Pair(pair.second, pair.first + pair.second);
        }
    }

    override fun solve(): Int {
        return fibonacci().takeWhile { x -> x <= 4_000_000 }.filter { x -> x % 2 !=0 }.sum();
    }
}