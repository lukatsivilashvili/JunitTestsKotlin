import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StringCalculatorTest {
    private val stringCalculator = StringCalculator()

    @Test
    fun add_two() {
        assertEquals(3, stringCalculator.add("1,2"))
    }

    @Test
    fun add_anyNum() {
        assertEquals(15, stringCalculator.add("1,2,3,4,5"))
    }

    @Test
    fun add_with_newLine() {
        assertEquals(15, stringCalculator.add("1\n2,3,4\n5"))
    }

    @Test
    fun add_with_custom_delimiter(){
        assertEquals(10, stringCalculator.add("//;\n1;2;3;4"))
    }
}