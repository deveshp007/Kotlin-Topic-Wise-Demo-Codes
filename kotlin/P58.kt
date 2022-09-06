abstract class Calculator {
    abstract fun cal(x: Int, y: Int): Int
}

// addition of two numbers
class Add : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x + y
    }
}

// subtraction of two numbers
class Sub : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x - y
    }
}

// multiplication of two numbers
class Mul : Calculator() {
    override fun cal(x: Int, y: Int): Int {
        return x * y
    }
}

fun main(args: Array<String>) {
    var add: Calculator = Add()
    var x1 = add.cal(4, 6)
    println("Addition of two numbers $x1")
    var sub: Calculator = Sub()
    var x2 = sub.cal(10, 6)
    println("Subtraction of two numbers $x2")
    var mul: Calculator = Mul()
    var x3 = mul.cal(20, 6)
    println("Multiplication of two numbers $x3")
}