package kata.feb2725

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class JaysSortSpec {
    @Test
    fun `When solution is called Then it returns a renamed but order list of Photos`() {
        // Arrange
        val input = """
        photo.jpg, Warsaw, 2013-09-05 14:08:15
        Jay.png, London, 2015-06-20 15:13:22
        myFriends.png, Warsaw, 2013-09-05 14:07:13
        Eiffel.jpg, Paris, 2015-07-23 08:03:02
        pisatower.jpg, Paris, 2015-07-22 23:59:59
        BOB.jpg, London, 2015-08-05 00:02:03
        notredame.png, Paris, 2015-09-01 12:00:00
        me.jpg, Warsaw, 2013-09-06 15:40:22
        a.png, Warsaw, 2016-02-13 13:33:50
        b.jpg, Warsaw, 2016-01-02 15:12:22
        c.jpg, Warsaw, 2016-01-02 14:34:30
        d.jpg, Warsaw, 2016-01-02 15:15:01
        e.png, Warsaw, 2016-01-02 09:49:09
        f.png, Warsaw, 2016-01-02 10:55:32
        g.jpg, Warsaw, 2016-02-29 22:13:11
    """.trimIndent()

        // Act
        val photos = solution(input)

        // Arrange
        assertEquals(
            actual = photos,
            expected = """
                Warsaw02.jpg
                London1.png
                Warsaw01.png
                Paris2.jpg
                Paris1.jpg
                London2.jpg
                Paris3.png
                Warsaw03.jpg
                Warsaw09.png
                Warsaw07.jpg
                Warsaw06.jpg
                Warsaw08.jpg
                Warsaw04.png
                Warsaw05.png
                Warsaw10.jpg
            """.trimIndent()
        )
    }

    @Test
    fun `when solution is called with only one photo (warsaw) then it returns the name a trailing 1 and the photo extension`() {
        // Given
        val input = "photo.jpg, Warsaw, 2013-09-05 14:08:15"

        // When
        val photos = solution(input)

        // Then
        assertEquals(
            actual = photos,
            expected = "Warsaw1.jpg"
        )
    }

    @Test
    fun `when solution is called with only one photo (london) then it returns the name a trailing 1 and the photo extension`() {
        // Given
        val input = "photo.png, London, 2013-09-05 14:08:15"

        // When
        val photos = solution(input)

        // Then
        assertEquals(
            actual = photos,
            expected = "London1.png"
        )
    }

    @Test
    fun `when solution is called with only two photos of the same city in order (london) then it returns the name a trailing number which indicates the order and the photo extension`() {
        // Given
        val input = """
            photo.png, London, 2012-09-05 14:08:15
            photo.png, London, 2013-09-05 14:08:15
        """.trimIndent()

        // When
        val photos = solution(input)

        // Then
        assertEquals(
            actual = photos,
            expected = """
                London1.png
                London2.png
            """.trimIndent(),
        )
    }
}