class NumberGuessingGame {

    private fun generateFourDigitNumber(): Number {
        val oncePlace = (Math.random() * 10).toInt()

        var tensPlace = (Math.random() * 10).toInt()
        while (oncePlace == tensPlace)
            tensPlace = (Math.random() * 10).toInt()

        var hundredsPlace = (Math.random() * 10).toInt()
        while (hundredsPlace == oncePlace || hundredsPlace == tensPlace)
            hundredsPlace = (Math.random() * 10).toInt()

        var thousandsPlace = (Math.random() * 10).toInt()
        while (thousandsPlace == oncePlace || thousandsPlace == tensPlace || thousandsPlace == hundredsPlace)
            thousandsPlace = (Math.random() * 10).toInt()

        tensPlace *= 10
        hundredsPlace *= 100
        thousandsPlace *= 1000

        return oncePlace + tensPlace + hundredsPlace + thousandsPlace
    }

    fun play() {
        println("Welcome to the Number Guessing Game!")

        // print("Please input your first 4-digit number guess:   ")

        val numberToGuess = generateFourDigitNumber()
        println("This is the number to guess:  $numberToGuess")
    }
}