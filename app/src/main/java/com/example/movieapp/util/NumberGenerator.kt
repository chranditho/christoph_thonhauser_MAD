package com.example.movieapp.util

fun generateFourDigitNumberWithUniqueDigits(): Int {
    val digits = mutableListOf<Int>()

    while (digits.size < 4) {
        val digit = (0..9).random()
        if (!digits.contains(digit)) {
            digits.add(digit)
        }
    }

    return digits[0] * 1000 + digits[1] * 100 + digits[2] * 10 + digits[3]
}
