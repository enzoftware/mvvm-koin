/**
 * Created by enzoftware on 5/31/17.
 */
//INTERFACE A LOT IN ANDROID

interface op{
    fun sum(n1:Int, n2:Int)
    fun div(n1:Int, n2:Int)
}


class UserOP:op{
    override fun sum(n1: Int, n2: Int) {
        println ("sum : " + n1+n2)
    }

    override fun div(n1: Int, n2: Int) {
        println( "div : " + n1/n2 )
    }

}


class AdminOP:op{
    override fun sum(n1: Int, n2: Int) {
        println ("sum : " + n1+n2)
    }

    override fun div(n1: Int, n2: Int) {
        println( "div : " + n1/n2)
    }

}

abstract class ManagerOP:op{

}

fun main(args: Array<String>) {
    //TODO:
    var admin = AdminOP();
    println(admin.div(51465,54))
}