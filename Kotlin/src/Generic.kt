/**
 * Created by enzoftware on 5/31/17.
 */


class UserAdmins<T>( credit:T){
    init {
        println("$credit")
    }
}

fun <T> display(process:T){
    println(process)
}

fun main(args: Array<String>) {
    var userAdmin = UserAdmins<String>("hello")
    var userAdmin1 = UserAdmins<Int>(126)
    display<Int>(62)
}