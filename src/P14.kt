// Kotlin program for if else statements and its implementations -----

import java.util.Scanner

/*If else same as that of java. But you can use it as an
expression which is returning a value but condition is if
you are using it as an expression which returns the value.
you have to have "else" part with it */

fun main(args: Array<String>) {
    println("enter the number a")
    var sc = Scanner(System.`in`)
    var a = sc.nextInt()
    println("enter the number b")
    var b = sc.nextInt()
    println("enter the number c")
    var c = sc.nextInt()


//A. if as a statement
    println("inside simple if as a statement")
    if (a > 0) {
        println("2 statements needs body of if")
        println("$a is positive number")
    }
    println()

//B. if else as a statement
    println("inside simple if-else as a statement")
    if (a > 0)
        println("$a is positive number")
    else
        println("$a is negative number")
    println()


//C. if as an expression which has else to have mandatory.because
// of this ternary operator is not there in kotlin
    println("inside if-else as an expression")
    var result = if (a < 0) {
        "it is a negative number"
    } else
        "it is positive number"
    println(result)
    println()

//D. if else-if else as an expression which returns string
    println("inside if-else if as an expression returning string")
    var result1 = if (a < 0) {
        "it is a negative number"
    } else if (a > 0)
        "it is positive number"
    else
        "the number is $a"
    println(result1)
    println()


/*E.if else-if as an expression which returns number */

    println("inside if-else if as an expression returning number")
    var result2 = if (a < b && c < b) {
        b
    } else if (a > b && a > c)
        a
    else
        c
    println("the largest number among $a $b and $c is $result2")

}