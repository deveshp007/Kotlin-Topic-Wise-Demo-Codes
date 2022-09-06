/*Kotlin's extension function
Kotlin gives the programmer the ability to add more
functionality to the existing classes, by without inheriting
 them. This is achieved through a feature known as
 extensions. When a function is added to an existing class
 it is known as Extension Function.

 -->if you want to use extension defined in one class
 somewhere else,you've to import it at the top.

 -->some predefined extension functions defined in the kotlin library are until() to() eq() toIntOrNull()...

 -->they can never be overridden

 -> they are compiled as static functions of the class.

-->if extension function and any predefined function of a predefined class will have same name then pref will be
 given to member fxn
--> if you try to define the member fxn of a class also as an extension fxn and both are having same name and
signature then warning of shadowing will be shown and pref will be given to member fxn

--? if you try to define the member fxn of a class also as an extension fxn and both are having different
signature then it can be called separately*/

// A sample class to demonstrate extension functions
class Circle(val radius: Double) {
    // member function of class
    fun area(): Double {
        return Math.PI * radius * radius;
    }
}

fun main() {
    // Extension function created for a class Circle
    fun Circle.perimeter(): Double {                 //way 1  defining one liner that is a return statement fxn,with body using return keyword
        return 2 * Math.PI * radius;
    }

    //   fun Circle.perimeter():Double=2*Math.PI*radius         //   way 2 defining one liner that is a return statement fxn, of defining same fxn as an expression


    //B. Shadowing of extension when class has the same named function as that of the extension function with same signature
    fun Circle.area(): String = "hey"


    //B. Shadowing of extension when class has the same named function as that of the extension function with different signature
    fun Circle.area(a: Int): String = "hey"  //will work fine as it is easy to differentiate.


    // create object for class Circle
    val newCircle = Circle(2.5);
    // invoke member function
    println("Area (which is normal fxn)of the circle is ${newCircle.area()}")
    //invoke extension function with reference type
    println("Perimeter(which is extension fxn) of the circle is ${newCircle.perimeter()}")   //extension fxn call depends on static dispatch i.e. on the basis of reference type


}