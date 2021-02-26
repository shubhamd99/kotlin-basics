import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main() {
    // ReadFile()
    println("Write to file text:")
    var str: String = readLine().toString()
    WriteToFile(str)

    ReadFile()
}

fun ReadFile() {
    try {
        var fin = FileReader("test.txt")
        var c: Int?

        do {
            c = fin.read()
            println("Reading: ${c.toChar()}")
        } while (c != -1)

    } catch (ex: Exception) {
        println(ex.message)
    }
}

fun WriteToFile(str: String) {
    try {
        var file = FileWriter("test.txt", true) // fileName, append: true
        file.write(str + "\n")
        file.close()
    } catch (ex: Exception) {
        println(ex.message)
    }
}