// Snippet about the variables and data types in kotlin

// Unlike many other programming languages, variables in Kotlin do not need to be declared with a specified type (like "String" for text or "Int" for numbers)

fun main() {

    // var : Values to variables that can be reassigned (can be changed/modified), uses the var keyword.
    // Kotlin is smart enough to understand that "c" is a String (text), and that 2 is an Int (number) variable.

    var a: Int = 1  // immediate assignment
    var b = 2   // `Int` type is inferred
    var c = "Gemini"

    var d: Int  // Type required when no initializer is provided
    d = 3       // deferred assignment


    // val : Read-only local variables are defined using the keyword val. They can be assigned a value only once.
    //The val keyword is useful when you want a variable to always store the same value, like PI
    val pi = 3.14159265359
    println(pi)

}