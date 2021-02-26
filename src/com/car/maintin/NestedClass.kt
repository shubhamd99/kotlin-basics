package com.car.maintin

//  The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.
class Outer {

    private val name: String? = null

    class Nested {
        fun show() {
            println("nested")
        }
    }
}

fun main() {
    var outer = Outer()
    var nested = Outer.Nested()
    nested.show()
}