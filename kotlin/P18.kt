/*String :Kotlin strings are also immutable in nature same
as that of java */
fun main(args: Array<String>) {
    var str = "hello"
//A . to traverse a string considering as an object
    println("to get whole string " + str) //to read it as a string

//OR using for loop iterator
    for (i in 0..str.length - 1) //to read the string character by character using iterator over for loop
    {
        println("$i character of string is " + str[i])
    }

//OR using index operator
    println("index character of string is " + str[0]) //access each character index wise using index operator
    println("index character of string is " + str[1])
    println("index character of string is " + str[2])
    println("index character of string is " + str[3])
    println("index character of string is " + str[4])

//OR using get method
    println("index character of string is using get() " + str.get(0))
    println("index character of string is using get() " + str.get(1))
    println("index character of string is using get() " + str.get(2))
    println("index character of string is using get() " + str.get(3))
    println("index character of string is using get() " + str.get(4))


    /* To create an empty string,create an instance of
    String class calling its constructor. */
    var str1 = String()
    println("empty string " + str1)

//C. string template i.e $
    var str2: String = "hello girl"
    println("$str2 has ${str2.length} length")

//D. to get sub sequence
    var str3 = "hello girl"
    println("gettig substring from string " + str3.subSequence(0, 3)) //from index 0 of length 3

//E. compare to
    println("comparing str2=hello girl with str3=hello girl " + str2.compareTo(str3))
    println("comparing str=hello with str3=hello girl " + str.compareTo(str3))
    println("comparing str3=hello girl with str=hello " + str3.compareTo(str))

//F."=="( content equality) and "===" (reference equality)on string
    var a = "hey"
    var b = "hey"
    var c = "hello"
    var d = "hellohey"
    println("== operator on a and b" + a == b)
    println("=== operator on a and b" + (a === b))
    println("== operator on b and c" + b == c)
    println("=== operator on b and c" + b === c)
    println("== operator on c and d" + c == d)
    println("=== operator on c and d" + c == d)


//G. Raw string : written in """__""" triple quotes
//take the shape of content written also
    var str4 = """hey
hello
hi"""
    println(str4)

/*H.escape sequence:
\” : for double quote
\r : for carriage return
\n : for newline
\’ : for single quote
\\ : for backslash
\t : for tab
\b : for backspace */
    val str5 = "\t World \n is \n amazing"
    println(str5)


//H. converting into string form characters
    println("converting into string form characters")
    println(
        listOf('a', 'b', 'c').joinToString(
            "",
            "(",
            ")"
        )
    ) // val separator:CharSequence="";val prefix:CharSequence="("; val postfix:CharSequence =")"})
//when only one arg is passed and rest default are taken
    println(
        listOf(
            'a',
            'b',
            'c'
        ).joinToString(postfix = ")")
    ) // val separator:CharSequence="";val prefix:CharSequence="("; val postfix:CharSequence =")"})

}