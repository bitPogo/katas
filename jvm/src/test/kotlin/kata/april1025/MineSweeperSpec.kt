package kata.april1025

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MineSweeperSpec {
    @Test
    fun `When minesweeper is called with a set of mines Then it returns a String containing the cheatsheet`() {
        // Given | Arrange
        val input = """
            *...
            ....
            .*..
            ....
        """.trimIndent()

        // When | Act
        val cheatsheet = minesweeper(input)

        // Then | Assert
        assertEquals(
            actual = cheatsheet,
            expected = """
                *100
                2210
                1*10
                1110
            """.trimIndent()
        )
    }


    @Test
    fun `When input contains random amount of dots in a single line Then it outputs all zeros`() {
        // Given | Arrange
        val amount = 23// abs(Random.nextInt()).absoluteValue
        val input = ".".repeat(amount)

        // When | Act
        val cheatsheet = minesweeper(input)

        // Then | Assert
        assertEquals(
            actual = cheatsheet,
            expected = "0".repeat(amount)
        )
    }

    @Test
    fun `When input contains only a star Then it outputs a star`() {
        // Given | Arrange
        val input = "*"

        // When | Act
        val cheatsheet = minesweeper(input)

        // Then | Assert
        assertEquals(
            actual = cheatsheet,
            expected = "*"
        )
    }

    @Test
    fun `When input contains a dot on left as well right hand side and a star Then it outputs a star and number 1 around`() {
        // Given | Arrange
        val input = ".*."

        // When | Act
        val cheatsheet = minesweeper(input)

        // Then | Assert
        assertEquals(
            actual = cheatsheet,
            expected = "1*1"
        )
    }

    @Test
    fun `When input contains only a dot Then it outputs zero`() {
        // Given | Arrange
        val input = "."

        // When | Act
        val cheatsheet = minesweeper(input)

        // Then | Assert
        assertEquals(
            actual = cheatsheet,
            expected = "0"
        )
    }
}