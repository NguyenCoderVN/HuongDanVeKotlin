package phan03

class BabyDog : Dog() {
    override var image: String = "BabyDog_image"
    override val food: String = "Babymeat"
    override val habitat: String = "Babyhome"

    override fun eat() {
        println("The dog is eating $food")
    }

    override fun say() {
        println("The dog is saying Woo Woo")
    }
}