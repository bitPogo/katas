package kata.january1625


import org.junit.jupiter.api.DynamicTest
import org.junit.jupiter.api.DynamicTest.dynamicTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestFactory
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ReportAnalyzerSpec {
    @TestFactory
    fun `When checkSafety is called Then it returns false if not all number are either increasing or decreasing`(): List<DynamicTest> {
        // Given | Arrange
        return listOf(
            "increasing" to intArrayOf(1, 2, 2, 4, 5),
            "decreasing" to intArrayOf(5, 4, 3, 3, 1),
            "mixed" to intArrayOf(5, 4, 3, 4, 5),
        ).map { (name, report) ->
            dynamicTest("When checkSafety is called Then it fails if not all number is $name") {
                // When | Act
                val actual = ReportAnalyzer().checkSafety(report)

                // Then | Assert
                assertFalse(actual)
            }
        }
    }

    @TestFactory
    fun `When checkSafety is called with safely increasing numbers Then it returns true`(): List<DynamicTest> {
        // Given | Arrange
        return listOf(
            "increasing by one" to intArrayOf(1,2,3,4,5),
            "increasing by two" to intArrayOf(2,4,6,8,10),
            "increasing by three" to intArrayOf(1,4,7,10,13),
        ).map { (name, report) ->
            dynamicTest("When checkSafety is called with increasing numbers $name Then it returns true") {
                // When | Act
                val actual = ReportAnalyzer().checkSafety(report)
                // Then | Assert
                assertTrue(actual)
            }
        }
    }

    @Test
    fun `It fulfils the ReportAnalyzerContract`() {
        assertTrue {
            ReportAnalyzer() is ReportAnalyzerContract
        }
    }
}