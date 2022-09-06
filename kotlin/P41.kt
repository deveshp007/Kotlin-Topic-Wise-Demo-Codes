/*Higher Order Functions:a function which can accepts a function as parameter or can returns
a function is called Higher-Order function .Function which passed as
a parameter mostly lambda exp or functions

-->This program tells about when higher order function has lambda
type argument*/
fun main(args: Array<String>) {
    println("High order function when function takes lambda but returns nothing")
    higherFuncWithLambdaWithoutReturn(lambdaExp1) //actual parameter ,go to line 26
    println()

    println("High order function when function takes lambda and returns ")
    higherFuncWithLambdaWithReturn(lambdaExp2) //actual parameter, go to line 36
    println()
}

// higher order Function with lambda type argument
//A. High order function when lambda returns nothing
fun higherFuncWithLambdaWithoutReturn(lambdaOneWithoutReturn: () -> Unit) {
    lambdaOneWithoutReturn()
}

val lambdaExp1: () -> Unit = { println("i do not return anything") } //actual argument definition
/*OR can also be written as
val call={println("i do not return anything")}
*/

//B.High order function when lambda returns
fun higherFuncWithLambdaWithReturn(lambdaWithReturn: (Int, Int) -> Int) { // accepting lambda as parameter

    var result = lambdaWithReturn(2, 4) // invokes the lambda expression by passing parameters
    println("The sum of two numbers is: $result")
}

val lambdaExp2 = { a: Int, b: Int -> a + b }