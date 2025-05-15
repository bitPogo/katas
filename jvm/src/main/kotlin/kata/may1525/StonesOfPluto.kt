package kata.may1525

import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow

fun blink(stoneLine: List<Long>): List<Long> {
    return stoneLine.flatMap { stone ->
        when {
            stone == 0L -> listOf(1)
            stone.digitCount() % 2 == 0 -> splitNumber(stone)
            else -> listOf(stone * 2024)
        }
    }
}

private fun splitNumber(number: Long): List<Long> {
    val length = number.digitCount()
    val divisor = 10.toDouble().pow(length / 2).toLong()

    val left = number / divisor
    val right = number % divisor

    return listOf(left, right)
}

fun Long.digitCount() = floor(log10(this.toDouble())).toInt() + 1

fun main() {
    var stones = listOf(3028L, 78L, 973951, 5146801, 5, 0, 23533, 857)

    repeat(75) { n ->
        println("round: $n")
        stones = blink(stones)
    }

    println(stones)
    println(stones.size)

}
