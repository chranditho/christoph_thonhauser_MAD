class NumberGuessingGame {

    private fun generateFourDigitNumber(): Number {
        val oncePlace = (Math.random() * 10).toInt()
        val tensPlace = (Math.random() * 10).toInt() * 10
        val hundredsPlace = (Math.random() * 10).toInt() * 100
        val thousandsPlace = (Math.random() * 10).toInt() * 1000

        return oncePlace + tensPlace + hundredsPlace + thousandsPlace
    }

    fun play() {
        println("Welcome to the Number Guessing Game!")

        // print("Please input your first 4-digit number guess:   ")

        val numberToGuess = generateFourDigitNumber()
        println("This is the number to guess:  $numberToGuess")
    }
}