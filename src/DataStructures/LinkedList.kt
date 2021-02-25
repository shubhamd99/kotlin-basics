package DataStructures

import java.util.*

// a linked list is a linear collection of data elements whose order is not given by their physical placement in memory.
// Instead, each element points to the next. It is a data structure consisting of a collection of nodes which together represent a sequence.
fun main() {

    val listOfPets: LinkedList<String> = LinkedList<String>()

    do {
        print("Enter pet name or Enter quit for exit: ")
        val petName = readLine()!!.toString()
        if (petName != "quit") {
            listOfPets.add(petName)
        }
    } while (petName != "quit")


    for (i in 0 until listOfPets.size) {
        println("Pet $i : ${listOfPets[i]}")
    }

    // Proper way
    for (pet in listOfPets) {
        println("Pet : $pet")
    }

    // Array includes cat or not
    if (listOfPets.contains("cat")) {
        println("Cat is there.....OMG")
    }
}