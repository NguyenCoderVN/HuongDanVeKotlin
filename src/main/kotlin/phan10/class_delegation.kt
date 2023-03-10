package phan10

// Class Delegation

interface Cat {
    var name : String
    var weight : Int
    fun eat()
}

class BaseCat01 : Cat {
    override var name: String = "Bull01"
    override var weight: Int = 20

    override fun eat() {
        println("Cat is eating fish")
    }
}

class BaseCat02(override var name: String, override var weight: Int) : Cat {

    override fun eat() {
        println("Cat is eating fish")
    }
}

class ImplCat01 : Cat by BaseCat01() {
    override fun eat() {
        println("Cat is eating meat")
    }
}

class ImplCat02 : Cat by BaseCat02("Bull02", 30)

class ImplCat03(cat : Cat) : Cat by cat

fun main() {
    val cat01 = ImplCat01()
    println("Name is ${cat01.name}")
    println("Weight is ${cat01.weight}")
    cat01.eat()

    println("------")
    val cat02 = ImplCat02()
    println("Name is ${cat02.name}")
    println("Weight is ${cat02.weight}")
    cat02.eat()

    println("------")
    val cat03 = ImplCat03(BaseCat01())
    println("Name is ${cat03.name}")
    println("Weight is ${cat03.weight}")
    cat03.eat()

    println("------")
    val cat04 = ImplCat03(BaseCat02("Bull04", 18))
    println("Name is ${cat04.name}")
    println("Weight is ${cat04.weight}")
    cat04.eat()

}

