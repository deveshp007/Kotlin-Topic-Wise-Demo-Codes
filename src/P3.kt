/* Variables must be declared before use otherwise compile time error
 In Kotlin, variables are declared using two types –
Immutable using val keyword
Mutable using var keyword

*/

fun main(args:Array<String>)
{
    //Kotlin program with Val and Var keyword and pass the val value to the third variable and identify the difference between mutable and immutable

    val name: String="hi"
    val Lastname="good morning"
    var name1:String="good"
    var Lastname1="good night"
    val name2=name1
    val Lastname2=Lastname
    println("${name}")
    print("$Lastname2\n")
    print("$Lastname\n")
    print("$name2")




}