/*A constructor is a special member function that is invoked
when an object of the class is created primarily to
initialize variables or properties. A class needs to have
a constructor and if we do not declare a constructor,
then the compiler generates a default constructor.

Kotlin has two types of constructors –
1.Primary Constructor
2.Secondary Constructor

Primary: A class in Kotlin can have at most one primary constructor
as it gets initialized immediately next to class name.
The primary constructor initializes the class,

Secondary: One or more secondary constructors which is defined
inside the class body. while the secondary
constructor is used to initialize the class as well as
some extra logic.

this program makes primary constructor:passing parameters
are optional to primary constructor.The constructor
keyword can be omitted if there is no annotations or
access modifiers specified.*/

class P30Constructors constructor(num1:Int, num2:Int) //primary constructor with two parameters
{
    var name="with params constructor"
    var result=num1+num2 //num1 and num2 are constructor parameters
    fun display():Unit{
        println("the roll no is $name and the result of sum is $result")
    }
}

class PrimaryConstructWithoutParams()//primary constructor with no parameters
{
    var name="Without Params constructor"
    fun display():Unit{
        println("the name is $name")
    }
}
fun main()
{
    var obj=P30Constructors(5,10)
    println("the result of sum through primary constructor is ${obj.result}")


    var obj2=PrimaryConstructWithoutParams()
    println("the result of sum through primary constructor is ${obj.result}")
    obj2.display()

}