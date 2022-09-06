// Code for sorting and Iteration of unsorted Array of Int,Char & String data type ----
fun main(args:Array<String>) {

    var arr1 = arrayOf(4,3,2,1,5)
    var arr2 = arrayOf('D','A','C','B','E','Z','X','Q','L')
    var arr3 = arrayOf("One","Two","Three","Four","Five")

    arr1.sort()
    arr1.reverse()
    for(i in arr1){
        print(" "+ i)
    }
    println()

    arr2.sort()
    arr2.reverse()
    for(i in arr2){
        print(" "+ i)
    }
    println()

    arr3.sort()
    arr3.reverse()
    for(i in arr3){
        print(" "+ i)
    }

}


