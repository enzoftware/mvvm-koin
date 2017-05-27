import sun.awt.UNIXToolkit

/**
 * Created by enzoftware on 5/26/17.
 */

fun sum(n1:Double , n2:Double):Double{
    return n1+n2
}

fun sum(n1:Double , n2:Double , n3:Double):Double{
    return n1+n2+n3
}

fun sum(n1:Double , n2:Double , n3:Double , n4:Double):Double{
    return n1+n2+n3+n4
}

//A FUNCTION COULD BE OVERLOADED WITH MORE PARAMETERS

fun show(name:String):Unit{
    println("name $name")
}

fun show(name:Int):Unit{
    println("number $name")
}

//FUNCS WITH SAME NAME BUT DUFERENT TYPE OF PARAMETERS BUT NO OF
// NUMBERS OF

fun main(args: Array<String>) {
    println(sum(15.0,23.6,665.9))
    println(show("Enzo"))
    println(show(256))
}


