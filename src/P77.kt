/*Safe Call operator:if there are number of variables
 holding null.checking it with if else would be a difficult
 task, so we can also use safe call operator ( "?.")

We can use the safe call operator with let(), also() and
run() if value is not null- */
fun main() {
    //A.safe call operator
    var s1: String? = "hello girl"
    var s2: String? = null
    s1?.toUpperCase()  //check s5 if not null,then call the method
    s2?.toUpperCase()

    /*B. let(): To execute an action only when a reference
     holds a non-nullable value, we can use a let operator.
      The lambda expression present inside the let is
      executed only if the variable is not null.

 -->"let{}" with safe call operator.let{}(in the curly
    bracket there is lambda expression).It executes an action
         only when a reference holds a non-nullable value, we
        can use a let operator. The lambda expression present
        inside the let is executed only if the variable
        firstName is not null. */
    var s3: String? = "hello"
    s3?.let {
        it.length
        println("this is lambda exp defined inside let and the non null string length is ${it.length}")
    }


    /* C. also() method chain with let() –If we want to apply
    some additional operation like printing the non-nullable
     items of the list we can use and also() method and chain
      it with a let() or run().It will specifically called
       n list*/
    // created a list contains names
    var stringlist: List<String?> = listOf("Geeks", "for", null, "Geeks")
    // created new list
    var newlist = listOf<String?>()
    for (item in stringlist) {
        // executes only for non-nullable values
        item?.let { newlist = newlist.plus(it) }
        item?.also { it -> println(it) }
    }

/*D. run() method –Kotlin has a run() method to execute some
operation on a nullable reference. It seems to be very
similar to let() but inside a function body, the run()
 method operates only when we use this reference instead of
  a function parameter:
 */
// created a list contains names
    var stringlist1: List<String?> = listOf("Geeks", "for", null, "Geeks")
// created new list
    var newlist1 = listOf<String?>()
    for (item in stringlist1) {
        // executes only for non-nullable values
        item?.run { newlist1 = newlist1.plus(this) } // this reference
        item?.also { it -> println(it) }
    }
}
