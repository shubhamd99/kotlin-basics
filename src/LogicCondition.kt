/*
* >
* <
* >=
* <=
* ==
* !=
* &&
* ||
* !
* */

fun main() {

    val number = 8
    val compare = (number >= 1 && number <= 10)
    val compare2 = (number >= 1 || number <= 10)
    val age = 17

    println(compare) // true
    println(!(age == 22)) // true

    println(age in 18..22) // false
}