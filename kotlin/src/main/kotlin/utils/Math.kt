package utils

import kotlin.math.ceil
import kotlin.math.sqrt

fun fibonacci() = sequence {
    var pair = Pair(0, 1)

    while (true) {
        yield(pair.first);
        pair = Pair(pair.second, pair.first + pair.second);
    }
}

fun Int.isPrime() = this.toLong().isPrime()

fun Long.isPrime() = when {
    this < 2L -> false
    this == 2L -> true
    this % 2 == 0L -> false
    else -> (3..sqrt(this.toDouble()).toLong() step 2).none { this % it == 0L }
}

fun Long.primeFactors(): MutableList<Long> {
    var n = this
    val factors = mutableListOf<Long>()
    var d = 2L
    while (n > 1) {
        while (n % d == 0L) {
            factors.add(d)
            n /= d
        }
        d++
        if (d * d > n) {
            if (n > 1) factors.add(n)
            break
        }
    }
    return factors
}

fun Long.largestPrimeFactor(): Long = this.primeFactors().last()

fun Int.isPalindrome(): Boolean = "$this" == "$this".reversed()

fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)

fun lcm(a: Long, b: Long): Long = a * b / gcd(a, b)

fun Iterable<Long>.lcm(): Long = this.reduce { a, b -> lcm(a, b) };

fun Long.nextPrime(): Long {
    if (this <= 1) return 2
    if (this == 2L) return 3

    var n = if (this % 2L == 0L) this + 1 else this + 2

    while (!n.isPrime()) {
        n += 2
    }

    return n
}

fun primes() = sequence {
    var prime = 2L
    while (true) {
        yield(prime)
        prime = prime.nextPrime()
    }
}
