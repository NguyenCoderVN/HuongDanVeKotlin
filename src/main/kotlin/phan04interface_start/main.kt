package phan04interface_start

open class Animal {
    open val image = "image_animal"
    open val food = "food_animal"

    open fun eat() {
        println("The animal is eating")
    }

    open fun say() {
        println("The animal is saying")
    }

    fun sleep() {
        println("The animal is sleeping")
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

fun main() {

}