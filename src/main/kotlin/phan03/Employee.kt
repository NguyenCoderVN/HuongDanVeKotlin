package phan03

class Employee(
    val name:String = "",
    val image:String = "",
    val address : Address
) {
    init {
        display ()
    }
    fun display () {
        println("name is $name")
        println("image is $image")
        println("address is ${address}")
    }
}