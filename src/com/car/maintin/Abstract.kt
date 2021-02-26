package com.car.maintin

// abstract is a non-access modifier in java applicable for classes, methods but not variables.
abstract class Credit() {

    fun creditID(): String {
        return "12234"
    }

    abstract fun newCard()
}

class UserInfo(): Credit() {

    fun getInfo(): String {
        return creditID()
    }

    override fun newCard() {
        println("New Card Created")
    }
}

fun main() {
    // var credit = Credit()
    // println(credit.CreditID())
    var user = UserInfo()
    println(user.getInfo())
    println(user.newCard())
}