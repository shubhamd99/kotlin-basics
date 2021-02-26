package com.car.maintin

// Primary Constructor
class Car(var type: String, val model: Int, val price: Double, val milesDrive: Int, val owner: String) {

    // // Initializer block
    // Either we can use secondary constructor or we can use init block.
    // The init block is always called after the primary constructor
    init {
        println("Object is created")
    }

    fun getCarPrice(): Double {
        return price - (this.milesDrive.toDouble() * 10)
    }
}


fun main() {
    // Instance of class
    val car = Car("BMW", 2015, 10000.0, 105, "Shubham Dhage")
    car.type = "Audi"
    println(car.type)

    val car2 = Car("BMW", 2019, 10000.0, 105, "Shubham Dhage")
    println(car2.type)
    println(car2.getCarPrice())


    // Array List
    val listOfCars = arrayListOf<Car>()
    listOfCars.add(car)
    listOfCars.add(car2)

    for (carr in listOfCars) {
        println("Array List ${carr.type}")
    }
}