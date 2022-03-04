import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ComparinatorTest {

    @Test
    fun testAllVerified() {
        val set = listOf(22, 22, 23, 1, 23, 23, 24, 0)
        val (correct, _) = comparinator(set)
        assertEquals(2, correct)
    }

    @Test
    fun testNoneVerified() {
        val set = listOf(22, 22, 23, 0, 23, 23, 24, 1)
        val (_, incorrect) = comparinator(set)
        assertEquals(2, incorrect)
    }

    @Test
    fun testEqualVerified() {
        val set = listOf(22, 22, 23, 1, 23, 23, 24, 1)
        val (correct, incorrect) = comparinator(set)
        assertEquals(1, correct)
        assertEquals(1, incorrect)
    }

}