import kotlin.reflect.typeOf

// Snippet about the variables and data types in kotlin

// Unlike many other programming languages, variables in Kotlin do not need to be declared with a specified type (like "String" for text or "Int" for numbers)

fun main() {

    // var : Values to variables that can be reassigned (can be changed/modified), uses the var keyword.
    // Kotlin is smart enough to understand that "c" is a String (text), and that 2 is an Int (number) variable.

    var a: Int = 1  // immediate assignment
    var b = 2   // `Int` type is inferred
    var c = "Gemini"

    println("a=$a, b=$b, $c=c")

    var d: Int  // Type required when no initializer is provided
    d = 3       // deferred assignment

    println("d=$d")


    // val : Read-only local variables are defined using the keyword val. They can be assigned a value only once.
    //The val keyword is useful when you want a variable to always store the same value, like PI
    val pi = 3.14159265359
    println(pi)


    //------------------------------------------------------------------------------------


    // Data types :

    val myNum = 5               // Int
    val myDoubleNum = 5.99      // Double
    val myLetter = 'D'          // Char
    val myBoolean = true        // Boolean
    val myText = "Hello"        // String
    println(myNum)
    println(myDoubleNum)
    println(myLetter)
    println(myBoolean)
    println(myText)

    // check data type of the variable
    println(myNum::class.simpleName)


    //------------------------------------------------------------------------------------


    /*
    Data types are divided into different groups:
        - Numbers
        - Characters
        - Booleans
        - Strings
        - Arrays
     */

    //------------------------------------------------------------------------------------

    // Number data type
    val number1: Int = 34
    val number2: Byte = 12
    val number3: Short = 56
    val number4: Long = 342345252
    val marks: Float = 34.67F
    val marksInComputer: Double = 1232.46

    //-------------------------------------------------------------------------------------

    /* Built-in operations on booleans include:

       =>  || – disjunction (logical OR)
       =>  && – conjunction (logical AND)
       =>  ! – negation (logical NOT)
       =>  || and && work lazily.
     */

    val isActive: Boolean = false
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(isActive || myFalse)
    println(isActive && myFalse)
    println(!isActive)

    //-------------------------------------------------------------------------------------

    // Characters are represented by the type Char. Character literals go in single quotes
    val ch: Char = 'Q'
    println(ch)

    //-------------------------------------------------------------------------------------

    // Strings in Kotlin are represented by the type String.
    // Generally, a string value is a sequence of characters in double quotes (")

    val userName: String = "Rakshith"
    val message: String = "I love kotlin and i am going to program android apps"

    //-------------------------------------------------------------------------------------

    // An array is a data structure that holds a fixed number of values of the same type or its subtypes.
    // The most common type of array in Kotlin is the object-type array, represented by the Array class.
    val favActivities: Array<String> = arrayOf("cricket", "chess", "music", "programming")
    println(favActivities[1])
    println(favActivities[2])
    favActivities[2] = "Listen Music"
    println(favActivities[2])

    //-------------------------------------------------------------------------------------
    // user defined data type
    val user1: User = User("Jarvis", "252525", "India")
    user1.display()

}

class User(
    val name: String,
    val phone: String,
    val address: String
) {
    fun display() {
        println(name)
        println(phone)
        println(address)
    }
}