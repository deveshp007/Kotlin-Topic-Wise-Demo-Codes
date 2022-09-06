/*Kotlin try-catch block as an expression –
As we already know, expression always returns a value. We
 can use kotlin try-catch block as an expression in our
 program. The value returned by the expression will be
 either last expression of try block or last expression of
 catch block. If an exception occurs in the code, then
 catch block returns the value.
 */

fun test(a: Int, b: Int) : Any {
    return try {
        a/b
        //println("The Result is: "+ a / b)
    }
    catch(e:Exception){
        println(e)
        "Divide by zero not allowed"
    }
}
// main function
fun main(args: Array<String>) {
    // invoke test function
    var result1 = test(10,2  ) //execute try block
    println(result1)
    var result = test(10,0 )   // execute catch block
    println(result)
}
