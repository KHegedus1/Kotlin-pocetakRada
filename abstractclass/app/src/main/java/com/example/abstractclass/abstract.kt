package com.example.abstractclass

abstract class Mammal(private val name: String, private val origin: String,
                      private val weight: Double){
    //Abstract properties(must be overriden by subclasses)
    abstract var maxSpeed: Double
    //Abstract methods(must be implemented by subclasses)
    abstract fun run()
    abstract fun run()

}
//concrete(non abstract) method
fun displayDetails(){
    println("Name: $name, Origin: $origin,Weight: $weight," + "Max speed: $maxSpeed")
}
}