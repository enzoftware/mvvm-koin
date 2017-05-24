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


}