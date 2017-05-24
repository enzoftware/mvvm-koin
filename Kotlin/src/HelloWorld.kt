import com.sun.org.apache.xpath.internal.operations.Bool
import org.omg.CORBA.INTF_REPOS

/**
 * Created by enzoftware on 5/23/17.
 */

fun main(args:Array<String>){
    var age:Int = 18
    var name:String = "enzoftware" // DEFINE A DATA TYPE FOR THE VARIABLE
    var carrer:String? // THAT CAN BE NULL
    carrer= "Software Engineering"
    val pi:Double = 3.14159 // DOUBLE DATA TYPE
    println("Hello $name you have $age years and you study $carrer")

    //------------------------    VAR vs VAL      -------------------------------

    val secondName:String = "Lizama" //ITS NOT MUTABLE ( NEVER CHANGE )

    // =======================    readLine      ===============================
     var chapa = readLine()
    println("Tu chapa es $chapa")
    var money = readLine()!!.toDouble() // CONVIERTE A DOUBLE SE HACE
                                        // LO MISMO PARA INT , ETC
                                        // '!!' => PARA NON-NULL STR
    println("Y tienes $money")

    //      CONVERT BETWEEN DATA TYPES

    var n1:Int = 20
    var n2:Int?
    var n2Str:String = "12"
    n2 = n2Str.toInt()
    println("$n1 y $n2")

    //.................LOGIC STATEMENTS ..........................
    if(n1 < 15){
        print("n1 is less than 15")
    }else if(n1 >15 || n1 < 25){
        println("xdxdxdxd")
    }else{
        print("c mamut")
    }


    //  when statement

    var valiu:Int = 10

    when(valiu){
        1,2 -> print("is a") //MULTIPLE CHOISE VALUE SWITCHING
        !in 30..50-> print("is c")  // OUT OF THAT RANGE
        in 2..10 -> print("is b") // IN THAT RANGE
        else->{
            println("is unexpected") // IF ANYONE CASE IS TRUE
        }
    }

    //ALWAYS GET THE FIRST CONDITION THE RETURN TRUE

    var x1:Int = 15
    var x2:Int = 156
    var max:Int = if(x1>x2) x1 else x2
    println("max is $max")


    var yiars:Int = 15
    var isYoung = when(yiars){
        65->true
        else->false
    }

}