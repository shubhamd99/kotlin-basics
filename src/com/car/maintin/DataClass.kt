package com.car.maintin

// You often create classes whose main purpose is to hold data.
// In such classes, some standard functionality and utility functions are often mechanically derivable from the data.
// In Kotlin, these are called data classes and are marked with data
data class Person(val name: String, val age: Int, val gender: String)

fun main() {
    val person = Person("Shubham Dhage", 23, "male")
    println(person.name)
}