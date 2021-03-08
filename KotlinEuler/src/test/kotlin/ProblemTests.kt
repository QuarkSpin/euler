import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ProblemTests {

    @Test
    fun problem001Test() = assertEquals(233168, Problem001().solve())

    @Test
    fun problem002Test() = assertEquals(4613732, Problem002().solve())
}
