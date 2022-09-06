/*Enums as Anonymous Classes –
Enum constants also behaves as anonymous classes by
implementing their own functions along with overriding the
 abstract functions of the class. The most important thing
  is that each enum constant must be overridden.
 */
enum class Seasons(var weather: String) {
    Summer("hot") {
        // compile time error if not override the function foo()
        override fun foo() {
            println("Hot days of a year")
        }
    },
    Winter("cold") {
        override fun foo() {
            println("Cold days of a year")
        }
    },
    Rainy("moderate") {
        override fun foo() {
            println("Rainy days of a year")
        }
    };

    abstract fun foo()
}

// main function
fun main(args: Array<String>) {
    // calling foo() function override be Summer constant
    Seasons.Summer.foo()
}