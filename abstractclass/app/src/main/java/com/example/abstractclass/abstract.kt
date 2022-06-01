package com.example.abstractclass

abstract class Mammal(private val name: String, private val origin: String,
                      private val weight: Double){
    //abstract properties(must be overriden by subclasses)
    abstract var maxSpeed: Double
}