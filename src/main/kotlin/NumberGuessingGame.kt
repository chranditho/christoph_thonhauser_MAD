import util.countSharedDigits
import util.countSharedDigitsAtSamePosition
import util.generateFourDigitNumberWithUniqueDigits

class NumberGuessingGame {

    companion object {


        fun start() {

            println("Welcome to the Number Guessing Game!")
            println()

            val correctGuess = readPlayerInput()

            println("Congratulations, you have won!")
            println("You have found the correct number $correctGuess.")
        }

        private fun readPlayerInput(): Int {
            val numberToGuess = generateFourDigitNumberWithUniqueDigits()
            var guess = 0

            while (guess != numberToGuess) {
                print("Please input a 4-digit number:   ")
                val input = readlnOrNull()
                if (input == "help") {
                    println("Here's a little help: $numberToGuess")
                    continue
                }
                if (validateInput(input)) continue

                guess = input?.toInt()!!
                val n = countSharedDigits(guess, numberToGuess)
                val m = countSharedDigitsAtSamePosition(guess, numberToGuess)
                if (m != 4) println("Try again: $n:$m")
            }
            return guess
        }

        private fun validateInput(input: String?): Boolean {
            when {

                input?.toDoubleOrNull() == null -> {
                    println("The input '$input' is not a number.")
                    return true
                }

                input.length != 4 -> {
                    println("The input is ${input.length} digits long. Only 4-digit numbers are valid.")
                    return true
                }
            }
            return false
        }
    }
}