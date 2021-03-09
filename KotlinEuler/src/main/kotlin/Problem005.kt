import utils.lcm

class Problem005 : IProblem<Long> {
    override fun solve(): Long {
        return (1L..20L).lcm()
    }
}