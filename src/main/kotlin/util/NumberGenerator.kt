package util

fun generateFourDigitNumberWithUniqueDigits(): Int {
    val oncePlace = (Math.random() * 10).toInt()

    var tensPlace = (Math.random() * 10).toInt()
    while (oncePlace == tensPlace)
        tensPlace = (Math.random() * 10).toInt()

    var hundredsPlace = (Math.random() * 10).toInt()
    while (hundredsPlace == oncePlace || hundredsPlace == tensPlace)
        hundredsPlace = (Math.random() * 10).toInt()

    var thousandsPlace = (Math.random() * 10).toInt()
    while (thousandsPlace == oncePlace || thousandsPlace == tensPlace || thousandsPlace == hundredsPlace || thousandsPlace == 0)
        thousandsPlace = (Math.random() * 10).toInt()

    tensPlace *= 10
    hundredsPlace *= 100
    thousandsPlace *= 1000

    return oncePlace + tensPlace + hundredsPlace + thousandsPlace
}