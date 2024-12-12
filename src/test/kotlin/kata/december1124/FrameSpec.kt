package kata.december1124

import org.junit.jupiter.api.Test
import kotlin.random.Random
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FrameSpec {
    private val valueGenerator = Random(23)

    @Test
    fun `When addPins is called Then a new entry is added to the pinsRolled`() {
        // Given
        val pins = listOf(
            valueGenerator.nextInt(),
            valueGenerator.nextInt(),
            valueGenerator.nextInt(),
        )

        // When
        val frame = Frame()
        pins.forEach { frame.add(it) }

        // Then
        assertEquals(
            actual = frame.pinsRolled,
            expected = pins
        )
    }

    @Test
    fun `It fulfils the FrameContract`() {
        assertTrue {
            @Suppress("USELESS_IS_CHECK")
            Frame() is FrameContract
        }
    }
}