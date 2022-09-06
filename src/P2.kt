fun main(args:Array<String>)
{
    //Kotlin Program which has all the data types Byte, Short, Int, Long Float, Double, Boolean , Char and String
//any variable
    var x=5
    var y=90
    println("My integer ${x}") //$ is concatenated with variable name to replace it with the value in a statement
    println("My long integer $x") //curly brackets for just getting the value is optional
    println("My long integer ${y+6}") //curly brackets to make it work life an operation are mandatory i.e it meas first replace y with 90 and then add 5 to it.
    println("My long integer ${y}")


    var b1: Byte = Byte.MIN_VALUE //data type of b1 is mentioned to avoid the risk of wring understanding by the compiler
    var b2: Byte = Byte.MAX_VALUE
    println("Smallest byte value: " +b1)
    println("Largest byte value: " +b2)


    var S1: Short = Short.MIN_VALUE
    var S2: Short = Short.MAX_VALUE
    println("Smallest short value: " +S1)
    println("Largest short value: " +S2)

    var I1: Int = Int.MIN_VALUE
    var I2: Int = Int.MAX_VALUE
    println("Smallest integer value: " +I1)
    println("Largest integer value: " +I2)

    var L1: Long = Long.MIN_VALUE
    var L2: Long = Long.MAX_VALUE
    println("Smallest long integer value: " +L1)
    println("Largest long integer value: " +L2)

    var F1: Float = Float.MIN_VALUE
    var F2: Float = Float.MAX_VALUE
    println("Smallest Float value: " +F1)
    println("Largest Float value: " + F2)

    var D1: Double = Double.MIN_VALUE
    var D2: Double = Double.MAX_VALUE
    println("Smallest Double value: " + D1)
    println("Largest Double value: " + D2)

    var ch:Char='v'
    println("char value is: " + ch)

    var boo=5<10
    println("boolean value is: " + boo)


}