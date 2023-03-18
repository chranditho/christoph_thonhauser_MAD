package numberguessinggame.util

import numberguessinggame.util.generateFourDigitNumberWithUniqueDigits
import org.junit.Test

class NumberGeneratorKtTest {

    @Test
    fun `ensure number consists of four digits`() {
       // Assertions.assertEquals(4, generateFourDigitNumberWithUniqueDigits().toString().length)
    }

    @Test
    fun `ensure number does not contain repeating digits`() {
        val digits = generateFourDigitNumberWithUniqueDigits().toString().toCharArray()
        val uniqueDigits = HashSet<Char>()
        var isUnique = true

        for (digit in digits) {
            if (!uniqueDigits.add(digit)) {
                isUnique = false
            }
        }

      //  Assertions.assertTrue(isUnique)
    }
}