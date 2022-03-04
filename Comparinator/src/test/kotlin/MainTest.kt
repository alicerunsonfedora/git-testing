import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainTest {

    @Test
    fun testArgsCheck() {
        val invalidArgs = listOf("hello, world!").toTypedArray()
        assertEquals(1, mainWithReturn(invalidArgs))
    }

    @Test
    fun testInvalidFormat() {
        val invalidForm = listOf("22,23,24").toTypedArray()
        assertEquals(2, mainWithReturn(invalidForm))
    }

    @Test
    fun testMain() {
        val args = listOf("22,22,23,1,21,21,20,0").toTypedArray()
        assertEquals(0, mainWithReturn(args))
    }

}