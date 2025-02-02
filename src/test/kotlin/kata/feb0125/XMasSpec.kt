package kata.feb0125

import org.junit.jupiter.api.Disabled
import kotlin.test.Test
import kotlin.test.assertEquals

// https://adventofcode.com/2024/day/4
class XMasSpec {
    @Test
    fun `given a string , when I call the xmas calc function, then it returns 18 matches`() {
        val letters = """
            MMMSXXMASM
            MSAMXMSMSA
            AMXSXMAAMM
            MSAMASMSMX
            XMASAMXAMM
            XXAMMXXAMA
            SMSMSASXSS
            SAXAMASAAA
            MAMMMXMMMM
            MXMXAXMASX
        """.trimIndent()
        val result = XMas.countXmas(letters)

        assertEquals(18, result)
    }

    @Test
    fun `given a row, find XMAS or SAMX` () {
        val line = ".....XMAS\n.....SAMX" /// .....XMAS.
        val result = XMas.countXmas(line)
        assertEquals(2, result)
    }

    @Test
    fun `given a column, find XMAS or SAMX` () {
        val line = "........X\n........M\n.......A\n.......S" /// .....XMAS
        val result = XMas.countXmas(line)
        assertEquals(1, result)
    }
}