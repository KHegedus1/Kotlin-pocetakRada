package com.example.interfaces

open class Vehicle{ //klasa mora biti otvorena da bi se dogodilo naslijedjivanje
    //properties
    //methods
}

class Car : Vehicle(){

}
class  ElectricCar: Car(){
}

//Base class-super class
    open class Car(val name: String,val brand: String){
    open var range: Double = 0.0
    fun extendRange(amount: Double){
        if (amount  > 0)
            range += amount
    }
    class ElectricCar(name : String, brand : String, batteryLife : Double)
        : Car (name,brand){
    override var range = batteryLife * 6
    override fun drive (distance: Double){
        println(" Drove for $distance KM"
    }
    }
}

