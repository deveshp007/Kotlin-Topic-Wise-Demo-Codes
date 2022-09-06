/*Extensions are resolved statically –
One important point to note about the extension functions
 is that they are resolved statically i.e. which extension
 function is executed depends totally on the type of the
 expression on which it is invoked, rather than on the
 type resolved on the final execution of the expression at
  runtime.
 */
// Open class created to be inherited
open class Aa(val a: Int, val b: Int) {
}

// Class B inherits A
class Bb() : Aa(5, 5) {}

fun main() {

    // Extension function operate defined for A
    fun Aa.operate(): Int {
        return a + b
    }

    // Extension function operate defined for B
    fun Bb.operate(): Int {
        return a * b;
    }

    // Function to display static dispatch   based of reference type
    fun display(a: Aa) = {
        println("it will call extension fxn of class Aa based on reference type")
        print(a.operate())    //Aa class operate() will be called
    }

    // Calling display function
    display(Bb())   //no matter we are throwing object of classB but as in the arg space of display fxn it is of type Aa class so Aa class operate will be called.


    val b: Bb = Bb()   //
    display(b)  //operate of class Aa will be called as reference is of that type
}