/*Overriding Member functions and properties –
If base class and derived class contains a member function
 with same name, then we can override the base member
 function in the derived class using the "override" keyword
 and also need to mark the member function of base class
  with "open" keyword.
 */
// base class
open class Animal1 {
    open fun run() {
        println("Animals can run")
    }
}
// derived class
class Tiger1: Animal1() {
    override fun run() {       // overrides the run method of base class
        println("Tiger can run very fast")
    }
}
fun main(args: Array<String>) {
    val t = Tiger1()
    t.run()
}
