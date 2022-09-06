/*Inheritance in Interfaces –
Interfaces in Kotlin can also inherit other interfaces.
When an interface extends another interface, it can add its
 own properties and methods, and the implementing type has
 to provide a definition for all the properties and methods
  in both the interfaces. An interface can inherit more than
   one interface. */
interface Dimensions {
    val length : Double
    val breadth : Double
}

interface CalculateParameters : Dimensions {
    fun area()
    fun perimeter()
}

class XYZ : CalculateParameters {
    override val length : Double
        get() = 10.0
    override val breadth : Double
        get()= 15.0

    override fun area()
    {
        println("Area is ${length * breadth}")
    }

    override fun perimeter()
    {
        println("Perimeter is ${2*(length+breadth)}")
    }
}

fun main()
{
    val obj = XYZ()
    obj.area()
    obj.perimeter()
}