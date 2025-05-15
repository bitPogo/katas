package kata.may1525

import kotlin.test.Test
import kotlin.test.assertEquals

class StonesOfPlutoSpec {
    @Test
    fun `When blink is called with a Stone Line which contains only 0 Then it turns it into 1`() {
        // Arrange
        val stoneLine = listOf(0L)

        // Act
        val newStoneLine = blink(stoneLine)

        // Assert
        assertEquals(
            actual = newStoneLine,
            expected = listOf(1L)
        )
    }

    @Test
    fun `When blink is called with a even number of 2 digits of a Stone Then it splits it into 2 stones`() {
        // Arrange
        val stoneLine = listOf(11L)

        // Act
        val newStoneLine = blink(stoneLine)

        // Assert
        assertEquals(
            actual = newStoneLine,
            expected = listOf(1L, 1),
        )
    }

    @Test
    fun `When blink is called with a even number of more than 2 digits of a Stone Then it splits it into 2 stones`() {
        // Arrange
        val stoneLine = listOf(256234L)

        // Act
        val newStoneLine = blink(stoneLine)

        // Assert
        assertEquals(
            actual = newStoneLine,
            expected = listOf(256L, 234),
        )
    }

    @Test
    fun `When blink is called with a not matching number to any rule on a Stone Then it splits it multiplies the number with 2024`() {
        // Arrange
        val stoneLine = listOf(3L)

        // Act
        val newStoneLine = blink(stoneLine)

        // Assert
        assertEquals(
            actual = newStoneLine,
            expected = listOf(6072L),
        )
    }

    @Test
    fun `When blick is called with a random sequence of numbers 2 times then it returns the mutated output`() {
        // Arrange
        val stoneLine = listOf(125L, 17)

        // Act
        val newStoneLine = blink(blink(stoneLine))

        // Assert
        assertEquals(
            actual = newStoneLine,
            expected = listOf(253L, 0, 2024, 14168)
        )
    }

    @Test
    fun `When blick is called with a random sequence of numbers 6 times then it returns the mutated output`() {
        // Arrange
        val stoneLine = listOf(125L, 17)

        // Act
        val newStoneLine = blink(blink(blink(blink(blink(blink(stoneLine))))))

        // Assert
        assertEquals(
            actual = newStoneLine,
            expected = listOf(2097446912L, 14168, 4048, 2, 0, 2, 4, 40, 48, 2024, 40, 48, 80, 96, 2, 8, 6, 7, 6, 0, 3, 2)
        )
    }
}
