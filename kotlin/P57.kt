/*In Kotlin, abstract class is declared using the abstract
 keyword in front of class. An abstract class can not
 instantiate means we can not create object for the
 abstract class.
    Syntax:
        abstract class className {
                .........
        }


-->Points to remember:
1.We can’t create an object for abstract class.
2.All the variables (properties) and member functions of an
 abstract class are by default non-abstract. So, if we want
  to override these members in the child class then we need
   to use open keyword.
3.If we declare a member function as abstract then we do
 not need to annotate with open keyword because these are
  open by default.
4.An abstract member function does’t have a body, and it
must be implemented in the derived class.
5.An abstract class can contain both abstract and non-abstract
members */

abstract class AbsBase(val x: String) {   // Non-Abstract Property

    abstract var y: Int      // explicitly write "abstract" and Abstract Property by default open

    abstract fun method1()   // Abstract Methods by default open

    fun method2() {          // Non-Abstract Method,have to open to override
        println("Non abstract function present in abstract base class")
    }
}

class AbsDerived : AbsBase("primary constructor arg called") {
    override var y = 90
    override fun method1() {

    }
}

fun main() {
    var obj = AbsDerived()
    obj.method1()
    obj.method2()
    println("the value of abstract property is :  ${obj.y}")

}