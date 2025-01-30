package kata.januray3025

fun fizzBuzz(input: Int): String = when {
    input % 15 == 0 -> "FizzBuzz"
    input % 3 == 0 -> "Fizz"
    input % 5 == 0 -> "Buzz"
    else -> "$input"
}

