/*Range:In Kotlin, the range is a collection of finite values
which is defined by endpoints. The range in Kotlin
consists of a start, a stop, and the step. The start
and stop are inclusive in the Range and the value of
step is by default 1.The range is used with comparable
types.

-->There are three ways for creating Range in Kotlin –
1.Using (..) operator:It is the simplest way to work with
range. It will create a range from the start to end
including both the values of start and end. It is the
operator form of rangeTo()function. Using (..) operator
we can create range for integers as well as characters.
2.Using rangeTo() function:It is similar to (..) operator.
It will create a range upto the value passed as an
argument. It is also used to create range for integers
as well as characters.
3.Using downTo() function:It is reverse of the rangeTo()
or (..) operator. It creates a range in descending order,
i.e. from bigger values to smaller value. Below we create
range in reverse order for integer and characters both.*/

fun main(args: Array<String>) {

    //A. Kotlin program of integer range using (..) operator –
    println("Integer range:")
    for (num in 1..5) {  // creating integer range
        println(num)
    }

//B.Kotlin program of character range using (..) operator –
    println("Character range:")
    for (ch in 'a'..'e') {// creating character range
        println(ch)
    }

//C.Kotlin program of integer range using rangeTo() function –
    println("Integer range:")
    for (num in 1.rangeTo(5)) {// creating integer range
        println(num)
    }


//D.Kotlin program of character range using rangeTo() function –

    println("Character  range:")
    for (ch in 'a'.rangeTo('e')) { // creating character range
        println(ch)
    }

//E.Kotlin program of integer range using downTo() function –
    println("Integer range in descending order:")
    for (num in 5.downTo(1)) { // creating integer range
        println(num)
    }


//F.Kotlin program of character range using downTo() function –

    println("Character range in reverse order:")
    for (ch in 'e'.downTo('a')) { // creating character range
        println(ch)
    }

/*g.Range using forEach loop –The forEach loop is also
 used to traverse over the range. */
    println("Integer  range:")
    (2..5).forEach(::println)// creating integer range


/*H.step():With keyword step, one can provide step between
 values. It is mainly used in order to provide the gap
between the two values in rangeTo() or downTo() or in
 (..) operator. The default value for step is 1 and the
 value of step function cannot be 0. */
    var i = 2
    // for loop with step keyword
    for (i in 3..10 step 2)
        print("$i ")
    println()
    // print first value of the range
    println((11..20 step 2).first)
    // print last value of the range
    println((11..20 step 4).last)
    // print the step used in the range
    println((11..20 step 5).step)


/*I. reversed function():It is used to reverse the given
 range type. Instead of downTo() we can use reverse()
function to print the range in descending order. */

    var range = 2..8
    for (x in range.reversed()) {
        print("$x ")
    }

//J.Some predefined function in range –There are some
// predefined function in Kotlin Range: min(), max(),
// sum(), average().
    val predefined = (15..20)
    println("The minimum value of range is: " + predefined.min())
    println("The maximum value of range is: " + predefined.max())
    println("The sum of all values of range is: " + predefined.sum())
    println("The average value of range is: " + predefined.average())
    var i1 = 2
    //to check whether the value lies in the range
    if (i1 in 5..10)
        println("$i1 is lie within the range")
    else
        println("$i1 does not lie within the range")
}

