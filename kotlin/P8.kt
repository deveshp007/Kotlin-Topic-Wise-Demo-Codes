// Kotlin program for data type conversion ----------------------

/* Type Conversion:One smaller data type can be assigned to
another larger data type implicitly but Kotlin does not
support implicit type conversion. example: An integer value
can not be assigned to long data type.But kotlin has
helper function which explicitly perform type conversion.
*/

fun main(args:Array<String>){

    var a = 1000
/* var b:Long=a //this line will give type mismatch
error i.e. found long but required int.*/

    var d:Byte= a.toByte()
    println("Byte : $d")

    var b:Long= a.toLong()
    println("Long : $b")

    var c:Double= a.toDouble()
    println("Double : $c")

    var e:String= a.toString()
    println("String : $e")

    var f:Short= a.toShort()
    println("Byte : $f")

    println("Hii"+(1000L.toInt()))
}