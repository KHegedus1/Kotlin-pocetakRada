package com.example.klase

fun main (){
    myFunction(a:5)//funkcija
    var kh = Person("Kristijan","sdssasd")
    kh.hobby="Skateboard"
    kh.age="25"
    kh.stateHobby()
    var john = Person()
    john.hobby="Videogames"
    var johnPeterson = Person(lastName = "Peterson")
}

class Person constructor(firstName: String = "John", lastName: String = "Doe"){
    //Member variables-svojstva
    var age  : Int? = null
    var hobby : String = "watching netflix"
    var firstName : String? = null
    init{
        this.firstName= firstName
        println("Initialized a new person object with " + "Firstname= $firstName and Lastname= $lastName")
    }
    //Member constructor
    constructor(firstName: String,lastName: String,age: Int)
            : this(firstName,lastName){
                this.age =  age
        println("Initialized a new person object with " + "Firstname= $firstName and Lastname= $lastName and age $age")

    }
    //Member functions-metode
    fun stateHobby(){
        println("$firstName\'s hobby is $hobby")
    }

}
    fun myFunction(a:Int){ //parametar
         var a = 5
        println("a is $a")

    }    //Shadowing-Kotlin dopusta deklariranje varijable istog imena kao sto ga ima i parametar.