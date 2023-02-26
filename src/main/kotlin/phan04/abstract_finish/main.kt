package phan04.abstract_finish

open class Animal {
    open val image = "image_animal"
    open val food = "food_animal"
    private val habitat = "habitat_animal"

    open fun eat() {
        println("The animal is eating")
    }

    open fun say() {
        println("The animal is saying")
    }

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

}