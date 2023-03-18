package numberguessinggame.util

fun countSharedDigits(num1: Int, num2: Int): Int {
    val digits1 = num1.toString().toSet()
    val digits2 = num2.toString().toSet()
    return digits1.intersect(digits2).size
}

fun countSharedDigitsAtSamePosition(num1: Int, num2: Int): Int {
    val digits1 = num1.toString().toList()
    val digits2 = num2.toString().toList()
    return digits1.zip(digits2).count { (a, b) -> a == b }
}