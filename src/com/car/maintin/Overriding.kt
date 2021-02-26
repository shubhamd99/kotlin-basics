package com.car.maintin

open class Operations1 {

    open fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}

class MultiOperations1: Operations1 {

    constructor(): super() {}

    override fun sum(n1: Int, n2: Int): Int {
        return n1 + n2 * 3
    }

    fun sub(n1: Int, n2: Int): Int {
        return n1 - n2
    }

    fun mul(n1: Int, n2: Int): Int {
        return n1 * n2
    }
}

fun main() {
    val op = Operations1()
    val sum = op.sum(10, 15)
    println("Sum $sum")
    val div = op.div(12, 12)
    println("div: $div")

    //second
    // val mop = MultiOperations1()
    val mop = MultiOperations1() as Operations1 // Casting
    // val sub = mop.sub(10, 15) --> we cannot able to call MultiOperations1 methods since it is casted
    // println("Sum $sub")
    // val mul = mop.mul(12, 12) --> cannot access
    // println("div: $mul")
}