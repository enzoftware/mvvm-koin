/**
 * Created by enzoftware on 6/10/17.
 */


fun main(args: Array<String>) {
    try{
        var number:Int = readLine()!!.toInt()
        var div = 100/number
        println(" div : $div")
    }catch (ex:Exception){
        println(ex.message)
    }
    print("app success")

}

