/*creation of array
basic properties of arrays –
-->They are stored in contiguous memory locations.
-->They can be accessed programmatically through their indexes (array[1], array[0], etc.)
-->They are mutable.
-->Their size is fixed. */
fun main(args: Array<String>) {
//A.create array using arrayOf() method
/*A.1 int type array(implicit declaration) accessing
using range where i deals with index*/
    println("int type array accessing using range")
    var arr =
        arrayOf(1, 2, 3, 4, 5) //implicit type declaration. var will see the type of data consider it int type array
    for (i in 0..arr.size - 1)
        println("array elements are ${arr[i]}"); // putting semicolon at the end is optional
    println()


/*A.2. char type array (explicit declaration)accessing
through for loop over array*/
    println("char type array accessing through elements")
    var arr1 = arrayOf<Char>(
        'a',
        'b',
        'c',
        'd'
    )//explicit type declaration using angular bracket telling the compiler that it will take char type data
    for (a in arr1) {
        println("array elements are $a")
    }
    println()


/*A3.Kotlin also has some built-in factory methods to
create arrays of primitive data types*/
    println(
        "int type array created using built in function and" +
                "accessing through index of array"
    )
    val arr2 = intArrayOf(1, 2, 3, 4)
    for (i in arr2.indices) {
        println("it will print the value based on index ${arr2[i]}")
    }
    println()


/*B create array using constructor
Array is a class in Kotlin, use the Array constructor
to create an array.The constructor takes two parameters:
-->The size of the array, and
-->A function which accepts the index of a given
element and returns the initial value of that
element.It is lambda expression*/
    println("array creation using Array class")
    var arr3 = Array(3, { i -> i + 2 })
    for (i in 0..arr3.size - 1) //OR for(i in 10..20) it will represent elements value as 10 to 20
        println("array created using Array class have elements $i")


}