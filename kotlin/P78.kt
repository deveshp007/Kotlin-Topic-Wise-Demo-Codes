/*The Elvis operator is used to return a non-null value or a
default value when the original variable is null. In other
words, if left expression is not null then elvis operator
returns it, otherwise it returns the right expression. The
right-hand side expression is evaluated only if the left-hand
side found to be null.

The following expression:
            val name = firstName ?: "Unknown"
    is equivalent to:
            val name = if(firstName!= null)
                        firstName
                        else
                        "Unknown"
Moreover, we can also use throw and return expressions on
the right side of Elvis operator and it is very useful in
functions. Hence, we can throw an exception instead of
returning a default value on the right side of Elvis
operator.

    val name = firstName ?: throw IllegalArgumentException("Enter valid name")*/
fun main(args: Array<String>) {
    var str: String? = "GeeksforGeeks"
    println(str?.length)
    str = null
    println(str?.length ?: "-1")   //elvis operator


    // preferences of operators
    var a: Int? = 2
    var b: Int = 3
    println(a ?: 0 + b)   //sum has more precedence than elvis operator: o/p 2

}