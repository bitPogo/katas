package kata.december121924

import kotlin.math.abs

fun calculateDistance(sortedList1: List<Int>, sortedList2: List<Int>): Int {
    var sum = 0
    sortedList1.forEachIndexed { index, value ->
        sum += abs(value - sortedList2[index])
    }
    return sum
}