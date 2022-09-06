import java.util.Scanner

/* when keyword:it is same as that of switch in java with
only change is that no break is needed at the end of each
case. the default keyword is replaced with else, and it is
not mandatory to put. when clause can be used with enum,try
catch.
-->when can be used "as a statement" or "as an expression"*/

// code for when and its statements ----
fun main(args: Array<String>) {
    println("Enter The number between 1 to 5 : ")

    var num1 = readLine()
    when (num1) {
        "1" -> print("Entered Number is 1")
        "2" -> print("Entered Number is 2")
        "3" -> print("Entered Number is 3")
        "4" -> print("Entered Number is 4")
        "5" -> print("Entered Number is 5")
        else -> print("Wrong number entered!!!!")
    }

    // Classroom program ------------

    var sc = Scanner(System.`in`)
    println("enter the string type value of a: ")
    var a = sc.next()

    println("press 1 for cse ")
    println("press 2 for ece ")
    println("press 3 for eee ")
    println("press 4 for me ")

//A. when as a statement i.e. without default case i.e. "else"
    println("when as a statement without else")
    when (a) {
        "1" -> println("cse code is $a")
        "2" -> println("ece code is $a")
        "3" -> println("eee code is $a")
        "4" -> println("me code is $a")
    }
    println()


//B. when as a statement i.e. with default case i.e. "else"
    println("when as a statement with else")
    when (a) {
        "1" -> println("cse code is $a")
        "2" -> println("ece code is $a")
        "3" -> println("eee code is $a")
        "4" -> println("me code is $a")
        else ->
            println("wrong input")
    }
    println()

//C. when as an expression with default case i.e. "else" and it must retur a value
    println("when as an expression with else manadatory")
    var result = when (a) {
        "1" -> "cse code is $a"
        "2" -> "ece code is $a"
        "3" -> "eee code is $a"
        "4" -> "me code is $a"
        else ->
            "you have given wrong input"
    }
    println("when as an expression is $result")
    println()


//D. when multiple cases in one branch separated by commas
    println("when defining multiple cases separaedted by commas")
    when (a) {
        "Mercury", "Earth", "Mars", "Jupiter", "Neptune", "Saturn", "Venus", "Uranus" -> println("Planet")
        else -> println("Neither planet nor star")
    }
    println()


//E. to check whether the input values is in the given range or not
    println("when to work on case/branch name within the range")
    var num = sc.nextInt()
    when (num) {
        in 1..3 -> println("It is spring season")
        in 4..6 -> println("It is summer season")
        in 7..8 -> println("It is rainy season")
        in 9..10 -> println("It is autumn season")
        in 11..12 -> println("It is winter season")
        !in 1..12 -> println("Enter valid month of year")
    }
    println()


/* F. Check given variable is of certain type or not
Using "is" or "!is" operator we can check the type of
variable passed as argument in when block. If the
variable is Integer type then is Int returns true
else return false.
*/
    println("when to check type of variable")
    var n: Any = "GeeksforGeeks"
    when (n) {
        is Int -> println("It is an Integer")
        is String -> println("It is a String")
        is Double -> println("It is a Double")
    }
    println()


/*G.when can be used to replace if-else-if chain */
    println("when to replace if-else-if chain")

    fun isOdd(x: Int): Boolean {
        return x % 2 != 0
    }

    fun isEven(x: Int): Boolean {
        return x % 2 == 0
    }

    var n1 = 8
    when {
        isOdd(n1) -> println("Odd")
        isEven(n1) -> println("Even")
        else -> println("Neither even nor odd")
    }


/*H. it can be used to check infix and prefix of a string*/
}