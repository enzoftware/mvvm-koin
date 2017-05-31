/**
 * Created by enzoftware on 5/31/17.
 */


open class Operations(){ // normally understand a class like final
    protected var ProcessName:String? = "Enzo"

    open fun  sum(n1:Int, n2: Int):Int = n1+n2

    fun div(n1:Int , n2 : Int ) = n1/n2
}

class MultiOps() : Operations(){

    //SUPER CAN BE CONSTRUCTOR FOR THE INHTERANCE CLASS
    //SUPER TO CALL ANOTHER CLASS INTO .THIS

    override fun  sum(n1:Int, n2: Int) = n1+n2*5
    var div = super.div(465,5)

    fun  res(n1:Int, n2: Int) = n1-n2

    fun mult(n1:Int , n2 : Int ) = n1*n2

    fun getName(){
        super.ProcessName
    }
}

fun main(args: Array<String>) {
    var ops = MultiOps()  // as Operations ; for cast
    var sum = ops.sum(15,45)
    var div = ops.div(48,8)
    println(" sum = $sum , div = $div")
    print(" nombre " + ops.getName())
}