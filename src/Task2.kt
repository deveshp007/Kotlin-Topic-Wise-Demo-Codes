// Code for implementing 'different string functions of java' in kotlin ----------
fun main(args:Array<String>){
    var str1:String = "Hello World!!"
    var str2:String = "Oye Lucky,Lucky Oye"

    println(str1.compareTo(str2))
    println(str1.get(4))
    println(str1.plus(str2))
    println(str1.subSequence(3,7))
    println(str2.drop(5))
    println(str2.dropLast(4))
//    println(str2.CharSequence.contains(Oye,))

}