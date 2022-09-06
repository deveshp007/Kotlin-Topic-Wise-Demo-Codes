//Overriding Member functions and properties

open class Emp
{
    open var roll=90
    open var name="riya"
}
class peon:Emp()
{
    override var roll=89
    override var name="priya"
}
fun main()
{
    var obj=peon()
    println("roll is ${obj.roll} and name is ${obj.name}")
}
