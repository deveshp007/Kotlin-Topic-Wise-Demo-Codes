/* This program is written when you want to call any method which takes
lambda expression type arguments. It will tell us about the need of
Inline functions.

when you make any method/Lambda exp, its definition gets a memory in
computer. whenever you call that method ,the control is transferred
from the call to the definition of method present in memory.But it
increases the memory overhead.Kotlin says for all the lambda type
arguments in a method,a dynamic class and its instance will get
created which will take further call the method.But if we have 10
arguments to a method of lambda type,that means 10 classes and
their instances will get created which will get stored in memory
and everytime it will get called,It increases the memory head. To
avoid this we will make the function which takes lambda type
argument as "inline" by writing "inline" keyword in front of it.

Inline functions : When you call any inline functions, the compiler
does not transfer the control to the fxn definition instead, it
brings the fxn definition to the area of calling.It avoids the
memory overhead.
-->Inline function allow us to use lambda expression as a parameter to
the function.
Two types of inline functions:
1. Predefined /Library
2.User defined */
fun main(args: Array<String>)//after Kotlin1.3 main may not have parameters
{
    println("calling non inline fxn having lambda type argument")
    /* Calling a function named"withoutInlineFxn: which has the parameter as
    lambda expression type. In which the function to be passed is named as
    "AnyFxn" .the control goes to line 30.*/
    withoutInlineFxn({ AnyFxn() }) //way to call lambda exp as an argument to a fxn
}

fun withoutInlineFxn(lambdaExp: () -> Unit) //2nd arg is declaring a lambda function
{// it replaces this lambda call with "AnyFxn"
    lambdaExp() //in actual call lambdaExp.invoke(str)
}

fun AnyFxn() {
    println("hey")
}