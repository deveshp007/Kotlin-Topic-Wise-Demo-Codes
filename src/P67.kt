/*Generics are the powerful features that allow us to define
classes, methods and properties which are accessible using
different data types while keeping a check of the compile-time
type safety.

-->Creating parameterized classes –
A generic type is a class or method that is parameterized over
types. We always use angle brackets "<>" to specify the type
parameter in the program.
        Syntax:
        class MyClass<T>(text: T) {
        var name = text
           }

--> To create an instance of such a class, we need to provide the
 type arguments:
            val my : MyClass<String> = Myclass<String>("GeeksforGeeks")
If the parameters can be inferred from the arguments of constructor
 , one is allowed to omit the type arguments:
            val my = MyClass("GeeksforGeeks")

 -->Advantages of generic –

1.Type casting is evitable-No need to typecast the object.
2,Type safety- Generic allows only single type of object at a time.
3.Compile time safety- Generics code is checked at compile time
for the parameterized type so that it avoids run time error. */

//class company without generic type
class Company(text: String) {
    var x = text

    init {
        println(x)
    }
}

fun main(args: Array<String>) {
    var name: Company = Company("GeeksforGeeks")
    //var rank: Company = Company(12)// compile time error
}
