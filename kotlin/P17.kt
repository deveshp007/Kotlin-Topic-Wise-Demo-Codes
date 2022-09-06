/*access and modify the array created using Array class
there are two ways of doing this:
-->using get() and set() methods as these methods are the
member functions of predefined Array class.*/
fun main(args: Array<String>) {
//first create an array
    var arr = arrayOf(12, 20, 30, 40, 50, 60)

    /* ACCESS using get(): now access the element using get() method. It takes
    a single parameter i.e.the index of the element and
    returns the value of the item at that index.*/
    var a = arr.get(0)
    println("the value at 0 index of the array is $a");

/*B. MODIFY using set():The set() method takes 2 parameters: the
index of the element and the value to be inserted.
*/
    arr.set(3, 456)

//C.now print using withIndex()
    for ((index, value) in arr.withIndex()) {
        println("the values $value at index $index")
    }

    //access and modify using [] index operator
    var num = arr[3]
    arr[1] = 989
//now print
    for ((index, value) in arr.withIndex()) {
        println("the values $value at index $index")
    }


    /*Kotlin program of array traversal using foreach
    loop*/
    val arr1 = arrayOf<Int>(1, 2, 3, 4, 5)
    arr1.forEach({ i -> println(i) })
}