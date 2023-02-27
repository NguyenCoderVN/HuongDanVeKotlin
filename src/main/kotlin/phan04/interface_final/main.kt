package phan04.interface_final

import phan04.abstract_finish.Dog

interface SayAble {
    val food : String
    fun say () {
        println("The animal is saying")
    }
}

open class Animal : SayAble {
    open val image = "image_animal"
    override val food = "food_animal"

    open fun eat() {
        println("The animal is eating")
    }

//    override fun say() {
//        println("The animal is saying")
//    }

    fun sleep() {
        println("The animal is sleeping")
    }

}

class Dog : Animal() {
    override var image: String = "Dog_image"
    override val food: String = "meat"

    final override fun eat() {
        println("The dog is eating $food")
    }

    override fun say() {
        println("The dog is saying Woo Woo")
    }
}

fun main() {

    println("-----Dog-----")
    val myDog = Dog()
    println("The Animal image is ${myDog.image}")
    println("The Animal food is ${myDog.food}")
    //println("The Animal habitat is ${animal.habitat}")
    myDog.eat()
    myDog.say()
    myDog.sleep()
    myDog.habitat()
}