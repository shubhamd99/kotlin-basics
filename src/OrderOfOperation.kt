fun main() {

    // Operation will go from left to right
    // Since multiplication has higher priority it will go 10 * 2 then 20 + 3
    println(3 + 10 * 2) // 23

    println((3 + 10) * 2) // 26 --> Correct
}