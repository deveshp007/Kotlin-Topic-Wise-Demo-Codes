//functions

/* functions: these are the blocks which has a name,return
 type and list of arguments and then a body in which logic
  to solve a particular problem is written.like main () is
  the one default function given for JVM.
  Syntax:
  keyword_fun name_of_the _fxn(list_of_parameter as a:data_type,b: data_type):return_type
  {
  body to write logic
  }

  there are two types of functions:
  1. library of predefined functions:
  2. User Defined functions

  */
fun main(args:Array<String>) {
    println("call no arg no ret sum()")
    sum()

    println("call with arg no ret sum()")
    sum1(5, 10)

    println("call no arg with ret sum()")
    var a: Int = sum2()
    println("out of with return type method is: " + a)

    println("call with arg with ret sum()")
    var b = sum3(50, 10)
    println("output of with return type method is: " + a)

}

//no arg no ret
fun sum(): Unit //Unit means void return type mentioning it is optional
{
    var a = 9
    var b = 10
    var result = a + b
    print("sum of adding $a and $b is : $result")
}

//with arg no ret
fun sum1(x: Int, y: Int) {
    var result = x + y
    print("sum of adding $x and $y is : $result")
}

//no arg with ret
fun sum2(): Int {
    var a = 9
    var b = 10
    return a + b
}

fun sum3(x: Int, y: Int): Int {
    return x + y
}