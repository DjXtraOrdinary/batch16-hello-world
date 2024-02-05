fun main(args: Array<String>) {
    println("Hello World!")

    println("Hallo, wie heißt du? (confirm with Enter)")
    var name = readln()
    println("Hallo $name!")

    println("Wie alt bist du? (confirm with Enter)")
    var alter = readln()
    println("Wow! Bereits $alter Jahre?!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}