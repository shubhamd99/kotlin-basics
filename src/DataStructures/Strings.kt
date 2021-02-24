package DataStructures

fun main() {
    val message = "Welcome to My Github"
    val name = "Shubham"
    val allMessage = "$name, $message"

    print(allMessage[0]) // S
    println(allMessage.toLowerCase())
    print(allMessage.trim())

    val listOfTokens: List<String> = message.trim().split(" ")
    for (token in listOfTokens) {
        // to
            // My
                // Github
        println("Token: $token")

        if (token.contains("to")) {
            println("To...")
        }
    }
}