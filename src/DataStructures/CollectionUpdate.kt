package DataStructures

/*
mutable: you can update, add more
in-mutable: you cannot update, you can not add more
 */

fun main() {

    // im-mutable
    var list = listOf<String>("Shubham", "Srikar")
    for (name in list) {
        println("Name: $name")
    }

    // mutable
    var list2 = mutableListOf<String>("Shubham", "Srikar")
    list2[0] = "AYush"
    for (name in list2) {
        println("Name: $name")
    }

    // im-mutable map
    var listOfUsermap = mapOf<Int, String>(1 to "Shubham", 2 to "Nayan")

    // mutable map
    var listOfUsermap2 = mutableMapOf<Int, String>(1 to "Shubham", 2 to "Nayan")

    // im-mutable
    var listOfUserhashmap = hashMapOf<Int, String>(1 to "Shubham", 2 to "Nayan")


}