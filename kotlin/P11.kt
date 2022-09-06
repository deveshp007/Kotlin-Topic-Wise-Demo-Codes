// Code of while loop and its implementation ------
fun main(args: Array<String>) {

    var i = 0
    while (i <= 10) {
        print(" ${i+1}")
        ++i
    }
    println()

    // do-while loop -----------
    println("inside do-while loop")
    var a1:Int=0
    do
    {
        println("hello do while ${a1+1}")
        a1++
    }while(a1<10)
    println()
}