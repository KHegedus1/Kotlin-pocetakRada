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
vopen class Car(val name: String,val brand: String){
    open var range: Double = 0.0
    fun extendRange(amount: Double){
        if (amount  > 0)
            range += amount
    }
}

