//Multilevel inheritance
open class animal {
    var age = 0
    var speak = "don't know"
    fun animalspeak() {
        ("that depend on specific animal")
    }
}

open class dog : animal() {
    var name = "baebbi"
    fun dogspeak() {
        println("dog bow bow and name is $name his age is $age")

    }
}

class puppy : dog() {
    var size = "too small"
    fun puppyeat() {
        println("he eats bones and his size is $size")

    }
}

fun main() {
    var oanimal = animal()
    oanimal.animalspeak()
//oanimal.puppyeat() CTE as puppyeat and dogspeak arein child class.
//oanimal.dogspeak()

    var odog = dog()
    odog.age = 89
    odog.animalspeak()
    odog.dogspeak()

    var opuppy = puppy()
    opuppy.puppyeat()
    opuppy.animalspeak()
    opuppy.dogspeak()
}