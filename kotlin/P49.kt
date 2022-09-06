/*Default values and Default Methods –
Methods in an interface can have default values for its
parameters. If the value for a parameter is not provided at
 the time of function call, then the default value is used.
  Also, the methods can have default implementations. These
   are used in the case where the method is not overridden.
 */


interface FirstInterface {
    fun add(a: Int, b: Int = 5)
    fun print() {
        println("This is a default method defined in the interface")
    }
}

class InterfaceDemo : FirstInterface {
    override fun add(a: Int, b: Int) {
        val x = a + b
        println("Sum is $x")
    }

    override fun print() {
        super.print()
        println("It has been overridden")
    }
}

fun main() {
    val obj = InterfaceDemo()
    println(obj.add(5))
    obj.print()
}