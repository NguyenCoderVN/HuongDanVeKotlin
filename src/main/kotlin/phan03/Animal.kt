package phan03

open class Animal {
    open val image = "image_animal"
    open val food = "food_animal"
    open val habitat = "habitat_animal"

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