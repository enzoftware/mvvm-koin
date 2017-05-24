/**
 * Created by enzoftware on 5/24/17.
 */
fun main(args: Array<String>) {
    var map = hashMapOf(1 to "enzo" , 2 to "kotlin" )
    map.put(3,"java")
    println(map.get(3))

    var array = arrayOf(1,10,12,36)
    println(array.get(1))

    var l = listOf(265,4,3,53,5) //INMUTABLE
    /// mutableListOf<>() ==> THE DATA COULD BE CHANGED
    for (it in l){
        println(it)
    }
}