package com.example.klase

fun main (){
    var kh = Person("Kristijan","sdssasd")
    var john = Person()
}
class Person constructor(firstName: String = "John", lastName: String = "Doe"){
    init{
        println("Initialized a new person object with " + "Firstname= $firstName and Lastname= $lastName")
    }
}