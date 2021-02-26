package com.car.maintin

// Open Class to be Inherited
open class ClassConstructor() {
    var type: String? = null
    var model: Int? = null
    // The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
    private var price: Double? = null
    // The access level of a protected modifier is within the package and outside the package through child class.
    protected var milesDrive: Int? = null
    var owner: String? = null

    constructor(type: String, model: Int, price: Double, milesDrive: Int, owner: String) : this() {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }

    constructor(type: String, model: Int, price: Double, milesDrive: Int) : this() {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
    }

    open fun getCarPrice(): Double {
        return this.price!! - (this.milesDrive!!.toDouble() * 10)
    }

    fun getPrice(): Double {
        return this.price!!
    }
}

fun main() {
    // Instance of class
    val car = ClassConstructor("BMW", 2015, 10000.0, 105, "Shubham Dhage")
    car.type = "Audi"
    println(car.type)

    val car2 = ClassConstructor("BMW", 2019, 10000.0, 105)
    println(car2.type)
    println(car2.getCarPrice())

}