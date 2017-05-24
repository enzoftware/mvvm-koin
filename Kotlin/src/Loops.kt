/**
 * Created by enzoftware on 5/24/17.
 */

fun main(args:Array<String>){
    lup@for(item in 1 ..15){ //For loop
        if(item == 4)  continue
        if(item == 8) break
        for(it in 1 ..5){
            println(it)
            if(it ==2) break@lup
        }

    }

    println("loop done")

}