fun main(){
var myCar = Car()
    myCar.Owner
    println ("brand is: ${myCar.myBrand}")
    myCar.maxSpeed= 200 //Set
    println ("Max speed is is: ${myCar.maxSpeed}")
    println ("Model is ${myCar.myModel}")
}
class Car(){
    lateinit var Owner : string //lateinit-kasnije cemo initializirati var

    val myBrand: String = "BMW"
        //custom getter
    get() {
        return field.toLowerCase()
    }
    var maxSpeed : Int = 250
   // get() = field
    set(value){
        field= if(value>0)value else throw IllegalArgumentException("Maxspeed can't be less than 0:")
    }

    var myModel = "M5"
    private set//private-dostupan samo unutar ove klase
    init{
        this.myModel = "M3"
        Owner = "Frank"
    }
}