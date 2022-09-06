/* Create a kotlin program using Inheritance on Car  ----------
 -> Engine Should be same
 -> Length, breadth,color, etc. Should change */

// base class
open class Car(color:String, price:Float ) {
    init {
        var engine = "AMG4039"
        println("Car color : ${color}")
        println("Car price : ${price}")
        println("Car engine : ${engine}")

    }
}
// derived class
class MSClass: Car{
    constructor(color: String, price: Float):super(color,price){
    }
}
// derived class
class MGClass: Car{
    constructor(color: String, price: Float):super(color,price){
    }
}

fun main(args: Array<String>) {
    val ob1 = Car("Red", 120000f)
    println()
    val ob2 = MSClass("Yellow", 340000f)
    println()
    val ob3 = MGClass("White", 860000f)

}



