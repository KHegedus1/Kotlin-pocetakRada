fun main(){
var myCar = Car()
    myCar.Owner
    println ("brand is: ${myCar.myBrand}")
}
class Car(){
    lateinit var Owner : string //lateinit-kasnije cemo initializirati var

    val myBrand: String = "BMW"
        //custom getter  
    get() {
        return field.toLowerCase()
    }
    init{
        Owner = "Frank"
    }
}