package DataStructures

fun main() {

    val maxSize = 5
    val listOfPets: Array<String> = Array(maxSize){""}

    for (i in 0 until maxSize) {
        listOfPets[i] = readLine()!!.toString()
    }
    for (i in 0 until maxSize) {
        println("Pet $i : ${listOfPets[i]}")
    }


    val listOfPrices: Array<Int> = Array(maxSize){0}
    for (i in 0 until maxSize) {
        listOfPrices[i] = readLine()!!.toInt()
    }
}