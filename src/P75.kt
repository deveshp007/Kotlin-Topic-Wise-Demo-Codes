/*In Kotlin, we can use when expression to replace multiple
 catch blocks. In the below, we will show how to use when
 expression.
 */
import java.lang.NumberFormatException
import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    try {
        val n = Integer.parseInt(sc.nextLine())
        if (512 % n == 0)
            println("$n is a factor of 512")
    } catch (e: Exception) {
        when (e) {
            is ArithmeticException -> {
                println("Arithmetic Exception: Divide by zero")
            }
            is NumberFormatException -> {
                println("Number Format Exception ")
            }
        }
    }
}