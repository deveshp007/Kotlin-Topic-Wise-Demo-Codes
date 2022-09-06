fun main(args:Array<String>){

    // kotlin program with all types of operators Arithmetic, Relation, Assignment, Unary, Logical and Bitwise operators


    // Arithmetic Operators --------

    val number1 = 12.5
    val number2 = 3.5
    var result: Double

    result = number1 + number2
    println("number1 + number2 = $result")

    result = number1 - number2
    println("number1 - number2 = $result")

    result = number1 * number2
    println("number1 * number2 = $result")

    result = number1 / number2
    println("number1 / number2 = $result")

    result = number1 % number2
    println("number1 % number2 = $result")


    // Assignment Operators -----------

    var number = 12

    number += 5   // number = number+5
    println("number  = $number")

    number -= 5   // number = number-5
    println("number  = $number")

    number *= 5   // number = number*5
    println("number  = $number")

    number /= 5   // number = number/5
    println("number  = $number")

    number %= 5   // number = number%5
    println("number  = $number")


    // Unary Operators -----------

    val a = 1
    val b = true
    var c = 1

    var res: Int
    var booleanResult: Boolean

    res = -a
    println("-a = $res")

    booleanResult = !b
    println("!b = $booleanResult")

    --c
    println("--c = $c")
    ++c
    println("++c = $c")


    // Relation or Comparison Operator --------

    val x = -12
    val y = 12

    // use of greater than operator
    val max = if (x > y) {
        println("x is larger than y.")
        x
    } else {
        println("y is larger than x.")
        y
    }
    println("max = $max")


    // Logical Operator ----------

    val p = 10
    val q = 9
    val r = -1
    val reqd: Boolean

    // result is true is p is largest
    reqd = (p>q) && (p>r)
    println(reqd)


    // Bitwise operators --------

    val num1 = 12
    val num2 = 25
    var resul: Int

    resul = num1 or num2
    println("or = $resul")

    resul = num1 and num2
    println("and = $resul")

    resul = num1 xor num2
    println("xor = $resul")

    resul = num1.inv()
    println("inv() = $resul")



}