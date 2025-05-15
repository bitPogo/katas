package kata.feb1325

import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertEquals

class GuardGallivantSpec {
    @Test
    fun `When predict is called it finds and counts visited guard positions`() {
        // Given | Arrange
        val input = """
            ....#.....
            .........#
            ..........
            ..#.......
            .......#..
            ..........
            .#..^.....
            ........#.
            #.........
            ......#...
        """.trimIndent()

        // When | Act
        val count = predict(input)

        // Then | Assert
        assertEquals(
            actual = count,
            expected = 41
        )
    }

    @TestFactory
    fun `When predict is called and there are no obstacles on a symmetric board Then it returns the amount of steps to the end including the start position`() = listOf(
        "<",
        ">",
        "^",
        "v",
    ).map { guard ->
        dynamicTest("When predict is called Then returns the amount of steps to the end including the start position if there are no obstacles on a symmetric board and the guard points to $guard") {
            // Given | Arrange
            val input = """
            .....
            .....
            ..${guard}..
            .....
            .....
        """.trimIndent()

            // When | Act
            val count = predict(input)

            // Then | Assert
            assertEquals(
                actual = count,
                expected = 3
            )
        }
    }

    @TestFactory
    fun `When predict is called there are no obstacles on a symmetric board with 4 dimensions Then it returns the amount of steps to the end including the start position`() = listOf(
        "<",
        ">",
        "^",
        "v",
    ).map { guard ->
        dynamicTest("When predict is called Then returns the amount of steps to the end including the start position if there are no obstacles on a symmetric board with 4 dimensions and the guard points to $guard") {
            // Given | Arrange
            val input = """
            ..........
            ..........
            ..........
            ..........
            ....${guard}....
            ..........
            ..........
            ..........
            ..........
        """.trimIndent()

            // When | Act
            val count = predict(input)

            // Then | Assert
            assertEquals(
                actual = count,
                expected = 5
            )
        }
    }
}