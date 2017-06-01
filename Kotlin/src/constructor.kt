import javax.print.DocFlavor

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