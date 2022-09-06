/*Usage of when expression with enum class –
A great advantage of enum classes in Kotlin comes into play
 when they are combined with when expression. The
 advantage is since enum classes restrict the value a type
  can take, so when used with when expression and the
  definition for all the constants are provided, then the
  need of the else clause is completely eliminated. In fact,
   doing so will generate a warning from the compiler.
 */
enum class DAY {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

fun main() {
    when (DAY.SUNDAY) {
        DAY.SUNDAY -> println("Today is Sunday")
        DAY.MONDAY -> println("Today is Monday")
        DAY.TUESDAY -> println("Today is Tuesday")
        DAY.WEDNESDAY -> println("Today is Wednesday")
        DAY.THURSDAY -> println("Today is Thursday")
        DAY.FRIDAY -> println("Today is Friday")
        DAY.SATURDAY -> println("Today is Saturday")
        // Adding an else clause will generate a warning
    }
}