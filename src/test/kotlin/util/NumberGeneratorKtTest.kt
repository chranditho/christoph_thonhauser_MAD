package util

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberGeneratorKtTest {

    @Test
    fun `ensure number consists of four digits`() {
        Assertions.assertEquals(generateFourDigitNumber().toString().length, 4)
    }

    @Test
    fun `ensure number does not contain repeating digits`() {
        val digits = generateFourDigitNumber().toString().toCharArray()
        val uniqueDigits = HashSet<Char>()
        var isUnique = true

        for (digit in digits) {
            if (!uniqueDigits.add(digit)) {
                isUnique = false
            }
        }

        Assertions.assertTrue(isUnique)
    }
}