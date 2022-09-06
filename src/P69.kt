/*An exception is an unwanted or unexpected event, which
occurs during the execution of a program i.e. at run time,
that disrupts the normal flow of the program’s instructions.
 Exception handling is a technique, using which we can
 handle errors and prevent run time crashes that can stop
 our program.

There are two types of Exceptions –

1.Checked Exception – Exceptions that are typically set on
 methods and checked at the compiled time, for example
  IOException, FileNotFoundException etc.
2.UnChecked Exception – Exceptions that are generally due to logical errors and checked at the run time, for example NullPointerException, ArrayIndexOutOfBoundException etc

-->Kotlin Exceptions –In Kotlin, we have only unchecked
exceptions and can be caught only at run time. All the
exception classes are descendants of Throwable class.

We generally use the throw-expression, to throw an
exception object –

            throw Exception("Throw me") */
fun main(args: Array<String>) {
    try {
        var num = 10 / 0
    } catch (e: ArithmeticException) {
        // caught and handles it
        println("Divide by zero not allowed")
    }
}
