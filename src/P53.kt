/*
sealed classes conform to restricted or bounded class
hierarchies. A sealed class defines a set of subclasses
within it. It is used when it is known in advance that a
type will conform to one of the subclass types. Sealed
classes ensure type-safety by restricting the types to be
 matched at compile-time rather than at runtime.

            Syntax:
                    sealed class Demo
To define a sealed class, just precede the class modifier
 with the sealed keyword. The sealed classes also have one
  another distinct feature, their constructors are private
  e by default.A sealed class is implicitly abstract and
  hence it cannot be instantiated.
 */
sealed class Demo {
    class A : Demo() {
        fun display() {
            println("Subclass A of sealed class Demo")
        }
    }

    class B : Demo() {
        fun display() {
            println("Subclass B of sealed class Demo")
        }
    }
}

//C and D are subclasses of sealed class defined outside
// the sealed class body
class C : Demo() {

}

class D : Demo() {

}

fun main() {
    val obj = Demo.B()
    obj.display()

    val obj1 = Demo.A()
    obj1.display()
}

