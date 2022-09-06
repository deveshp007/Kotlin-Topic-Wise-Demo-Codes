// Generics Demo -----------
class GenericDemo<T> (text: T) {
    var x = text
    init{
        println(x)
    }
}
fun main(args: Array<String>){
    var name: GenericDemo<String> = GenericDemo<String>("GeeksforGeeks")
    var rank: GenericDemo<Int> = GenericDemo<Int>(12)// compile time error
}
