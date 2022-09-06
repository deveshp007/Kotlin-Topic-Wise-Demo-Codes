/*Type Checking –
In Kotlin, we can check the type of certain variable using
the "is" operator at runtime. It is a way of checking the
type of variable at runtime to separate the flow for
different objects. */

fun main(args: Array<String>) {

    //A. Kotlin program of type checking using if-else blocks-
    var name = "Praveen"
    var age = 24
    var salary = 5000.55
    val employeeDetails: List<Any> = listOf(name, age, salary)

    for (attribute in employeeDetails) {
        if (attribute is String) {
            println("Name: $attribute")
        } else if (attribute is Int) {
            println("Age: $attribute")
        } else if (attribute is Double) {
            println("Salary: $attribute")
        } else {
            println("Not an attribute")
        }
    }

    /*B type checking Using when expression – We can easily replace the
    if-else blocks with when expression. We have already
     learnt about when expression in control flow articles.
     */

    var name1 = "Praveen"
    var age1 = 24
    var salary1 = 5000.55
    var emp_id1 = 12345f
    val employeeDetails1: List<Any> = listOf(name1, age1, salary1, emp_id1)

    for (attribute in employeeDetails1) {
        when (attribute) {
            is String -> println("Name1: $attribute ")
            is Int -> println("Age1: $attribute")
            is Double -> println("Salary1: $attribute")
            else -> println("Not an attribute")
        }
    }


/*C. Smart Casting –In Java or other programming languages
, there is a requirement of explicit type casting on the
variable before accessing the properties of that variable
but Kotlin does a smart casting. The Kotlin compiler
automatically converts the variable to a particular
class reference once it’s passed through any conditional
operator.

Let’s take an example of Java, First of all, we check the
type of the variable using the instanceOf operator and
then cast it to the target type like this –

Object ob = "GeeksforGeeks";

if(ob instance of String) {
    // Explicit type casting
    String str = (String) ob;

    System.out.println("length of String " + str.length());
}
In Kotlin, smart type casting is one of the most
interesting features available. We use "is" or "!is" operator
to check the type of variable, and compiler automatically
casts the variable to the target type like this- */

    val str1: String? = "GeeksforGeeks"
    var str2: String? = null   // prints String is null
    if (str1 is String) {
        // No Explicit type Casting needed.
        println("length of String ${str1.length}")
    } else {
        println("String is null")
    }


/*D. Use of !is Operator
Similarly using !is operator we can check the variable. */

    val str11: String? = "GeeksforGeeks"
    var str22: String? = null  // prints String is null
    if (str11 !is String) {
        println("String is null")
    } else {
        println("length of String ${str11.length}")
    }
}

/*Note: Smart cast don’t work when the compiler can’t
guarantee that the variable cannot change between the
check and the usage. Smart casts are applicable according
to the following rules:


1.val local variables always works except for local delegated
properties.
2.val properties works only if the property is private or
internal or the check is performed in the same module
where the property is declared. Smart casts aren’t
applicable to open properties or properties that have
custom getters.
3.var local variables works only if the variable is not
modified between the check and the usage, is not captured
in a lambda that modifies it, and is not a local delegated
property.
4.var properties – never works because the variable can be
modified at any time. */