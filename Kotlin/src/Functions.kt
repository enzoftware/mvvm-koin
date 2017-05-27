
fun sum( x:Int , y:Int):Int{ //RETURN VALUE
    return x+y
}

fun display(x:Int = 100):Unit{ //like void
    println(x)
}

fun main(args: Array<String>) {
    var resultado = sum(9,5)
    println(resultado)
    display()
}


