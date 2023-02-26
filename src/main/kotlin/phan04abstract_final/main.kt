package phan04abstract_start

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
        println("The animal habitat")
    }
}

open class Dog : Animal() {
    override var image: String = "Dog_image"
    override val food: String = "meat"

    override fun eat() {
        println("The dog is eating $food")
    }

    override fun say() {
        println("The dog is saying Woo Woo")
    }
}

class BabyDog : Dog() {
    override var image: String = "BabyDog_image"
        override fun eat() {
        println("The dog is eating baby $food")
    }
}

fun main(args: Array<String>) {
    println("-------Animal----------")
    var animal = Animal()
    println("Animal image is ${animal.image}")
    println("Animal food is ${animal.food}")
    //println("Animal food is ${animal.habitat}")
    animal.eat()
    animal.say()
    animal.sleep()
    animal.habitat()

    println("-------Dog----------")
    var myDog = Dog()
    println("MyDog image is ${myDog.image}")
    println("MyDog food is ${myDog.food}")
    myDog.eat()
    myDog.say()
    myDog.sleep()

    println("-------BabyDog----------")
    var myBabyDog = BabyDog()
    println("MyBabyDog image is ${myBabyDog.image}")
    println("MyBabyDog food is ${myBabyDog.food}")
    myBabyDog.eat()
    myBabyDog.say()
    myBabyDog.sleep()
}