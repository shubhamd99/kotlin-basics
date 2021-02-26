package com.car.maintin

// Interfaces in Kotlin can contain declarations of abstract methods, as well as method implementations.
interface CreditCard {
    val cardNumber: String
    fun score(age: Int)
}

class MasterCard(override val cardNumber: String): CreditCard {

    override fun score(age: Int) {
        if (age > 50) {
            println("Negative")
        }
    }
}

class VisaCard(override val cardNumber: String): CreditCard {

    override fun score(age: Int) {
        if (age > 20) {
            println("Negative")
        }
    }

    fun printCreditCard() {
        println(this.cardNumber)
    }
}

// Delegation
// When you delegate, you are simply calling up some class which knows what must be done. You do not really care how it does it,
// all you care about is that the class you are calling knows what needs doing.
class PayPal(client: CreditCard): CreditCard by client {

    fun print(): String {
        return this.cardNumber
    }
}

fun main() {
    val visa = VisaCard("2343432")
    println(visa.score(23))
    println(visa.printCreditCard())

    val master = MasterCard("2343322")
    println(master.score(60))

    // Delegation
    val paypal = PayPal(master)
    println("Card: ${paypal.cardNumber} ${paypal.print()}")
}