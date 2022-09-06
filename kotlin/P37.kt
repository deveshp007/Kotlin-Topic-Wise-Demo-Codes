/*Kotlin's inheritance primary constructor –
If the derived class contains a primary constructor, then
we need to initialize the base class constructor using the
parameters of the derived class. In the below program, we
have two parameters in primary constructor of base class
and three parameters in derived class.
*/

//base class
open class Employee1(name: String, age: Int) {
    init {
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
    }
}

// derived class
class CEO(name: String, age: Int, salary: Double) : Employee1(name, age) {
    init {
        println("Salary per annum is $salary crore rupees")
    }
}

fun main(args: Array<String>) {
    CEO("Sunder Pichai", 42, 450.00)
}