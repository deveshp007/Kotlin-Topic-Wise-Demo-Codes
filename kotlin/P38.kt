/*If the derived class does not contain primary constructor,
we need to call the base class secondary constructor from
the secondary constructor of derived class using the
super keyword. We also need to initialize the base class
secondary constructor using the parameters of derived
class.
*/

//base class
open class Employee2 {
    constructor(name: String, age: Int) {
        println("Name of the Employee is $name")
        println("Age of the Employee is $age")
    }
}

// derived class
class CEO1 : Employee2 {
    constructor(name: String, age: Int, salary: Double) : super(name, age) {
        println("Salary per annum is $salary million dollars")
    }
}

fun main(args: Array<String>) {
    CEO1("Satya Nadela", 48, 250.00)
}