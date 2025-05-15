package kata.april0325

fun program(calibrationEquations: String): Int {
    val (left, right) = calibrationEquations.split(":", limit = 2).map { it.trim()}
    return if (left != right) {
        0
    } else {
        left.toInt()
    }
}