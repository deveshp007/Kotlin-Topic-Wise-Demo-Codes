/*Secondary constructor:A class in Kotlin can have one or
more secondary constructors.The secondary constructor is
used to initialize the class as well as some extra logic.
they are not defined as the parameters after class
declaration.Instead, they are defined with keyword :constructor:*/

class P33SecondaryConstructor {
    constructor() : this(6, 6) //calling another constructor from one
    {
        println("empty secondary constructor")
    }

    constructor(a: Int, b: Int) {
        var result = a + b
        println("2 args secondary constructor with output $result")
    }

    constructor(a: Int, b: Int, c: Int) {
        var result = a + b + c
        println("3 args secondary constructor with output $result")
    }
}

fun main() {
    var obj = P33SecondaryConstructor()

    var obj1 = P33SecondaryConstructor(2, 3)

    var obj2 = P33SecondaryConstructor(2, 2, 2)
}