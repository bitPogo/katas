package kata.januray3025

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzSpec {

    @Test
    fun `Given the number 3 When fizzBuzz is called Then we return "Fizz"`() {
        // Given | Arrange
        val input = 3
        // When | Act
        val result: String = fizzBuzz(input)

        // Then | Assert
        assertEquals(
            expected = "Fizz",
            actual = result
        )
    }

    @Test
    fun `Given the number 5 When fizzBuzz is called Then we return "Buzz"`() {
        // Given | Arrange
        val input = 5
        // When | Act
        val result: String = fizzBuzz(input)

        // Then | Assert
        assertEquals(
            expected = "Buzz",
            actual = result
        )
    }

    @Test
    fun `Given the number 1 When fizzBuzz is called Then we return "1"`() {
        // Given | Arrange
        val input = 1
        // When | Act
        val result: String = fizzBuzz(input)

        // Then | Assert
        assertEquals(
            expected = "1",
            actual = result
        )
    }

    @Test
    fun `Given the number 12 When fizzBuzz is called Then we return "Fizz"`() {
        // Given | Arrange
        val input = 12
        // When | Act
        val result: String = fizzBuzz(input)

        // Then | Assert
        assertEquals(
            expected = "Fizz",
            actual = result
        )
    }

    @Test
    fun `Given the number 15 When fizzBuzz is called Then we return "FizzBuzz"`() {
        // Given | Arrange
        val input = 15
        // When | Act
        val result: String = fizzBuzz(input)

        // Then | Assert
        assertEquals(
            expected = "FizzBuzz",
            actual = result
        )
    }

    @Test
    fun `Given the number 10 When fizzBuzz is called Then we return "Buzz"`() {
        // Given | Arrange
        val input = 10
        // When | Act
        val result: String = fizzBuzz(input)

        // Then | Assert
        assertEquals(
            expected = "Buzz",
            actual = result
        )
    }

    @Test
    fun `Given the number 30 When fizzBuzz is called Then we return "FizzBuzz"`() {
        // Given | Arrange
        val input = 30
        // When | Act
        val result: String = fizzBuzz(input)

        // Then | Assert
        assertEquals(
            expected = "FizzBuzz",
            actual = result
        )
    }

}