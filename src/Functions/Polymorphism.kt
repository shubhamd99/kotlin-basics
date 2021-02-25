package Functions

// Polymorphism is the ability of an object to take on many forms.
// Function overloading or method overloading is the ability to create multiple functions of the same name with different implementations.

fun showInfo(cardId: Int) {
    println("CardId: $cardId")
}

fun showInfo(name: String) {
    println("Name: $name")
}

fun main() {
    showInfo(23)
    showInfo("Shubham")
}