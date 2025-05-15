package kata.feb0225

import kata.feb0225.InputReader.parse
import kotlin.test.Test
import kotlin.test.assertEquals

class InputReaderSpec {
    @Test
    fun `When parse is called Then it converts the input into updaterules`() {
        // Assign
        val input = """
        47|53
        97|13
        97|61
        97|47
        75|29
        61|13

        75,47,61,53,29
        97,61,53,29,13
    """.trimIndent()

        // Act
        val (_, updateRule) = parse(input)

        // Assert
        assertEquals(
            actual = updateRule,
            expected = listOf(
                listOf(75,47,61,53,29),
                listOf(97,61,53,29,13)
            )
        )
    }

    @Test
    fun `When parse is called Then it converts the input into lookup table`() {
        // Assign
        val input = """
        47|53
        97|13
        97|61
        97|47
        75|29
        61|13

        75,47,61,53,29
        97,61,53,29,13
    """.trimIndent()

        // Act
        val (lookupTable, _) = parse(input)

        // Assert
        assertEquals(
            actual = lookupTable,
            expected = mapOf(
                53 to listOf(47),
                13 to listOf(97,61),
                61 to listOf(97),
                47 to listOf(97),
                29 to listOf(75),
            )
        )
    }
}