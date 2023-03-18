package numberguessinggame.util

import numberguessinggame.util.countSharedDigits
import numberguessinggame.util.countSharedDigitsAtSamePosition
import org.junit.Assert.assertEquals
import org.junit.Test

class NumberCheckerKtTest {
    @Test
    fun testCountSharedDigits() {
        assertEquals(0, countSharedDigits(123, 789))
        assertEquals(1, countSharedDigits(123, 561))
        assertEquals(2, countSharedDigits(123, 341))
        assertEquals(3, countSharedDigits(123, 321))
    }

    @Test
    fun testCountSharedDigitsAtSamePosition() {
        assertEquals(0, countSharedDigitsAtSamePosition(123, 312))
        assertEquals(1, countSharedDigitsAtSamePosition(123, 321))
        assertEquals(2, countSharedDigitsAtSamePosition(123, 143))
        assertEquals(3, countSharedDigitsAtSamePosition(123, 123))
    }
}