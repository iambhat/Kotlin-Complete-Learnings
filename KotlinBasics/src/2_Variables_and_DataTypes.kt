// Snippet about the variables and data types in kotlin

// val : Read-only local variables are defined using the keyword val. They can be assigned a value only once.
// var : Values to variables that can be reassigned, uses the var keyword.

fun main() {
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment
    println("a = $a, b = $b, c = $c")
}