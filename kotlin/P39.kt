/*a function which can accepts a function as parameter or can return
a function is called Higher-Order function .Function which passed as
a parameter mostly lambda exp*/
fun main(args: Array<String>) {
    println("High order function when it takes function but returns nothing")
    higherfuncWithfunctionAsArgWithoutReturn(
        "function as an arg in high order fxn which return nothing",
        ::FunctionExp1
    )
    println()

    println("High order function when it takes function and returns ")
    higherfuncWithfunctionAsArgWithReturn(::FunctionExp2)

}

//B. higher order Function with function type argument
//B.1. High order function when function returns nothing
fun higherfuncWithfunctionAsArgWithoutReturn(str: String, myFunc: (String) -> Unit) {
    myFunc("without return function as arg")
}

fun FunctionExp1(str: String): Unit {
    println(str)
}

fun higherfuncWithfunctionAsArgWithReturn(myFunc2: (Int, Int) -> Int) {
    var result = myFunc2(5, 5)
    println("$result")
}

fun FunctionExp2(a: Int, b: Int): Int {
    return a + b
}