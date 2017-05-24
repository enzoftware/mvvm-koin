/**
 * Created by enzoftware on 5/24/17.
 */

fun main(args: Array<String>) {
    var map = HashMap<Int,String>()
    map.put(1,"enzoftware")
    map.put(2,"java")
    map.put(5,"FF")
    map.put(4,"hackspace")
    map.put(55,"kotlin")

    print(map.get(55))

    for(k in map.keys){
        println(map.get(k))
    }
}
