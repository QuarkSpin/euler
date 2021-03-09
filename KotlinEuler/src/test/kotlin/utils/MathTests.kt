package utils

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MathTests {

    @Test
    fun fibonacciTest() {
        arrayOf(
            Pair(listOf<Long>(1, 2, 3, 4, 5), 60L),
            Pair(listOf<Long>(12, 15, 10, 75), 300L),
            Pair(listOf<Long>(42), 42L)
        ).forEach { assertEquals(it.second, it.first.lcm()) }
    }

    @Test
    fun isPrimeTest() {
        arrayOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31).forEach { assertTrue(it.isPrime()) }
        arrayOf(-3, 0, 1, 4, 9, 15).forEach { assertFalse(it.isPrime()) }
    }

    @Test
    fun primeFactorsTest() {
        arrayOf(
            Pair(1000L, listOf<Long>(2, 2, 2, 5, 5, 5)),
            Pair(1234567890L, listOf<Long>(2, 3, 3, 5, 3607, 3803))
        ).forEach { assertEquals(it.second, it.first.primeFactors()) }
    }

    @Test
    fun largestPrimeFactorTest() {
        arrayOf(
            Pair(6L, 3L),
            Pair(15L, 5L),
            Pair(988L, 19L)
        ).forEach { assertEquals(it.second, it.first.largestPrimeFactor()) }
    }

    @Test
    fun isPalindromeTest() {
        arrayOf(0, 5, 424, 423565324, 42566524).forEach { assertTrue(it.isPalindrome()) }
        arrayOf(-1, -424, 42, 123320).forEach { assertFalse(it.isPalindrome()) }
    }

    @Test
    fun gcdTest() {
        arrayOf(
            Pair(Pair(40L, 100L), 20L),
            Pair(Pair(7854L, 926L), 2L),
            Pair(Pair(189L, 12L), 3L),
        ).forEach { assertEquals(it.second, gcd(it.first.first, it.first.second)) }
    }

    @Test
    fun lcmTest() {
        arrayOf(
            Pair(Pair(6L, 10L), 30L),
            Pair(Pair(7L, 49L), 49L),
            Pair(Pair(184L, 11L), 2024L),
        ).forEach { assertEquals(it.second, lcm(it.first.first, it.first.second)) }

        arrayOf(
            Pair(listOf<Long>(2, 40, 100), 200L),
            Pair(listOf<Long>(17, 23, 42, 19), 312018L),
            Pair(listOf<Long>(4, 945, 45, 6518, 78), 160147260L),
            Pair((1L..20L), 232792560L),
        ).forEach { assertEquals(it.second, it.first.lcm()) }
    }
}
