package phan04.abstract_finish

abstract class Animal {
    abstract val image : String
    abstract val food : String
    private val habitat = "habitat_animal"

    abstract fun eat()

    abstract fun say()

    fun sleep() {
        println("The animal is sleeping")
    }

    fun habitat() {
        println("The animal $habitat")
    }
}

open class Dog : Animal() {
    override var image: String = "Dog_image"
    override val food: String = "meat"

    final override fun eat() {
        println("The dog is eating $food")
    }

    override fun say() {
        println("The dog is saying Woo Woo")
    }
}

class BabyDog : Dog() {
    override var image: String = "BabyDog_image"
//    override fun eat() {
//        println("The dog is eating baby $food")
//    }
}

fun main() {
//    println("-----Animal-----")
//    val animal = Animal()
//    println("The Animal image is ${animal.image}")
//    println("The Animal food is ${animal.food}")
//    //println("The Animal habitat is ${animal.habitat}")
//    animal.eat()
//    animal.say()
//    animal.sleep()
//    animal.habitat()

    println("-----Dog-----")
    val myDog = Dog()
    println("The Animal image is ${myDog.image}")
    println("The Animal food is ${myDog.food}")
    //println("The Animal habitat is ${animal.habitat}")
    myDog.eat()
    myDog.say()
    myDog.sleep()
    myDog.habitat()

    println("-----BabyDog-----")
    val babyDog = BabyDog()
    println("The Animal image is ${babyDog.image}")
    println("The Animal food is ${babyDog.food}")
    //println("The Animal habitat is ${animal.habitat}")
    babyDog.eat()
    babyDog.say()
    babyDog.sleep()
    babyDog.habitat()

}