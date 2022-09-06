fun main()
{
    println("return functuon as a return type from the function")
    var result=higherOrderFxnReturnsFxn() //it will return ActualFxn to which result is pointing and finalresult is further calling ActualFxn in real
    var finalResult=result(5,5)
    println("the value result is holding is $result and the output is $finalResult")
}
fun higherOrderFxnReturnsFxn():(Int,Int)->Int //declare return type same as that of actual function
{
    return ::ActualFunctionExp //it is returning the function
}
fun ActualFunctionExp(a:Int,b:Int):Int
{
    return a*b
}