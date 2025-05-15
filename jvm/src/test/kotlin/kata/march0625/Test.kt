package kata.march0625

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

infix fun Int.lessEquals(value: Int) {
    try {
        assert(this <= value)
    } catch (e: AssertionError) {
        throw AssertionError("better message")
    }
}

internal class GildedRoseTest {
    @Test
    fun `When updateQuality is called Then the resulting Items do not change their names`() {
        // Given | Arrange
        val itemNames = listOf("foo", "bar")
        val items = itemNames.map { itemName ->
            Item(itemName, 0, 0)
        }

        // When | Act
        val app = GildedRose(items)
        app.updateQuality()

        // Then | Assert
        itemNames.forEachIndexed { index, itemName ->
            assertEquals(
                expected = itemName,
                actual = app.items[index].name,
                message = "Expected $itemName at index $index."
            )
        }
    }

    @Test
    fun `When updateQuality is called on only items with quality 0 Then the resulting Items have a quality of 0`() {
        // Given | Arrange
        val items = listOf(
            Item("foo", 0, 0),
            // Item("bar", 0, -1)
        )

        // When | Act
        val app = GildedRose(items)
        app.updateQuality()

        // Then | Assert
        app.items.forEach { item ->
            assertEquals(
                expected = 0,
                actual = item.quality,
                message = "Expected 0 with item ${item.name}."
            )
        }
    }
}