/*infix notation means calling without using parenthesis and dot.
--> two types of infix function notation in Kotlin
1.Standard library infix function notation
2.User defined infix function notation*/
fun main(args: Array<String>) //return type is written at the closing parenthesis of args using ":" i.e. fun sum():Int (it means Int type value will be returned by this method
{

/*A.Library infix notation functions all the operators are internally
converted into method call.the operator representation is called
inline function notations */
    println("library infix notation functions")
    var a: Int = 3
    var b: Int = 1
    println("i can access it using a.minus(b) and the answer is ${a.minus(b)}")
    println(
        "i can also access it without method call only if" +
                "it is a inline predefined function then it will be called as" +
                "" + (a - b)
    )
}

//B.User Defined Infix function notation
/*We can create own function with infix notation if it satisfies
the following requirements:
1.It must be member function or extension function
2.It must accept a single parameter
3.The parameter must not accept variable number of arguments and must have no default value
4.It must be marked with infix keyword */


//we will learn lately