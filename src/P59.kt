/*In programming, sometimes there arises a need for a type
to have only certain values. To accomplish this, the concept
 of enumeration was introduced. Enumeration is a named list
  of constants.In Kotlin, like many other programming
  languages, an enum has its own specialized type,
  indicating that something has a number of possible values. Unlike Java enums, Kotlin enums are classes.

-->Some important points about enum classes in kotlin –

1.Enum constants aren’t just mere collections of constants-these have properties, methods etc.
2.Each of the enum constants acts as separate instances of
the class and separated by commas.
3.Enums increases readability of your code by assigning
pre-defined names to constants.
4.An instance of enum class cannot be created using
constructors.


//Enums are defined by using the enum keyword in front of class */
enum class Weeks {
    Sunday,
    Monday,

}

/*initializing enums –
In Kotlin also enums can have a constructor like Java enums.
 Since enum constants are instances of an Enum class, the
 constants can be initialized by passing specific values to
  the primary constructor. */
enum class Cards(val color: String) {
    Diamond("black"),
    Heart("red"),
}

/*Enums properties and methods –
As in Java and in other programming languages, Kotlin enum
classes has some inbuilt properties and functions which can
 be used by the programmer. Here’s a look at the major
 properties and methods.
-->Properties –
1.ordinal: This property stores the ordinal value of the
constant, which is usually a zero-based index.

2.name: This property stores the name of the constant.

-->Methods –
1.values: This method returns a list of all the constants
defined within the enum class.
2.valueOf: This methods returns the enum constant defined
in enum, matching the input string. If the constant, is
not present in the enum, then an IllegalArgumentException
is thrown */

fun main() {
    // A simple demonstration of properties and methods
    for (day in Weeks.values()) {
        println("${day.ordinal} = ${day.name}")
    }
    println("${Weeks.valueOf(" WEDNESDAY ")}")
}