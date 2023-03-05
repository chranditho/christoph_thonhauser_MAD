import util.generateFourDigitNumber

class NumberGuessingGame {

    companion object {
        fun start() {
            println("Welcome to the Number Guessing Game!")

            // print("Please input your first 4-digit number guess:   ")

            val numberToGuess = generateFourDigitNumber()
            println("This is the number to guess:  $numberToGuess")
        }
    }
}