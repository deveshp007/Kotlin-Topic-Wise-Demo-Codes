import java.util.Scanner

/* Create a Kotlin program to identify difference between 2 time periods ---
->  Format should be in 24 hr format
->  Take 2 input : 'time on Start Date' and 'time on End Date'
->  Calculate number of hours and days */


fun main(args:Array<String>){
    var sc = Scanner(System.`in`)
    print("Enter start date : ")
    var dd=sc.nextInt()
    print("Enter start month : ")
    var mm=sc.nextInt()
    print("Enter start year : ")
    var yy=sc.nextInt()

    print("Enter end date : ")
    var dde=sc.nextInt()
    print("Enter end month : ")
    var mme=sc.nextInt()
    print("Enter end year : ")
    var yye=sc.nextInt()

    println("Start Date : ${dd} / ${mm} / ${yy} ")
    println("End Date : ${dde} / ${mme} / ${yye} ")

    var diff=(yye-yy)*365 + (mme-mm)*30 + (dde-dd)
    println()
    println("Difference is : ${diff} Days")
    println("Number of hours are : ${diff*24}")


}