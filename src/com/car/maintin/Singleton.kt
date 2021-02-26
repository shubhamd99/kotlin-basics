package com.car.maintin

// Singleton class is a class that can have only one object (an instance of the class) at a time.
class Singleton {

    var name: String? = null;

    private constructor() {
        println("Instance is created")
    }

    // lazy() is a function that takes a lambda and returns an instance of Lazy<T> which can serve as a delegate for implementing a lazy property
    // the evaluation of lazy properties is synchronized
    companion object {
        val instance: Singleton by lazy { Singleton() }
    }
}

fun main() {
    var s1 =  Singleton.instance
    s1.name = "Shubham"
    println(s1.name)

    var s2 =  Singleton.instance
    println(s2.name)

    var s3 =  Singleton.instance
    println(s3.name)
}