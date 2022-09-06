/* Data classes:We often create classes to hold some data
 in it. In such classes, some standard functions are often
  derivable from the data. In Kotlin, this type of class is
   known as data class and is marked as data.

--> Example: data class Student(val name: String, val roll_no: Int)
The compiler automatically derives the following functions :
equals()
hashCode()
toString()
copy()

-->Rules to create Data classes –
1.The primary constructor needs to have at least one
parameter.
2.All primary constructor parameters need to be marked as
val or var.
3.Data classes cannot be abstract, open, sealed or inner.
4.Data classes may only implement interfaces.


-->toString():This function returns a string of all the
parameters defined in the data class .
 */
fun main(args: Array<String>) {
    //declaring a data class
    data class man(val roll: Int, val name: String, val height: Int)

    //declaring a variable of the above data class
    //and initializing values to all parameters

    val man1 = man(1, "man", 50)

    //printing all the details of the data class
    println(man1.toString());
}