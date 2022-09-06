import java.util.Scanner

// Factorial of a number using Recursion ---------

fun main(args:Array<String>){
    var sc = Scanner(System.`in`)
    println("Enter the Number :")
    var a:Int = sc.nextInt()
    val factorial = factorial(a)
    println("The factorial of $a is : $factorial")

}

fun factorial(a:Int):Int{
    if (a>=1)
        return a*factorial(a-1)
    else
        return 1
}

















