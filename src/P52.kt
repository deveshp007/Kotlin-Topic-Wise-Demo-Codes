/*Multiple Interface Implementation –
Since classes in Kotlin follow the concept of single
inheritance, that is, each class can inherit only class,
however, in case of interfaces a class supports multiple
 inheritance, also known as multiple conformance in Kotlin.
  A class can implement more than one interface, provided
   that it provides a definition for all the members of
   the interface.
 */
interface InterfaceProperty {
    val a : Int
    val b : String
        get() = "Hello"
}

interface InterfaceMethods {
    fun description()
}

class MultipleInterface : InterfaceProperty, InterfaceMethods {
    override val a : Int
        get() = 50

    override fun description()
    {
        println("Multiple Interfaces implemented")
    }
}
fun main()
{
    val obj = MultipleInterface()
    obj.description()
}