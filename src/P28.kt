/*Getter and setter:properties are basically data members of a class
.Kotlin's properties can declare either as mutable using
"var" keyword, or as immutable using "val" keyword.
Syntax:
var <propertyName>[: <PropertyType>] [= <property_initializer>]
[<getter>]
[<setter>]

-->property initializer, getter and setter are optional. We
can also omit property type if it can be inferred from the
initializer.

In Kotlin, setter is used to set the value of any variable
and getter is used to get the value. Getters and setters
are auto-generated in the code.*/
class P28GetterSetter {
    var name="riya"
    var empid=89
        /*line 21 to 24 are implicitly present here
        value: name of the setter parameter is value,can be changed
        field: storing the property value in memory possible.
        When we initialize a property with a value, the
        initialized value is written to the backing field of
        that property.In above program, the value is assigned
        to field and then field is assigned to get().
        */
        get() = field // getter
        set(value) { // setter
            field = value
        }
}
fun main()
{
    val c = P28GetterSetter()
    c.name = "GeeksforGeeks" // access setter
    println(c.name) //access getter
}