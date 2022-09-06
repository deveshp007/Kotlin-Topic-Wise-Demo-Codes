/*Calling the superclass implementation –
We can also call the base class member functions or
properties from the derived class using the super keyword.
In the below program we have called the base class property
 color and function displayCompany() in derived class using
  the super keyword. */
// base class
open class Phone() {
    var color = "Rose Gold"
    fun displayCompany(name:String) {
        println("Company is: $name")
    }
}
// derived class
class iphone: Phone() {
    fun displayColor(){
        // calling the base class property color
        println("Color is: "+super.color)
        // calling the base class member function
        super.displayCompany("Apple")
    }
}
fun main(args: Array<String>) {
    val p = iphone()
    p.displayColor()
}