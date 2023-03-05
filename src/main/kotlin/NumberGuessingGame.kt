import util.countSharedDigits
import util.countSharedDigitsAtSamePosition
import util.generateFourDigitNumber

class NumberGuessingGame {

    companion object {
        fun start() {
            val numberToGuess = generateFourDigitNumber()

            println("Welcome to the Number Guessing Game!")

            var guess = 0

            while (guess != numberToGuess) {
                print("Please input a 4-digit number guess:   ")
                val input = readlnOrNull()
                guess = input?.toInt()!!
                println()
                val n = countSharedDigits(guess, numberToGuess)
                val m = countSharedDigitsAtSamePosition(guess, numberToGuess)
                if (m != 4) println("Try again: $n:$m")
            }

            println("Congratulations, you have won!")
            println("You have found the correct number $numberToGuess.")
        }
    }
}