import javax.print.DocFlavor

/**
 * Created by enzoftware on 5/31/17.
 */
/**
 * Created by enzoftware on 5/26/17.
 */

class CarCons(){ //THIS A CONSTRUCTOR
    var Type:String?=null
    var Model:Int?=null
    var Price :Double ?=null
    var Miles :Int?=null
    var Owner :String?=null

    constructor(Type:String, Model:Int, Price:Double, Miles : Int, Owner:String):this (){
        println("Type : $Type , Model $Model , Owner : $Owner")
        println("Miles : $Miles , Price : $Price")
        this.Type = Type
        this.Model = Model
        this.Owner =Owner
        this.Miles = Miles
        this.Price = Price
    }

    //I CAN PUT MULTIPLE CONSTRUCTOR
    //BUT NO THE SAME CONSTRUCTOR

    fun GetType():String?{
        return this.Type
    }
}

fun main(args: Array<String>) {
    var myCar = CarCons("BMW",2017,1515.3,100,"Enzo Lizama")
    var yourCar = CarCons("Audi",2016,125515.3,10000,"Enzoftware")
    print(myCar.GetType())
}


