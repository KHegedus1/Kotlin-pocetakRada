package com.example.klase

fun main (){
    var kh = Person("Kristijan","sdssasd")
}
class Person constructor(firstName: String, lastName: String){
    init{
        println("Initialized a new person object with " + "Firstname= $firstName and Lastname= $lastName")
    }
}