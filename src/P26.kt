/*Nested class:this is the static data member of the class
static means it can be directly called with the name of outer
class. but to access data members of inner class ,we have to make its object
name */
class P26NestedClasses {
    var name = "swift"
    fun outerDisplay() {
        println("outer class display methods,value of name is $name")
    }

    class Engine {
        var cc: Int = 0
        fun innerDisplay() {
/*static nested class can only access the static data
members of the outer class.name of outer can't be
accessed from static inner class as static is
independent of object but data members are dependent
on object */
            println("inner class display method,value of and cc is $cc")
        }
    }
}

fun main()
{
//A. accessing outer class other data members
    var outerObj=P26NestedClasses()
    outerObj.name="suzuki"
    outerObj.outerDisplay();

//B. creating object of nested class present inside
// outer class.as static data member of a class can
// be directly called with class name

    var innerObj=P26NestedClasses.Engine()
    innerObj.cc=500
    innerObj.innerDisplay()

//directly be called without creating reference.
    P26NestedClasses.Engine().innerDisplay()
}