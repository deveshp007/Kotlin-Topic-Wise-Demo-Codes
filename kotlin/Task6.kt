import java.util.*

// Sort given input string in Lexicographical order.
fun main(args:Array<String>){
    var sc = Scanner(System.`in`)
    var arr = arrayOfNulls<String>(5)
    for (i in 0..4) {
        print("Enter the String ${i + 1} : ")
        arr[i] = sc.nextLine()
    }
    arr.sort()
    println("After Sorting in Lexicographical order :")
    for (i in 0..4) {
        println("${arr[i]}")
    }

}
