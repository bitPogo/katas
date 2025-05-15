package kata.december121924

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ResourceLoaderSpec {
    @Test
    fun `When load is called Then it resolves the given Resource`() {
        // Given
        val resource = "/Day1"

        // When
        val (list1, list2) = ResourceLoader.load(resource)

        // Then
        assertEquals(
            expected = listOf(3, 4, 2, 1, 3, 3),
            actual = list1
        )
        assertEquals(
            expected = listOf(4,3,5,3,9,3),
            actual = list2
        )
    }
}