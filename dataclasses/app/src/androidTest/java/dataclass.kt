data class  User(val id: Long, val name: String)

fun main(){
    val user1= User(id: 1, name:"Kristijan")
    val name = user1.name
    println(name)
    user1.id = 2//Radilo bi zato sto je val
    user1.name= "Kriistijan"
    val user2= User(id: 2, name:"Cristian")
    println(user1 == user2)
    println("User details: $user1")
    val updatedUser = user1.copy(name = "Kristijan H")
    println(user1)
    println(updatedUser)
    println(updatedUser.component1()) // prikazuje 1
    println(updatedUser.component1()) // prikazuje Kristijan H
    val ( Id,name) = updatedUser
    println("id=$id,name=$name")
}