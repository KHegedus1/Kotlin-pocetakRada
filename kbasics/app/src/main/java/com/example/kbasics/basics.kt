package com.example.kbasics

fun main(){

    val myName = "Kristijan"
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

    var name = "Kristijan"
    if(name =="Kristijan"){
        println("welcome home,kristijan!")
    }else{
        println("who are you?")
    }
   var isRainy = true
    if(isRainy){
        println("It's rainy!")
    }
    var season = 3
    when(season){
        1-> println("it's spring")
        2-> println("it's summer")
        3-> println("it's autumn")
        4-> println("it's winter")
        else ->println("invalid season")
    }
    var month = 3
    when(month){
        in 3..5 ->println("spring")
        in 6..8 ->println("summer")
        in 9..11 ->println("autumn")
        12,1,2 ->println("winter")
        else ->println("invalid season")
    }

    val age = 17
    when(age){
        in 21..999  ->println("now you can drink in the USA")
        in 18..20   ->println("you may vote now!")
        16,17       ->println("you can drive now!")
        in 1..15    ->println("you are too young.")
        else        ->println("invalid age")
    }

    var x = 1
    while(x <= 10){
        println("$x")
        x++
    }
    println(" \n while loop is done")
    var x = 100
    while(x >= 0){
        println("$x")
        x -=2
    }
    println(" \n while loop is done")

    x=1
    do{
        print("$x")
        x++
    }while(x <=10)
    println(" \n  do while loop is done")

    for(num in 1..10){
        print("$num")

    }
    for( i in 1 until 10){
        print("$i ")

    }
    for( i in 1 until 20){
        if(i/2 ==5){
            continue
        }
        print("$i ")
    }
    print("done with the loop!")
    var result = addUp( a:5,b:13 )
    print("result is + $avg")


}

fun addUp(a: Int,b:Int) :Int {
    return a+b
}
fun avg(a: Double,b: Double) :Double {
    return a+b/2
}
//tipovi podataka se ne moraju specificirati

(