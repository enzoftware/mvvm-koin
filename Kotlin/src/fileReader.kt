import java.io.FileReader

/**
 * Created by enzoftware on 6/10/17.
 */

fun ReadFile(){
    try {
        var fi = FileReader("test.txt")
        var c:Int ?
        do {
            c = fi.read()
            print(c.toChar())
        }while ( c!= -1)



    }catch (ex:Exception){
        println(ex.message)
    }
}

fun main(args: Array<String>) {
    ReadFile()

}
