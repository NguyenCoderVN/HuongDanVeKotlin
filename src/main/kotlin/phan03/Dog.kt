package phan03

open class Dog : Animal() {
    override var image: String = "Dog_image"
    override val food: String = "meat"
    override val habitat: String = "home"

    override fun eat() {
        println("The dog is eating $food")
    }

    override fun say() {
        println("The dog is saying Woo Woo")
    }
}