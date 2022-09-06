/*  when interface has properties.*/
interface InterfaceProperties {
    val a: Int
    val b: String
        get() = "Hello"
}

class PropertiesDemo : InterfaceProperties {
    override val a: Int = 5000
    override val b: String = "Property Overridden"
}

fun main() {
    val x = PropertiesDemo()
    println(x.a)
    println(x.b)
}