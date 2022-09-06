/* kotlin program with expressions, statement, block and scope of variables.
Declare the variables with val and var and identify the difference when we pass the variables in the inner and outer block.
Include multiple statements in the blocks
 */

fun main(args:Array<String>){
    expression()
    var result = if(4>0){
        "hiii"
    }
    else{
        66
    }
    println(result)
    // Using var ------
    var c =90
    if(c==90){
        var c= 60
        println(c)
    }
    println(c)

    // Using val ------
    val d = 88
    if(d==88){
        val d= 60
        println(d)
    }
    println(d)
}
fun expression(){
    var a = 5
    var b = 6
    println(a+b)
}

/*    ****** NOTES ******

A.Expression: It is anybody in a program which produces one
output after performing some computation on set of statements.
variable/class declaration,assignment are not an expression

B. Statement: It is every statement to perform an independent action

C: Block: It is set of statements written in a body(means
a pair of open and closed curly bracket)to get solution of
one specific problem.It any variable declared inside a block
its scope will remain within that block

D: Scope of any variable:If we have nested blocks and the
variables declared at the head of the block are visible
throughout the block and any nested blocks, unless a
variable with the same name declared at the head in the
inner block. When a new declaration is effective throughout
the inner block, the outer declaration becomes effective
again at the end of the inner block. So, we can say that
variables have nested scopes*/
