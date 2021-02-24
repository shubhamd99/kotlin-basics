fun main() {

    // For Loops

    // 1 2 3 4 5
    for (i in 1..5) {
        println("i: $i")
    }

    // 1 3 5
    for (i in 0..5 step 2) {
        println("step: $i")
    }

    // 20 19 18.... (Decrement)
    for (i in 20 downTo 0 step 1) {
        println("downTo: $i")
    }


    // While Loop
    var whileCounter = 1
    // 1...9
    while (whileCounter < 10) {
        println("while counter: $whileCounter")
        whileCounter++ // whileI += 1
    }

    // Do-While Loop
    // 1...10
    var doWhileCounter = 1
    do {
        println("Do While Counter $doWhileCounter")
        doWhileCounter++
    } while (doWhileCounter <= 10)


    // Nested Loops and condition
    myloop@ for(ch in 'A'..'C'){
        for (n in 1..4){
            println("$ch and $n")
            if(n==2)
                break@myloop
        }
    }

    // Returns and Jumps
    for (number in 1..5) {
        if (number == 4) {
            continue
        }
        println(number)
    }
    for (number in 1..5) {
        if (number == 4) {
            break
        }
        println(number)
    }

    loop@ for (number in 1..7) {
        for (innerLoop in 1..7) {
            if (innerLoop == 6) {
                break@loop // It will break outer loop
            }
        }
    }

    // Print Even
    for(number in 1..100)
        if(number % 2 == 0)
            println("even: $number")
}