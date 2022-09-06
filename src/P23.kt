/* lambdas expression and anonymous function:
--> both are function literals: fxn literals means it has no
declaration(function without name) but these functions act as an
expression which may or may not returns a value.
1. Lambda Expression: (4types as that of functions P17)
Syntax:
val lambda_name:Data_type = { argument_List -> code_body }
2. Kotlin’s type inference helps the compiler to evaluate
the type of a lambda */

fun main(args: Array<String>) {
//Different types of lambda expressions
/*A no arg no return type:simple expression
without arguments, when it has one or many
statements inside the body curly brackets
are mandatory */
    println("simple lambda no arg no ret type")
    val a =
        {
            println("you can put one line expression")
            println("you can put multi line expression")
        }
    println("invoked using val name with functional brackets i.e. a()")
    a() //it can be invoked directly with the val name i.e. a
    println()
    println("invoked using invoke method i.e. a.invoke()")
    a.invoke() //it can be called using invoke method
    println()


/*B with arg no return type: expression with argument
and with type annotation of arguments without return type*/
    println("lambda with args no ret type with type annotation ")
    val b = { x: Int, y: Int -> println(" the sum is: " + x + y) } //x and y variables are declared with data type
/*line 35 is the lambda expression but it is of no return type
because :
1. the expression has last statement as a print statement
2. the call to lambda expression(line 41) is not written as var
z=b(5,5,) no variable to catch the returned value*/
    b(5, 5)
    println()
/* if you write it as var bresult=b(5,5)
println("the sum with data type declared is $bresult")
it will return the void as answer at run time but no CTE*/


/*C with arg no return type(mentioned with Unit)
without type annotation:*/
    println("with arg no return types(mentioned with Unit) without type annotation")
    val bb: (Int) -> Unit = { bbresult -> println("the valus is: " + (bbresult)) }
    bb(5)
    println()


/*D Method 1,with arg with default return type: expression with a
rgument and with type annotation of arguments
with default return type */
    println("lambda with args with default return type and with type annotation ")
    val c = { x: Int, y: Int -> x + y } //x and y variables are declared with data type
    var cresult = c(5, 5)
    println("when lambda returns ,the sum is $cresult")
    println()


/*E method 2 ,with arg with defined return type:expression
with argument and without type annotation of
arguments: when you do not give annotation with
argument list, no assignment to lambda variable is
needed,it will directly return the value .you
have to mention it with the lambda variable in the syntax :

val lambda_variable:(data type of input
variable separated by comma)->data type of
output={(name of argumenst)->expression}*/
    println("lambda with args with defined return type and without type annotation ")
    val d: (Int, Int) -> Int = { a, b -> a + b }
    var dresult = d(10, 20)
    println("the sum without data type declared is $dresult")
    println()

//F no arg with default return type
    println("lambda expression no arg with return type")
    val e = { "hello" }
    var eresult = e()
    println("the result for no arg with ret type LE is: $eresult")


//G no arg with defined return type
    println("lambda expression no arg with return type")
    val f: () -> String = { "hello" }
    var fresult = f()
    println("the result for no arg with ret type LE is: $fresult")

//H with int type arg and with String type return
    println("lambda expression with int type arg and with String type return")
    val g: (Int, Int) -> String = { a, b -> (a + b).toString() }
    var gresult = g(10, 20)
    println("the result with int type arg and with String type return type LE is: $gresult")


/*I lambda as a class extension:"this" keyword is
used for class type data type at the left of dot and "it"
keyword is used for class type data type at the
right of dot Then the code_body concatenate both the values
and returns to variable result. NOTE: "this" an "it"
data type must be compatible with each other*/
    println("lambda as class extension")
    val h: String.(Int) -> String = { this + it }
    var hresult = "hello".h(90)
    println("class extension output is $hresult")
    println()

    val i: Int.(Int) -> Int = { this + it }
    var iresult = 90.i(10)
    println("class extension output is $iresult")


//J it: implicit name of a single parameter
    println("use of 'it' ")
//where each ele of array act as a single object
    var j = arrayOf(1, 2, 3, -2, -4, 5, 6)
    println(j.filter { it > 0 }) //shorthand
    println(j.filter { j -> j > 0 }) //longhand
    println()


//K lambda return a value of string type using "return " keyword
    println("lambda return a value of string type using 'return' keyword")
    var k = fun(x: Int, y: Int): String {
        if (x > y) {
            return "x>greator"
        } else
            return "x>greator"
    }
    println("the returned value by lambda function : " + k(5, 10))
}