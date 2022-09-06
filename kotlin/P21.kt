/* Arguments in function:There are two types of arguments:
1. default arguments:arguments which need not specify
explicitly while calling a function are called default
arguments.If the function is called without passing
arguments then the default arguments are used as
function parameters
2. Named arguments:in default args if we jumble the
arguments then it will give compilation error, so we
have to pass the actual arguments to formal arguments
in the same order as defined during function declaration.*/

fun main(args: Array<String>) {
/*A.1. Default args in a function :when no arg given in
call of function*/
    defaultArg()
    println()

/*A.2. Default args in a function :when partial arg given in
call of function*/
    defaultArg(20)
    println()

/*A.3. Default args in a function :when all arg given in
call of function*/
    defaultArg(20, "anshu", 5.5f)
    println()

/* defaultArg("riya",10f) it will give CTE as order of
* args is changed,it should be defaultArg(Int,String,Float)
* So to avoid this we have named arguments*/

//B. Named Arguments
    var i = 9
    var str = "priya"
    var f = 9.8f
    defaultArg(b = str, c = f) //it will get that i am partially passed the 2nd and 3rd argument

}

@JvmOverloads //needed to tell overloaded version when named args are passed
fun defaultArg(
    a: Int = 7,
    b: String = "shelly",
    c: Float = 5.5f
) //2^3 different argument mentioning calls are possible to this
{
    println("concatenation of $a , $b and $c is ${b + a + c}")
}