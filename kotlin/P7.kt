import java.util.Scanner

// Kotlin Program for Scanner and taking input of different data type using Scanner

/*input is the basic operation performed to flow byte streams from input device.
    * There are two ways to take input :
    * 1. using readLine() (compatible with String data type, but you can convert String to any other data type(if compatible) using predefined methods) method
    * 2. using Scanner class when user give I/P other than String, you need to use Scanner class.*/

fun main(args:Array<String>){
    var a = readLine()!! // putting !! makes it mandatory to give input
    println("Input : "+a)

    var sc = Scanner(System.`in`)

    println("Enter Byte value : ")
    var c = sc.nextByte()
    println("Enter Int value : ")
    var b = sc.nextInt()
    println("Enter Float value : ")
    var d = sc.nextFloat()
    println("Enter Double value : ")
    var e = sc.nextDouble()
    println("Enter Long value : ")
    var f = sc.nextLong()
    println("Enter Short value : ")
    var g = sc.nextShort()

    println("Byte : $c")
    println("Int : $b")
    println("Float : $d")
    println("Double : $e")
    println("Long : $f")
    println("Short : $g")

}