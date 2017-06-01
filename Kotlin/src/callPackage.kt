import com.example.enzoftware.MyCar

fun main(args: Array<String>) {
    var myCar = CarCons("BMW",2017,1515.3,100,"Enzo Lizama")
    var yourCar = CarCons("Audi",2016,125515.3,10000,"Enzoftware")
    print(myCar.GetType())
    var mycar = MyCar()
    mycar.showInfo()
}
