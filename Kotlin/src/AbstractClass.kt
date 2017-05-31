/**
 * Created by enzoftware on 5/31/17.
 */

abstract class CreditCard(){
    fun CreditID():String = "rftgy346gey"
    abstract fun newCard()
}

class UserInfo():CreditCard(){
    fun getInfo():String{
        return CreditID()
    }

    override fun newCard() {
        println("new card created")
    }
}

enum class Directions { NORTH , SOUTH , EAST ,WEST}

fun main(args: Array<String>) {
    //var credit = CreditCard()

    //println(credit.CreditID())

    var userdir = Directions.SOUTH

    if(userdir == Directions.SOUTH) print("we go to south")
    else print("idk where you go")

    var  u = UserInfo();
    println(u.getInfo())
    println(u.newCard())

    //THIS METHOD CAN BE ABSTRACT FOR AN IMPLEMENTATION
}