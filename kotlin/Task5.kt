import java.util.Scanner

/* create a kotlin program : ----------------------------
 Priya goes to mall, and she purchased 6 products.
 -> 1 input should be at-least above 100 ✅
 -> and at-least 1 should be above 200; ✅
 -> sort the product price in form of ascending order; ✅
 -> If Priya purchase product above 100 then ₹10 discount; ✅
 -> If Priya purchase product above 200 then ₹20 discount; ✅
 -> If the total value goes above 500 then 20% discount; ✅
 -> Find the total and the average ✅ */

fun main(args: Array<String>) {

    // For taking input of price of product from user
    var sc = Scanner(System.`in`)
    var arr = FloatArray(6)
    for (i in 0..5) {
        print("Enter the price of product ${i + 1} : ")
        arr[i] = sc.nextFloat()
    }
    println()
    arr.sort() // Sorting the array

    // giving discount of ₹100 & ₹200 A/Q
    for (i in 0..5) {
        if (arr[i] in 100.0..199.99) {
            arr.set(i, arr[i] - 10)
        } else if (arr[i] >= 200) {
            arr[i] = arr[i] - 20
        }
    }
    println()
    println("After sorting and applying ₹10 & ₹20 Discount on eligible products :")
    for (i in 0..5) {
        println("Product ${i + 1} price : ${arr[i]}")
    }
    println()

    // Calculating total price ----
    var total: Float = 0f
    for (i in 0..5) {
        total += arr[i]
    }

    // If total > 500 then giving 20% Discount --
    var finalAmount: Float
    if (total > 500) {
        finalAmount = total * 0.80f
        println("Yayy!! you got 20% Discount 🤩🤩")
        println("Total price before discount : $total")
        println("Total price to pay after 20% Discount : ${finalAmount}")
    } else {
        println("Total price to pay : $total ")
    }

    // Average price of product ----
    var avg = total / 6
    println("The Average price of a product is : $avg ")

}