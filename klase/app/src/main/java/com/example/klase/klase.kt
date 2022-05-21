package com.example.klase

fun main (){
    myFunction(a:5)//funkcija
    var kh = Person("Kristijan","sdssasd")
    var john = Person()
    var johnPeterson = Person(lastName = "Peterson")
}

class Person constructor(firstName: String = "John", lastName: String = "Doe"){
    init{
        println("Initialized a new person object with " + "Firstname= $firstName and Lastname= $lastName")
    }

    fun myFunction(a:Int){ //parametar
         var a = 5

    }    }