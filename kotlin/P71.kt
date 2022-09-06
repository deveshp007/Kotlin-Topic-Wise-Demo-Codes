/*In Kotlin, finally block is always executes irrespective
 of whether an exception is handled or not by the catch
 block. So it is used to execute important code statement.
We can also use finally block with try block and skip the
catch block from there. */
fun main(args: Array<String>) {
    try {
        var ar = arrayOf(1, 2, 3, 4, 5)
        var int = ar[6]
        println(int)
    } finally {
        println("This block always executes")
    }
}
