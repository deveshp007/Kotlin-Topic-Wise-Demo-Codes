/*Inheritance: In Kotlin, all classes are final by default.
To inherit, base class for derived class we should use open
keyword in front of base class.

1.Single level inheritance */
open class A {
    var name = "riya"
    fun display() {
        println("i am the method od base class A where value of name is $name")
    }
}

class B : A() //it means :classname() makes class B inherits class A
{

}

fun main() {
    var obj = B()
    println("Obj is of derived class type but going to call display method of base class with child class")
    obj.display()
}