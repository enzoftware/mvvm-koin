/**
 * Created by enzoftware on 6/10/17.
 */

class Userthread():Thread(){

    var threadname:String ?= null

    constructor(ThreadName:String):this(){
        this.threadname = ThreadName
        println(this.threadname +" is started ")
    }

     override fun run(){
         //Write thread
         var count :Int = 0
         while(count < 10){
             println(" $threadname count is $count")
             count++
             try {
                 Thread.sleep(1000)
             }catch (ex:Exception){
                 println(ex.message)
             }

         }
     }
}

fun main(args: Array<String>) {
    var th = Userthread("thread1")
    th.start()

    var th2 = Userthread("thread2")
    th2.start()

    var th3 = Userthread("thread3")
    th3.start()
    th3.join()

    println(" thread is run ")
}