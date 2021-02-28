### Kotlin

Kotlin is a cross-platform, statically typed, general-purpose programming language with type inference. Kotlin is designed to interoperate fully with Java, and the JVM version of Kotlin's standard library depends on the Java Class Library, but type inference allows its syntax to be more concise

![kotlin bg](https://i.imgur.com/WXQkZmV.png)

###### Multithreading
Multithreading is a process of executing multiple threads simultaneously. A thread is a lightweight sub-process, the smallest unit of processing. Multiprocessing and multithreading, both are used to achieve multitasking. However, we use multithreading than multiprocessing because threads use a shared memory area.

###### Array
Array is collection of similar data types either of Int, String etc. Array in Kotlinis mutable in nature with fixed size which means we can perform both read and write operations on elements of array.

```
val maxSize = 5
val listOfPets: Array<String> = Array(maxSize){""}
listOfPets[i] = petName
```

###### ArrayList
Kotlin ArrayList class is used to create a dynamic array. Which means the size of ArrayList class can be increased or decreased according to requirement.

```
val listOfPets: ArrayList<String> = ArrayList<String>()
listOfPets.add(petName)
```

###### LinkedList
A linked list is a linear collection of data elements whose order is not given by their physical placement in memory.
Instead, each element points to the next. It is a data structure consisting of a collection of nodes which together represent a sequence.

```
val listOfPets: LinkedList<String> = LinkedList<String>()
listOfPets.add(petName)
```

###### HashMap
A hash table is a data structure that implements an associative array abstract data type, a structure that can map keys to value. A hash table uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found.

```
var listOfUsers = HashMap<Int, String>()

listOfUsers[123] = "SHubham Dhage"
listOfUsers[554] = "Viacom"
listOfUsers[12] = "Rohan"
```

###### Nested Loops
```
loop@ for (number in 1..7) {
        for (innerLoop in 1..7) {
            if (innerLoop == 6) {
                break@loop // It will break outer loop
            }
        }
}
```

###### Readline
```
val age = readLine()!!.toInt()
val name = readLine()!!.toString()
```

###### Try Catch
```
try {
    // Your Code
} catch (ex: Exception) {
       println(ex.message)
}
```

###### Strings
```
val message = "Welcome to My Github"
val name = "Shubham"
val allMessage = "$name, $message"

val listOfTokens: List<String> = message.trim().split(" ")

// Loop through string
for (token in listOfTokens) {

}
```

###### Function Overloading
Function overloading or method overloading is the ability to create multiple functions of the same name with different implementations.

```
fun add(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun add(number1: Int, number2: Int, number3: Int): Int {
    return number1 + number2 + number3
}
```

###### Lambda
A lambda expression is a short block of code which takes in parameters and returns a value.

```
val sum = { number1: Int, number2: Int ->
    number1 + number2
}
val addNumbers = sum(3, 5)

val listOfNumbers = listOf(10, 20, 40, 60)
// For Each Loop
listOfNumbers.forEach { number ->
        println(number)
}
```

###### Functions

```
fun addNumbers(x: Double = 0.0, y: Double = 0.0): Double {
   val temp = x + y
    println("Sum : $temp")
    return temp
}
```

###### Polymorphism
Polymorphism is the ability of an object to take on many forms.

```
fun showInfo(cardId: Int) {
    println("CardId: $cardId")
}

fun showInfo(name: String) {
    println("Name: $name")
}

showInfo(23)
showInfo("Shubham")
```

###### Collections
The Kotlin Standard Library provides a comprehensive set of tools for managing collections. The Kotlin Standard Library provides implementations for basic collection types: sets, lists, and maps.

```
// im-mutable
var list = listOf<String>("Shubham", "Srikar")

// mutable
var list2 = mutableListOf<String>("Shubham", "Srikar")

var listOfUsermap = mapOf<Int, String>(1 to "Shubham", 2 to "Ayush")
var listOfUsermap2 = mutableMapOf<Int, String>(1 to "Shubham", 2 to "Ayush")
```

###### OOPS
Object-oriented programming System(OOPs) is a programming paradigm based on the concept of “objects” that contain data and methods to access those data. The primary purpose of object-oriented programming is to increase the flexibility and maintainability of programs.

###### Constructors
1. Primary Constructor
```
class Person constructor(name: String, age: Int, salary: Int) {

}
```
2. Initializer Block - We use an initializer block called init() to initialize the member variables with the constructor variables.

```
class Person(_name: String, _age: Int, _salary: Int) {
    // Member Variables (Properties) of the class
    var name: String
    var age: Int 
    var salary: Int 

    // Initializer Block
    init {
        this.name = _name
        this.age = _age 
        this.salary = _salary 
       println("Initialized a new Person object with Name = $name , age = $age and salary = $salary")
    }
}
```

3. Secondary Constructor - You can use one another constructor along with the primary constructor in Kotlin. Yeah, that's a cool feature of Kotlin.
   Note:--> You must call the primary constructor from the secondary constructor explicitly
```
class Student (var name: String) {
    init() {
        println("Student has got a name as $name")
    }

    constructor(sectionName: String, id: Int) this(sectionName) {

    }
}
```

###### Comparable
The Comparable interface provides a compareTo() function to compare two objects.

```
class Person(var name: String, var age: Int): Comparable<Person> {

    override fun compareTo(other: Person): Int {
        return this.age - other.age
    }
    
     var listOfNames = ArrayList<Person>()
     // Sorting is possible in array of objects with comparable
     listOfNames.sort()
}
```

###### Abstract
An abstract class is a class that is declared abstract —it may or may not include abstract methods. Abstract classes cannot be instantiated, but they can be subclassed. When an abstract class is subclassed, the subclass usually provides implementations for all of the abstract methods in its parent class. Abstract is a non-access modifier in java applicable for classes, methods but not variables.

```
abstract class Credit() {
    abstract fun newCard()
}

class UserInfo(): Credit() {
    override fun newCard() {
        println("New Card Created")
    }
}
```

###### Data Class
You often create classes whose main purpose is to hold data. In such classes, some standard functionality and utility functions are often mechanically derivable from the data. In Kotlin, these are called data classes and are marked with data

```
data class Person(val name: String, val age: Int, val gender: String)

val person = Person("Shubham Dhage", 23, "male")
```

###### Enum
Enum in Java is a data type which contains a fixed set of constants. Enum constants today aren’t just mere collections of constants – they can have properties, implement interfaces, and much more.

```
enum class Direction {
   NORTH, SOUTH, EAST, WEST
}
var userdirect = Direction.SOUTH

enum class CardType(val color: String) {
    SILVER("gray"),
    GOLD("yellow"),
    PLATINUM("black")
}
val color = CardType.SILVER.color
```

###### Interface
Interfaces in Kotlin can contain declarations of abstract methods, as well as method implementations.

```
interface CreditCard {
    val cardNumber: String
    fun score(age: Int)
}

class MasterCard(override val cardNumber: String): CreditCard {

    override fun score(age: Int) {
        if (age > 50) {
            println("Negative")
        }
    }
}

// Delegation
class PayPal(client: CreditCard): CreditCard by client {

    fun print(): String {
        return this.cardNumber
    }
}
```

###### Delegation
Delegation is simply passing a duty off to someone/something else. Delegation can be an alternative to inheritance. Delegation means that you use an object of another class as an instance variable, and forward messages to the instance.

```
interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base) : Base by b

fun main() {
    val b = BaseImpl(10)
    Derived(b).print()
}
```

###### Inheritance
Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.

```
open class Shape {
    open fun draw() { /*...*/ }
    fun fill() { /*...*/ }
}

class Circle() : Shape() {
    override fun draw() { /*...*/ }
}

val circle = Circle()
circle.fill()
circle.fun()
```

###### Generics
Generics are the powerful features that allow us to define classes, methods and properties which are accessible using different data types while keeping a check of the compile-time type safety.

```
class MyClass<T>(text: T) {
    var name = text
}
val my : MyClass<String> = Myclass<String>("GeeksforGeeks")

fun <T> display(process: T) {
    println(process)
}
display<String>("Hello")
```

###### Singleton
Singleton class is a class that can have only one object (an instance of the class) at a time.

```
class Singleton {

    var name: String? = null;

    private constructor() {
        println("Instance is created")
    }

    // lazy() is a function that takes a lambda and returns an instance of Lazy<T> which can serve as a delegate for implementing a lazy property
    // the evaluation of lazy properties is synchronized
    companion object {
        val instance: Singleton by lazy { Singleton() }
    }
}

 var s1 =  Singleton.instance
 s1.name = "Shubham"
 println(s1.name)

 var s2 =  Singleton.instance
 println(s2.name)
```

###### Nested Class
The purpose of nested classes is to group classes that belong together, which makes your code more readable and maintainable.

```
class outerClass{  
   //outer class code  
    class nestedClass{  
      //nested class code  
    }  
}  

// Inner class cannot be declared inside interfaces or non-inner nested classes.
class outerClass{  
   //outer class code  
    inner class innerClass{  
      //nested class code  
    }  
}  
```

###### Overriding

```
open class Operations1 {

    open fun sum(n1: Int, n2: Int): Int {
        return n1 + n2
    }

    fun div(n1: Int, n2: Int): Int {
        return n1 / n2
    }
}

class MultiOperations1: Operations1 {

    constructor(): super() {}

    override fun sum(n1: Int, n2: Int): Int {
        return n1 + n2 * 3
    }

    fun sub(n1: Int, n2: Int): Int {
        return n1 - n2
    }
}

val mop = MultiOperations1() as Operations1 // Casting
```