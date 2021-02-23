fun main() {

    // Read only
    val str: String = "Shubham"

    val str1: String
    str1 = "Dhage"

    println(str)
    println("Name: $str $str1")

    // Read and write
    var count = 1
    println("count $count")
    count = 10
    println("count $count")

    // Optional
    var department: String?
    department = null
    department = "Software Engineering"
    println("department ${department!!}") // non-null assertion (!!)

    // Swap Numbers
    var x = 10
    var y = 20
    var temp: Int
    temp = x
    x = y
    y = temp
    println("x: $x, y: $y")
}