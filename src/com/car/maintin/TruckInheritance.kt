package com.car.maintin

// Inheritance
// Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
class TruckInheritance: ClassConstructor {

    var subType: String? = null

    constructor(type: String, model: Int, price: Double, milesDrive: Int, owner: String, subType: String) : super(type, model, price, milesDrive, owner) {
        this.subType = subType
    }

    // Must use "override" modifier to override a base class function
    override fun getCarPrice(): Double {
        return this.getPrice() - (this.milesDrive!!.toDouble() * 20)
    }

    fun getCarPriceWrapper(): Double {
        // call parent
        return super.getCarPrice()
    }
}

// Extensions in Kotlin
fun TruckInheritance.getCarPriceExtension(): Double {
    println("Extension...")
    return this.getCarPrice()
}

fun main() {
    // Instance of class
    val truck = TruckInheritance("BMW", 2015, 10000.0, 105, "Shubham Dhage", "A100")
    println(truck.subType)
    println(truck.getCarPrice())
    println(truck.getCarPriceWrapper())
    println(truck.getCarPriceExtension())
}