import java.io.FileWriter

/**
 * Created by enzoftware on 6/10/17.
 */

fun writeToFile(str:String){
    try {
        var fileOutput = FileWriter("test.txt",true)
        fileOutput.write(str)
        fileOutput.close()
    }catch (ex:Exception){
        println(ex.message)
    }

}

fun main(args: Array<String>) {
    writeToFile("Hola papu como estas \n")
}