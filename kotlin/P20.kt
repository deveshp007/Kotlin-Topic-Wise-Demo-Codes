import java.util.*
import kotlin.math.sqrt

/* functions: these are the blocks which has a name,return
type and list of arguments and then a body in which logic
to solve a particular problem is written.like main () is
the one default function given for JVM.
Syntax:
keyword_fun name_of_the _fxn(list_of_parameter as a:data_type,b: data_type):return_type
{
body to write logic
}

there are two types of functions:
1. library of predefined functions:
2. User Defined functions

*/
fun main(args: Array<String>) {

//A. user defined functions
//A1 sqrt() – Used to calculate the square root.
    println("***sqrt***")
    println("enter the value")
    var sc = Scanner(System.`in`)
    var a = sc.nextInt()
    var result: Double = sqrt(a.toDouble())
    println("sqare root of $a is $result")
    println()

//A2. print() – Used to print a message to standard output.
    println("***print() and println()***")
    print("in single line without shifting to next line")
    println("after printing the full line,shift to next line ")
    println()

//A3. rem() – To find the remainder of division
    println("***rem***")
    println("enter the value of b")
    var b = sc.nextInt()
    println("enter the value of c")
    var c = sc.nextInt()
    var result1 = b.rem(c)
    println("the remainder of $b and $c is $result1")
    println()

/*A4. toInt() – To convert a number to integer value.
each data type has it to____() method */
    println("***toInt()***")
    var d: Float = 8.9f
    var e = d.toInt()
    println("the float $d converted into int $e using toInt()")
    println()


//A.5 readLine() – Used for standard input.
    println("***readLine()***")
    println("Enter the value: ")
    var f = readLine()!!
    println("the valus user has entered is : $f")
    println()

//A.6 sum()
    println("***sum***")
    var arr = Array(3, { i -> i * 2 })
    for ((index, value) in arr.withIndex())
        println("$index and $value")
    println(arr.sum()) //calling predefined sum method


/*B user defined function named "add" with args with
return type . user defined function can be defined
inside the main method and even get called from inside,
but it is not beneficial as it will behave as the
local method of main method*/
    println("***user defined function***")
    println()
    println("sum function with return type is :" + sum(5, 6)) //function call

    println("sum1 function as an expression is :" + sub(10, 10)) //function call

}

//B1: function with return type
fun sum(a: Int, b: Int): Int //function definition where arguments are val type i.e. immutable
{
    return a + b
}

//B2:function as an expression : when there is only one liner fxn body that too is return statement
fun sub(a: Int, b: Int): Int = a - b