package Functions

// default values
fun addNumbers(x: Double = 0.0, y: Double = 0.0): Double {
   val temp = x + y
    println("Sum : $temp")
    return temp
}

// variable arguments
fun displayInfo(vararg names: String) {
    for (name in names) {
        println("Name: $name")
    }
}

fun main() {
    addNumbers(3.0, 4.0)
    addNumbers(3.0)
    addNumbers(y = 3.0)

    // * Spread operator
    displayInfo(names = *arrayOf("Shubham", "Ayush", "Deepak"))
}