/*Interfaces are custom types provided by Kotlin that cannot
 be instantiated directly. Instead, these define a form of
 behavior that the implementing types have to follow. With
  the interface, you can define a set of properties and
  methods, that the concrete types must follow and
  implement.

Creating Interfaces –
The interface definition in Kotlin begins with the interface
 keyword followed by the name of the interface, followed by
  the curly braces within which the members of the
  interface reside. The difference is that the members will
   have no definition of their own. These definitions will
    be provided by the conforming types.

    Example:

            interface Vehicle()
               {
                 fun start()
                fun stop()
                }

no need of writing "open keyword to override the data in interfaces*/
interface vehicle {
    fun start()
    fun stop()
}

class Car_1 : vehicle {
    override fun start()
    {
        println("Car started")
    }

    override fun stop()
    {
        println("Car stopped")
    }
}

fun main()
{
    val obj = Car_1()
    obj.start()
    obj.stop()
}