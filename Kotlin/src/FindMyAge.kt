import java.util.*

/**
 * Created by enzoftware on 5/24/17.
 */

fun main(args:Array<String>){
    var DateOfBirth:Int = readLine()!!.toInt()
    var year = Calendar.getInstance().get(Calendar.YEAR)
    var age = year - DateOfBirth
    println(" Your age is $age")
}