/**
 * Created by enzoftware on 5/26/17.
 */

class Car(Type:String, Model:Int, Price:Double, Miles : Int, Owner:String){
    var Type:String?=null
    init {
        println("Type : $Type , Model $Model , Owner : $Owner")
        println("Miles : $Miles , Price : $Price")
        this.Type = Type
    }

    fun GetType():String?{
         return this.Type
    }
}

fun main(args: Array<String>) {
    var myCar = Car("BMW",2017,1515.3,100,"Enzo Lizama")
    var yourCar = Car("Audi",2016,125515.3,10000,"Enzoftware")
    print(myCar.GetType())
}


