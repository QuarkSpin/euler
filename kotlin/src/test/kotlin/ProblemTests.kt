import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ProblemTests {

    @Test
    fun problem001Test() = assertEquals(233168, Problem001().solve())

    @Test
    fun problem002Test() = assertEquals(4613732, Problem002().solve())

    @Test
    fun problem003Test() = assertEquals(6857, Problem003().solve())

    @Test
    fun problem004Test() = assertEquals(906609, Problem004().solve())

    @Test
    fun problem005Test() = assertEquals(232792560, Problem005().solve())

    @Test
    fun problem006Test() = assertEquals(25164150.0, Problem006().solve())

    @Test
    fun problem007Test() = assertEquals(104743, Problem007().solve())
}
