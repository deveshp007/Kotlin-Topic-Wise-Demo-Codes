/*We can also use try, catch and finally blocks all
together.Kotlin program of using finally block with
try-catch block-
 */

fun main(args: Array<String>) {
    try {
        var int = 10 / 0
        println(int)
    } catch (e: ArithmeticException) {
        println(e)
    } finally {
        println("This block always executes")
    }
}