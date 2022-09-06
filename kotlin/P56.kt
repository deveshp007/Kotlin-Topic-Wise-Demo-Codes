/*The compiler only uses the properties defined inside the
 primary constructor for the automatically generated
 functions.It excludes the properties that are declared in
  the class body.
 */

fun main(args: Array<String>) {
    //declaring a data class
    data class man(val name: String) {
        //property declared in class body
        var height: Int = 0;
    }

    //declaring a variable of the above data class and
    //initializing values to all parameters

    val man1 = man("manish")  //class body properties must be assigned uniquely
    man1.height = 70
    println(man1.toString())//this method prints the details of class that are declared in primary constructor
    println(man1.height)//printing the height of man1

}