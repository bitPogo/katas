package kata.april1025


fun minesweeper(input: String): String {
    val row = input.toCharArray()
    val outputRow = IntArray(input.length) {
        0
    }

    row.forEachIndexed { idx, value ->
        when {
            value == '*' -> {
                if (idx > 0) {
                    outputRow[idx + 1] = 1
                }

                outputRow[idx] = -1

                if (idx < input.lastIndex) {
                    outputRow[idx - 1] = 1
                }
            }
        }
    }

    return outputRow.joinToString("") {
        if (it == -1) {
            "*"
        } else {
            it.toString()
        }
    }
}