class P32PRimaryConstructorWithDefaultValues constructor(a:Int=89, b:Int=123) {
    var rollno:Int
    var phoneno:Int
    init {
        println("inside init block")
        rollno=b
        phoneno=a
        println("roll no is $rollno")
        println("phone no is $phoneno")
    }
}
fun main() {
    var obj = P32PRimaryConstructorWithDefaultValues() //calling default parameters
    println("after constructor call roll no is ${obj.rollno}")
    println("after constructor callphone no is ${obj.phoneno}")
}