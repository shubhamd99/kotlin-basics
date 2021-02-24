package DataStructures

// In Array List we don't have to define the size
fun main() {

    val listOfPets: ArrayList<String> = ArrayList<String>()

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