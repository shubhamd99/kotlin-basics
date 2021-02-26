import kotlin.collections.ArrayList

class Person(var name: String, var age: Int): Comparable<Person> {

    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }
}

fun main() {
    var listOfNames = ArrayList<Person>()
    listOfNames.add(Person("Shubham", 23))
    listOfNames.add(Person("Ayush", 42))
    listOfNames.add(Person("Bittu", 32))

    println("Before sort")

    for (person in listOfNames) {
        println("Name: ${person.name}")
    }

    println("After sort")

    listOfNames.sort()
    // Collections.sort(listOfNames)

    for (person in listOfNames) {
        println("Name: ${person.name}")
    }
}