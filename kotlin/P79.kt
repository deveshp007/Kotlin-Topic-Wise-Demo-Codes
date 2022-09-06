/*Not null assertion : !! Operator:
The not null assertion (!!) operator converts any value to
a non-null type that means if the valid object is found
then that is considered otherwise it throws an exception
if the value is null.If anyone wants NullPointerException
 on encountering null object then he can ask explicitly
 using this operator.

 it needs to be thrown explicitly null pointer exception
  at run time sometimes when compiler is not able to
  infer the data type.

  --?With not-null assertion operator, you explicitly
  emphasize where null pointer exception can be thrown.
  And if it's thrown, you can see directly what might
  be the cause. That means it doesn't make sense to
  put two or more not-null assertion operators in
  one line. As you won't be able to say which
  one cause the exception

  -->instead of this prefer to use safe access "?." operator OR
  elvis operator"?:" OR if-else statements*/

fun main(args: Array<String>) {
    var str : String?  = "GeeksforGeeks"
    println(str!!.length)
    /*str = null
    str!!.length   it will give null pointer exception */
}
