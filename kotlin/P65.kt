/*Nullable Receiver –
Extension functions can also be defined with the class type
 that is nullable. In this case, when the check for null is
  added inside the extension function and the appropriate
  value is returned.
 */
// A sample class to display name
class AB(val name: String) {
    override fun toString(): String {
        return "Name is $name"
    }
}

fun main() {
    // An extension function as a nullable receiver
    fun AB?.output() {
        if (this == null) {
            println("Null")
        } else {
            println(this.toString())
        }
    }

    val x = AB("Charchit")
    // Extension function called using an instance
    x.output()
    // Extension function called on null
    null.output()
}