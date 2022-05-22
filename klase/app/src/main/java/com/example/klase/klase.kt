package com.example.klase

fun main (){
    myFunction(a:5)//funkcija
    var kh = Person("Kristijan","sdssasd")
    kh.hobby="Skateboard"
    kh.stateHobby()
    var john = Person()
    john.hobby="Videogames"
    var johnPeterson = Person(lastName = "Peterson")
}

class Person constructor(firstName: String = "John", lastName: String = "Doe"){
    //Member variables-svojstva
    var age  : Int? = null
    var hobby : String = "watching netflix"
    init{
        println("Initialized a new person object with " + "Firstname= $firstName and Lastname= $lastName")
    }
    //Member functions-metode
    fun stateHobby(){
        println("My hobby is $hobby")
    }

}
    fun myFunction(a:Int){ //parametar
         var a = 5
        println("a is $a")

    }    //Shadowing-Kotlin dopusta deklariranje varijable istog imena kao sto ga ima i parametar.