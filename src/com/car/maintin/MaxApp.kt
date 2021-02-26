package com.car.maintin

// Extensions in Kotlin
fun ArrayList<Int>.findMax(): Int {
    var maxNumber = 0
    for (item in this) {
        if (item > maxNumber) {
            maxNumber = item
        }
    }
    return maxNumber
}

fun main() {

    var listOfElements = ArrayList<Int>()
    listOfElements.add(12)
    listOfElements.add(22)
    listOfElements.add(21)

    for (item in listOfElements) {
        println("item $item ")
    }

    println("Find max: ${listOfElements.findMax()}")
}