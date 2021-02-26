package com.car.maintin

// Enum in Java is a data type which contains a fixed set of constants

enum class Direction {
    NORTH, SOUTH, EAST, WEST
}

fun main() {

    var userdirect = Direction.SOUTH

    if (userdirect == Direction.SOUTH) {
        println("he wen to north")
    } else {
        println("I dont know where he went")
    }
}