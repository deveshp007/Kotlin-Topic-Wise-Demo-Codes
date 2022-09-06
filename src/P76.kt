/*Kotlin Null Safety :  ?.(safe access)  , ?: (elvis operator)   , if checks {all three works at compile time)
whereas !!(not null assertion operator) works at run time.
Kotlin’s type system is aimed to eliminate the jeopardy of
 null reference from the code because it is a billion-dollar mistake. NullPointerExceptions are thrown by the
program at runtime and sometimes cause application failure
or system crashes. so kotlin tries to handle this at CT instead
of run time.

If anybody has been programming in Java or other language
that has concept of null reference then he must have
experienced about NullPointerException in the code. Kotlin
compiler also throws NullPointerException if it found any
null reference without executing any other statements.

The possible causes of NullPointerException’s are following:

1.Explicit call to throw NullPointerException()
2.Use of the !! operator
3.Some data inconsistency with regard to initialization e.g.
an uninitialized this is passed as an argument.
4.Java interoperation such as attempts to access a member
on a null reference , generics type with incorrect
nullability.


-->Nullable and Non-Nullable Types in Kotlin –
Kotlin type system has distinguished two types of references
that can hold null (nullable references) and those that can
not (non-null references).

-->A variable of type String can not hold null. If we try to
assign null to the variable, it gives compiler error.
 var s1: String = "Geeks"
s1 = null // compilation error
Now, if we want to access the length of the string s1, it
guarantees not to throw NPE, so we can safely say:
        val l = s1.length



-->To allow a variable to hold null, we can declare a
variable as nullable string, written String? declaration
with safe access operator "?"
var s2: String? = "GeeksforGeeks"
s2 = null // ok
print(s2)
But if we want to access the length of the string s2, that
would not be safe, and the compiler reports an error:
            val l = s2.length         // error: variable 's2' can be null
so to work with it always check the if (== null) condition to perform
any operation on it.*/
fun main(args: Array<String>) {
    //A1. variable is declared as non-nullable
    var s1: String = "Geeks"
    //s1 = null  // gives compiler error
    print("The length of string s1 is: " + s1.length)

    // A.2 variable is declared as nullable  using "?" with data type declaration of variable
    var s2: String? = "Geeks"
    s2 = null  // no compiler error
    //print("The length of string s1 is: "+s2.length) //here CTE

    // A.3 variable declared as nullable can be checked using if-else
    var s3: String? = "GeeksforGeeks"
    println(s3)

    //Way 1 using if-else
    if (s3 != null) {
        println("String of length ${s3.length}")
    } else {
        println("Null string")
    }

    //OR way 2  replace if else with safe access operator
    val length = s3?.length ?: null  //"?:" is elvis operator
    println("Null string")


    //A.4  assign null
    var s4: String? = "hello"
    s4 = null
    println(s4)
    if (s4 != null) {
        println("String of length ${s4.length}")
    } else {
        println("Null String")
    }
    /*if there are more number of variables holding null.
    checking it with if else would be a difficult task so
     we can also use safe call operator ( "?.")*/

    var s5: String? = "hello girl"
    var s6: String? = null
    s5?.toUpperCase()  //check s5 if not null,then call the method
    s6?.toUpperCase()
    var result = display1("hey")

    //A.5 safe call operator on integer type value
    val a: Int? = null
    val b: Int? = 1
    val c: Int = 2
    val r1 = (a ?: 0) + c //elvis operator  o/p null  as elvis right will work and 0 will be assigned
    val r2 = (b ?: 0) + c                //o/p 3
    println("the sum is{$r1$r2}")

    //A.6 Control flow analysis of safe call operator
    val s7: String? = null
    if (s7 == null) return
    println(s7.length)    /*as we have already checked its nullability at line 109 so no need to check it afterwards .this is called smart
    cast as compiler already remembers that is has null value or not */

    //A.7 explicitly add null pointer exception to code of kotlin using "!!" not null assertion operator

}

fun display1(str: String): String {
    return "hello" + str
}