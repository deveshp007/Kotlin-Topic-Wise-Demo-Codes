/*Enum class properties and functions –
Since enum class in Kotlin, defines a new type. This class
type can have its own properties and functions. The
properties can be given a default value, however, if not
provided, then each constant should define its own value
for the property. In the case of functions, they are
usually defined within the companion objects so that they
do not depend on specific instances of the class. However,
they can be defined without companion objects also.
 */
// A property with default value provided
enum class DAYS(val isWeekend: Boolean = false) {
    SUNDAY(true),
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,

    // Default value overridden
    SATURDAY(true);

    companion object {
        fun today(obj: DAYS): Boolean {
            return obj.name.compareTo("SATURDAY") == 0 || obj.name.compareTo("SUNDAY") == 0
        }
    }
}

fun main() {
    // A simple demonstration of properties and methods
    for (day in DAYS.values()) {
        println("${day.ordinal} = ${day.name} and is weekend ${day.isWeekend}")
    }
    val today = DAYS.MONDAY;
    println("Is today a weekend ${DAYS.today(today)}")
}