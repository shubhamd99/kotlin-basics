package com.car.maintin

// Using Generics, it is possible to create classes that work with different data types.
class UserAdmins<T> (credit: T) {

    init {
        println(credit)
    }
}

fun <T> display(process: T) {
    println(process)
}

fun main() {
    var userAdmin = UserAdmins<String>("Shubham")
    var userAdmin2 = UserAdmins<Int>(20)

    display<String>("Hello")
}