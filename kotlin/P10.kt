/*loops
* A. while loop (syntax same as that of java)
* B. do while loop (syntax same as that of java)
* C. for loop: for loop is used to traverse through any
data structure which provides an iterator.
-->iterator: its something which gets initialised from the
first value in collection,range,array or string and
increment automatically
Syntax:
for(item in collection) {
// code to execute
}
In Kotlin, for loop is used to iterate through the
following because all of them provides iterator.
-->Range
-->Array
-->String
-->Collection
*/


// Code of for loop and types of implementation in for loop ------

fun main(args:Array<String>){
    // For loop for printing from 1 to 5
    for(i in 1..5){
        print(" "+i)
    }
    println()

    // C2.Iterate through range in reverse order
    /*for(i in 5..1 ) it will act as not true condition of
    for loop and will never enter the loop */
    //to print in reverse , we have downTo keyword

    // for loop for printing in reverse using downTo keyword
    for(i in 6 downTo 1){
        print(" "+i)
    }
    println()

    // for loop for printing in form of steps using step keyword
    for (i in 1..5 step 2){
        print(" "+i)
    }
    println()

    // for loop for printing in reverse order with steps
    for (i in 10 downTo 1 step 3){
        print(" "+i)
    }
    println()
}