package com.example.kbasics

fun main(){
    vaL myName = "Kristijan"
    myName ="Kristijan"
            print("pozzdrav " + myName)

    var result = 5+3
    result /=2
            print(result)

    var result:  = 5+3
    result  = 15%2
            print(result)

    val a=5
    val b=3
    result = a/b
            print(result)
    var resultDouble : Double
    val a=5.0
    val b=3
    resultDouble =  a/b
            print(resultDouble)
    val  isEqual = 5==5 //provjerava jesu li vrijednosti s obje strane jednake
    println("isEqual is" $isEqual)
    val  isNotEqual = 5!=5 //provjerava jesu li vrijednosti s obje strane nejednake
    println("isNotEqual is" $isNotEqual)

    println("is5greater3 ${5>3}")
    println("is-5greater3 ${-5>3}")
    println("is5LowerEqual3 ${5<=3}")

    var myNum = 5
    myNum += 3
    println("myNum is $myNum")
    myNum *= 4
    println("myNum is $myNum")

    myNum ++
    println("myNum is $myNum")
    println("myNum is ${myNum++}")
    println("myNum is ${++myNum}")
    println("myNum is ${--myNum}")

    var heightPerson1 = 170
    var heightPerson2 = 189

    if(heightPerson1 > heightPerson2){
        println("Use raw force")
    }else if(heightPerson1 == heightPerson2){
        println("Use power")
    }else{
        println("Use technique")
    }

    val age = 17
    if(age >=21){
        println("now you can drink in the USA")
    }else if(age >=18){
        println("you may vote now!")
    }else if(age >=16){
        println("you can drive now!")
    }else(age <=15){
        println("you are too young.")
    }

}
    //tipovi podataka se ne moraju specificirati

