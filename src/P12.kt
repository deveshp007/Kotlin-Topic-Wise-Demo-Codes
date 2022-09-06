// Kotlin codes for array and its implementation --------
fun main(args: Array<String>) {

    var arr = arrayOf("one", "two", "three", "four", "five") // declaring and initializing array

    // printing elements of array using for loop
    for (item in arr) {
        print(" " + item)
    }
    println()

    // printing elements of array with indices
    for (item in arr.indices) {
        if (item % 2 == 0) {
            print(" " + arr[item])
        }
    }
    println()

    // Iterating array with value and index -----
    for ((index, value) in arr.withIndex()) {
        println("The element at ${index + 1} is $value")
    }

    println()

    // traverse the list(collection) using for loop.
    val c = listOf(1,2,3,"listOf", "mapOf", "setOf")
    for (ele in c) {
        print(" "+ele)
    }

    println()

    // for loop using until, it excludes the last value
    for(i in 1 until 5)
        print(" "+i)

    println()

    /* Iterate through string using for loop. There are following ways to traverse the string:
    -->Without using Index property
    -->With Using Index property
    -->Using withIndex Library Function */

    // Iterating Through a String
    val text = "Hello World"
    for (i in text)
        print(" " + i)
    println()

    var n = "hello"
    var n1 = "hey girl"

    // 1. traversing string without using index property
    for (alphabet in n)
        print("$alphabet ")
    println()

    // 2. traversing string with using index property
    for (i in n1.indices)
        print(n1[i]+" ")
    println()

    // 3. traversing string using withIndex() library function
    for ((index,value) in n.withIndex()) //index ,value are keywords
        println("Element at $index th index is $value")

}
