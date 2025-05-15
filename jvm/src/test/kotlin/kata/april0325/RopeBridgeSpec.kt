package kata.april0325

import org.junit.jupiter.api.Test
import kotlin.random.Random
import kotlin.test.assertEquals

class RopeBridgeSpec {
    @Test
    fun `When program is called Then it returns the sum of the values of the true equations`() {
        // Arrange | Given
        val calibrationEquations = """
            190: 10 19
            3267: 81 40 27
            83: 17 5
            156: 15 6
            7290: 6 8 6 15
            161011: 16 10 13
            192: 17 8 14
            21037: 9 7 18 13
            292: 11 6 16 20
        """.trimIndent()

        // Act | When
        val sumOfTrueEquations = program(calibrationEquations)

        // Assert | Then
        assertEquals(
            actual = sumOfTrueEquations,
            expected = 3749
        )
    }

    @Test
    fun `When program is called with a single equation with the same number on the left and right Then it returns that number`() {
        // Arrange | Given
        val number: Int = Random.nextInt()

        val calibrationEquations = """
            $number: $number 
        """.trimIndent()

        // Act | When
        val sumOfTrueEquations = program(calibrationEquations)

        // Assert | Then
        assertEquals(
            actual = sumOfTrueEquations,
            expected = number
        )
    }

    @Test
    fun `When program is called with a single equation with one number on the left and a differnt on the right Then it returns zero`() {
        // Arrange | Given
        val numberLeft: Int = Random.nextInt()
        val numberRight: Int = Random.nextInt()

        val calibrationEquations = """
            $numberLeft: $numberRight 
        """.trimIndent()

        // Act | When
        val sumOfTrueEquations = program(calibrationEquations)

        // Assert | Then
        assertEquals(
            actual = sumOfTrueEquations,
            expected = 0
        )
    }
}