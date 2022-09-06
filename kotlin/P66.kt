/*Companion Object Extensions –
If a class contain companion object, then we can also define
extension functions and properties for the companion object.
 -->Companion object declaration –
*/
class MyClass1 {
    // companion object declaration
    companion object {
        fun display() {
            println("Function declared in companion object")
        }
    }
}

/*--> companion Object extension
Just like the calling of regular member function of the companion
object, extension function can be called using only the class name
as the qualifier.*/
class MyClass2 {
    companion object {
        // member function of companion object
        fun display(str: String): String {
            return str
        }
    }
}

// extension function of companion object
fun MyClass2.Companion.abc() {
    println("Extension function of companion object")
}

fun main(args: Array<String>) {
    // invoking member function in MyClass1
    val ob = MyClass1.display()


    // invoking member function in MyClass2

    val obj = MyClass2.display("Function declared in companion object")
    println(obj)
    // invoking the extension function
    val ob2 = MyClass2.abc()
}
