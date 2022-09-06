/*Kotlin throw keyword –
In Kotlin, we use throw keyword to throw an explicit
exception. It can also be used to throw a custom exception.
 */
fun main(args: Array<String>) {
    test("abcd")
    println("executes after the validation")
}

fun test(password: String) {
    // calculate length of the entered password and compare
    if (password.length < 6)
        throw ArithmeticException("Password is too short")
    else
        println("Strong password")
}