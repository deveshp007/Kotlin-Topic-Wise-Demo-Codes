/*we have two keywords to forcefully exit from the loop i.e.
1.break
2.continue

they are used even to exit from a block in nested loops
called labelled break and continue.*/
fun main(args: Array<String>) {
//A. unlabelled break : to exit from the current loop
    println("inside unlabelled break")
    for (i in 1..5) {
        if (i == 3) {
            println("now i will forcefully exit")
            break;
        }
        println("in for loop with break $i ")
    }
    println()

//B. unlabeled continue : to skip the current iteration
    println("inside unlabelled continue")
    var arr = arrayOf(1, 2, 3, 4, 5, 6)
    for (a in arr) {
        if (a == 3) {
            println("now i will skip this iteration")
            continue
        }
        println("in for loop with continue $a")
    }
    println()


/*C.labelled break : mostly used in nested loops when
you want to exit from any of the nested loops.It
should be labelled with a name .Syntax: label_name@
and when you want to break/continue from the
particular label there should not be any blank space
between break keyword and label name. Syntax:
break@label_name*/
    println("inside labelled break")
    label1@ for (i in 1..3) {
        label2@ for (j in 1..3) {
            label3@ for (k in 1..3) {
                if (i == 2) {
                    break@label2
                }
                println("in labeled break three nested loops with valus {$i} {$j} and {$k}")
            }
        }
    };println() //multiple statements separated by semi colon


/*D.labelled continue : mostly used in nested loops when
you want to exit from the current iteration from any
of the nested loops.It should be labelled with a name
.Syntax: label_name@ and when you want to break/continue from the
particular label there should not be any blank space
between break keyword and label name. Syntax:
break@label_name*/
    println("inside labelled continue")
    label1@ for (i in 1..3) {
        label2@ for (j in 1..3) {
            label3@ for (k in 1..3) {
                if (i == 2) {
                    continue@label2
                }
                println("in labeled continue three nested loops with valus {$i} {$j} and {$k}")
            }
        }
    }
}