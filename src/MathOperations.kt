fun main(args: Array<String>) {

    println("Simple Calculator")

    print("Enter number 1: ")
    val number1 = readLine()!!.toDouble()
    print("Enter number 2: ")
    val number2 = readLine()!!.toDouble()

    val sum = number1 + number2
    println("Sum: $sum")

    val sub = number1 - number2
    println("Sub: $sum")

    val mul = number1 * number2
    println("Mul: $sum")

    val div = number1 / number2
    println("Div: $sum")

    // Swap Two Numbers without using Temp variable
    var first = 12.0f
    var second = 24.5f

    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")

    // Code to swap 'x = 10' and 'y = 20'
    // x = x + y;  // x now becomes 15
    // y = x - y;  // y becomes 10
    // x = x - y;  // x becomes 5

    first = first - second // 12.5
    second = first + second // 12.0
    first = second - first // 24.5

    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")

}