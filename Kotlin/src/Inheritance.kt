/**
 * Created by enzoftware on 5/31/17.
 */


open class Operations(){ // normally understand a class like final
    protected var ProcessName:String? = "Enzo"

    fun  sum(n1:Int, n2: Int) = n1+n2

    fun div(n1:Int , n2 : Int ) = n1/n2
}

class MultiOps() : Operations(){

    fun  res(n1:Int, n2: Int) = n1-n2

    fun mult(n1:Int , n2 : Int ) = n1*n2

    fun getName(){
        super.ProcessName
    }
}

fun main(args: Array<String>) {
    var ops = MultiOps()
    var sum = ops.sum(15,45)
    var div = ops.div(48,8)
    println(" sum = $sum , div = $div")
    print(" nombre " + ops.getName())
}