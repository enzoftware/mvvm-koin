/**
 * Created by enzoftware on 6/6/17.
 */

class Autor{
    private val name : String ?= null
    class Nested{ // Nested class is a class inside another class
        fun display(){
            println("hello from nested class")
        }
    }
}


fun main(args: Array<String>) {
    var autor = Autor()
    var bested = Autor.Nested();
    bested.display()
}