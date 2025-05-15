package kata.december121924

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ListSorterSpec {
    @Test
    fun `When sort is called Then it sorts ascending the given two list`() {
        // Given
        val list1 = listOf(3, 4, 2, 1, 3, 3)
        val list2 = listOf(4,3,5,3,9,3)

        // When
        val (sortedList1, sortedList2) = sort(list1, list2)

        // Then
        assertEquals(
            actual = sortedList1,
            expected = listOf(1,2,3,3,3,4)
        )

        assertEquals(
            actual = sortedList2,
            expected = listOf(3,3,3,4,5,9)
        )
    }
}

