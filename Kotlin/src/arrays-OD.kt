/**
 * Created by enzoftware on 5/24/17.
 */


fun main(args:Array<String>){


    var arrayInt = Array<Int>(5){0}
    arrayInt[3] = 16
    println("array in 3 is "+arrayInt[3])

    for(item in arrayInt){ //BY OBJECT
        println(item)
    }

    for(item in 0..4){ //BY INDEX
        println(arrayInt[item])
    }

    var al = ArrayList<String>() //LINKED LIST INTERNALLY
    al.add("enzo")
    al.add("kotlin")
    al.add("android") //ADDING
    al.add("google")
    al.add("amazon")

    println("first : "+al.get(0)) //GETTING
    al.set(1,"KOTLIN") //SETTING
    for(element in al){
        println(element)
    }

    //SEARCH

    var ss:Int = if(al.contains("enzo")) 10 else 15
    println(ss)

}