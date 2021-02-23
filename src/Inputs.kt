fun main() {

    print("Enter Name: ")
    var name: String
    name = readLine()!!.toString()
    print("Enter Age: ")
    val age: Int = readLine()!!.toInt()
    print("Enter GPA: ")
    val gpa: Double = readLine()!!.toDouble()

    println("====User Info=====")
    println(name)
    println(age)
    println(gpa)
}