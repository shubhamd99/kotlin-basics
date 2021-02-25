package Functions

// fun sum(number1: Int, number2: Int): Int {
   // return number1 + number2
// }

// A lambda expression is a short block of code which takes in parameters and returns a value.
val sum = { number1: Int, number2: Int ->
    number1 + number2
}

fun main() {
    val addNumbers = sum(3, 5)
    println(addNumbers)

    val listOfNumbers = listOf(10, 20, 40, 60)

    // normal loop
    // for (number in listOfNumbers) {
       // println(number)
    // }

    // Lambda For Each
    listOfNumbers.forEach { number ->
        println(number)
    }
}