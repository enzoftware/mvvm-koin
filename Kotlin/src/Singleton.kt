/**
 * Created by enzoftware on 6/6/17.
 */

class Singleton{
    var name :String ?= null
    private constructor(){
        println("Instance created")
    }

    companion object{
        val instance :Singleton by lazy { Singleton() }
    }
}

//Singleton for android design pattern


fun main(args: Array<String>) {
    var s1 = Singleton.instance
    s1.name = "huseein"
    println(s1.name)

    var s2 = Singleton.instance
    println(s2.name)


    var s3 = Singleton.instance
    println(s3.name)
}