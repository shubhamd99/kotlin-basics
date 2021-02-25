package Functions

// Function overloading or method overloading is the ability to create multiple functions of the same name with different implementations.

fun add(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun add(number1: Int, number2: Int, number3: Int): Int {
    return number1 + number2 + number3
}

fun add(number1: Int, number2: Int, number3: Int, number4: Int): Int {
    return number1 + number2 + number3 + number4
}

fun main() {
    println(add(1,2))
    println(add(1,2, 3))
    println(add(1,2, 3, 4))
}

