package util

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class NumberGeneratorKtTest {

    @Test
    fun `ensure number consists of four digits`() {
        Assertions.assertEquals(generateFourDigitNumber().toString().length, 4)
    }
}