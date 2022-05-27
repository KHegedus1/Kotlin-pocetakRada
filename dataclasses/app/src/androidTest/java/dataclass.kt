data class  User(val id: Long, val name: String)

fun main(){
    val user1= User(id: 1, name:"Kristijan")
    val name = user1.name
    println(name)
    user1.id = 2//Radilo bi zato sto je val
}