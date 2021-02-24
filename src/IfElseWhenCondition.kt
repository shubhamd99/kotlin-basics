fun main() {

    val age = readLine()!!.toInt()

    if (age > 60) {
        println("Age is greater than 60")
    }

    if (age >= 20) {

    }

    if (age in 20..30) {

    }

    // If and Else
    if (age in 18..20) {

    } else if (age < 18) {

    } else {

    }

    // When (Like Switch Statement)
    val foodId = readLine()!!.toInt()
    when(foodId) { // can be --> when (readLine()!!.toInt()) {  }
        1 -> {
            println("1")
        }

        10 -> {
            println("10")
        }

        else -> {
            println("Default")
        }
    }


    // When
    when {
        age >= 90 -> println("90")
        age in 80..90 -> println("80-90")
        age in 70..79 -> println("70-79")
        else -> println("Fail")
    }

    // Nested If
    if (age >= 50) {
        if (age > 25) {

        } else {

        }
    }

    // If and When
    val isMarried = true
    val GPA = 3.8

    val isQualified = if (isMarried && GPA >= 3.8) 1 else 0

    println(isQualified)


    val isGood = when(GPA) {
        4.0 -> true
        else -> false
    }

    println(isGood)


    // Even or Odd
    println("Enter a number to know if is even or odd")
    val number = readLine()?.toInt()

    if (number != null) {
        if (number % 2 == 0) {
            println("The number $number is even")
        } else {
            println("The number $number is odd")
        }
    }
}