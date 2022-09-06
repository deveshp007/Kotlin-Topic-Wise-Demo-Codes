// Create pyramid and hollow pyramid patterns and print CSE224 or Name ------

fun main(args: Array<String>) {

    var k = 0

    for (i in 1..6) {
        for (space in 1..6 - i) {
            print("  ")
        }

        while (k != 2 * i - 1) {
            print("* ")
            ++k
        }

        println()
        k = 0
    }

    println()
    println()

    val rows = 7

    for (i in 1..rows) {

        if (i == 1 || i == rows) {
            for (r in 1..3) {
                for (space in 1..5) {
                    print("* ")

                }
                for (space in 1..4) {
                    print(" ")
                }
            }
            println()
        }
        if (i > 1 && i < 4 && i != 4) {
            for (r in 1..3) {

                print("* ")


                for (space in 1..12) {
                    print(" ")
                }
            }
            println()

        }
        if (i == 4) {
            print("* ")
            for (space in 1..12)
                print(" ")
            for (r in 1..2) {
                for (space in 1..5) {
                    print("* ")

                }
                for (space in 1..4) {
                    print(" ")
                }
            }
            println()

        }
        if (i > 4 && i < rows) {
            print("* ")
            for (spaces in 1..20)
                print(" ")
            print("* ")
            for (spaces in 1..4)
                print(" ")
            print("* ")



            println()
        }
    }
}