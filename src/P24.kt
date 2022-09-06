/* anonymous function is very similar to regular function
except for the name of the function which is omitted
from the declaration. The body of the anonymous
function can be either an expression or block.

-->Return type and parameters in anonymous functions

1. The return type and parameters are also specified in
same way as for regular function, but we can omit the
parameters if they can be inferred from the context.


--> difference between lambda and anonymous functions:
The only difference is the behavior of non-local
returns. A return statement without a label always
returns from the function declared with the fun
        keyword.This means that a return inside a lambda
expression will return from the enclosing function,
whereas a return inside an anonymous function will
return from the anonymous function itself.*/

fun main(args: Array<String>) {
/*A function body as an expression.The return type
of the function can be inferred automatically from
the function if it is an expression */

    println("fxn body as an expression")
    val anon = fun(x: Int, y: Int) = "" + x + y //return type is optional
    println()

//call to anonymous function
    println("fxn as an exp is: " + anon(2, 3))

    /* Function body as a block:The return type of the
    function has to be specified explicitly for the
    anonymous function if it is body block. */
    println("fxn body as a block")
    val anon1 = fun(a: Int, b: Int): Int //return type mandatory
    {
        val mul = a * b
        return mul
    }
//call to anonymous function
    println("fxn as a block is: " + anon1(2, 3))

    println()

}


