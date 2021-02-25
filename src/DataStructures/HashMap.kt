package DataStructures

// A hash table is a data structure that implements an associative array abstract data type, a structure that can map keys to values.
// A hash table uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found.
fun main() {

    var listOfUsers = HashMap<Int, String>()
    // Id should be unique
    listOfUsers[123] = "SHubham Dhage"
    listOfUsers[554] = "Viacom"
    listOfUsers[12] = "Rohan"

    println("Print ID 123: ${listOfUsers[123]}")

    for (key in listOfUsers.keys)
        println("Keys: $key : ${listOfUsers[key]}")
}