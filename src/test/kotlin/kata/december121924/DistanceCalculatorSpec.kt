package kata.december121924

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DistanceCalculatorSpec {
    @Test
    fun `When calculateDistance is called Then it calculates the distance between two lists`() {
        // Given
        val list1 = listOf(1,2,3,3,3,4)
        val list2 = listOf(3,3,3,4,5,9)

        // When
        val actual = calculateDistance(list1, list2)

        // Then
        assertEquals(
            actual = actual,
            expected = 11,
        )
    }
}