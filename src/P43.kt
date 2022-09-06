/* we can make any function as inline function (writing keyword
"inline" in front of it )which has:
a. lambda type argument
b. When ou want to get something from lambda using return keyword
c. whenever any function id further calling many sub functions

--> To see bytecode as Tools -> Kotlin -> Show Kotlin Bytecode*/
fun main(args: Array<String>)//after Kotlin1.3 main may not have parameters
{
/* calling a function named"InlineFxn__: which has the parameter
as lambda expression type. In which the function to be passed
is named as "SomeFxn" .the control does not go to line 30.
Instead, the definition of "SomeFxn() brought here at the place
of calling*/

/*round parenthesis to function call is not mandatory when it has
only one lambda type argument. The lambda as an argument is called

Syntax: function_name{name_of_the_metho_to replace_the_lambda}*/
    println("calling inline function with one argument")
/*first curly bracket should be interacted with the name of
function .Call to any function can be made either pre or user
define*/
    InlineFxnOne { SomeFxn() }
/*Or it can also be written
1) InlineFxnOne(SomeFxn)
OR it can also be written as
2) InlineFxnOne({SomeFxn})*/
    println()


    println("calling inline function with two argument")
//round parenthesis is mandatory
    inlineFxnTwo(
/*as this inline fxn has two lambda type arguments,definition of
two is separated by comma.where one is returning the value and
other one is not. as two exit are not possible*/
        {
            println("Lambda expression 1 without return")
        },

        {
            println("Lambda expression 2 with use of 'return' statement ")
            return
        }
    )
    println()


    println("lambda expression makeing it crossinline")
    inlineFxnThree({
        println("lambda crossline expression ")
    }) //using return here will give CTE as it is crossInline lambda exp
// return }
    println()


    println("lambda expression making some arg as noinline")
    inlineFxnFour({
        println("lambda crossline expression one")
    },
        {
            println("lambda simple expression two")
        },
        {
            println("lambda noinline expression three")
        })
} //End of main

//A. basic inline function
inline fun InlineFxnOne(lambdaExpOne: () -> Unit) //2nd arg is declaring a lambda function
{// it replaces this lambda call with "SomeFxn"
    lambdaExpOne() //in actual call lambdaExp.invoke(str)
}

fun SomeFxn() {
    println("hey")
}


/*B.lambda expression does not allow use of "return" keyword to
return a statement.But using Inline functions lambda is allowed to
return a value using "return" keyword.*/
inline fun inlineFxnTwo(lambdaExpOne1: () -> Unit, lambdaExptwo: () -> Unit) {
    lambdaExpOne1()
    lambdaExptwo()
}

/*C. crossinline function: when you want that compiler should show
error,whenver you are using "return" keyword in lambda expression
defined as an argument in inline functions, mark that lambda exp as
"crossInline" */
inline fun inlineFxnThree(crossinline lambdaOne2: () -> Unit) {
    lambdaOne2()
}

/*D. if a inline function takes many lambda type arguments and you
want to make some of those arguments as inline but not all. Then
write keyword "noinline" in front of the lambda exp you do not want
to make inline.*/
inline fun inlineFxnFour(
    crossinline lambdaExpOne: () -> Unit,
    lambdaExptwo: () -> Unit,
    noinline lambdaExpThree: () -> Unit
) {
/*first arg is crossline
* second arg is inline
* thrid arg is not inline*/
    lambdaExpOne()
    lambdaExptwo()
    lambdaExpThree()
}


//ReiFied Modified and Inline keyword