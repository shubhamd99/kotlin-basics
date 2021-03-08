package Functions

import kotlin.random.Random

class Person() {

    private var name: String? = null
    public var age: Int = 0
    public var place: String? = null

    constructor(name: String, age: Int, place: String): this() {
        this.name = name
    }

    constructor(name: String): this() {
        this.name = name
    }

    public fun moveTo(loc: String) {
        this.place = loc
    }

    public fun incrementAge() {
        this.age++
    }
}

fun main() {
    // Here's a typical usage of a scope function:
    Person("Alice", 20, "Amsterdam").let {
        println(it)
        it.moveTo("London")
        it.incrementAge()
        println(it)
    }

    // Without let
    val alice = Person("Alice", 20, "Amsterdam")
    println(alice)
    alice.moveTo("London")
    alice.incrementAge()
    println(alice)

    // This
    val adam = Person("Adam").apply {
        age = 20      // same as this.age = 20 or adam.age = 20
        place = "London"
    }
    println(adam)


    // Run
    val str = "Hello"
    // this
    str.run {
        println("The receiver string length: ${this.length}") // we can also write length instead of this.length
        //println("The receiver string length: ${this.length}") // does the same
    }
    // it
    str.let {
        println("The receiver string's length is ${it.length}")
    }



    // Apply
    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Sorting the list") }
        .sort()

    // let, run, and with return the lambda result.
    // So, you can use them when assigning the result to a variable, chaining operations on the result, and so on.
    val numbers = mutableListOf("one", "two", "three")

    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count { it.endsWith("e") }
    }
    println("There are $countEndsWithE elements that end with e.") // There are 3 elements that end with e.

    // With
    with(numbers) {
        val firstItem = first()
        val lastItem = last()
        println("First item: $firstItem, last item: $lastItem") // First item: one, last item: five
    }

    // Filter
    val resultList = numbers.map { it.length }.filter { it > 3 }
    println(resultList)

    numbers.map { it.length }.filter { it > 3 }.let {
        println(it)
        // and more function calls if needed
    }
}


fun getRandomInt(): Int {
    return Random.nextInt(100).also {
        println("getRandomInt() generated value $it")
    }
}