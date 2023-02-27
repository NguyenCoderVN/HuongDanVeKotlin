package phan04.data_class

// Demo cho lớp Any
class Cat(val name : String) {
    override fun toString(): String {
        return "Cat(name='$name')"
    }
}

data class Dog (val name : String, val color: String) {
    var weight : Int = 10
}


fun main() {
    // Demo cho lớp Any
    println("---------Demo cho lớp Any---------")
    val cat1 = Cat("Meo01")
    val cat2 = Cat("Meo01")
    if (cat1.equals(cat2)) {
        println("Cat1 equal Cat2")
        println("Cat1 hashCode ${cat1.hashCode()}")
        println("Cat2 hashCode ${cat2.hashCode()}")
    } else {
        println("Cat1 not equal Cat2")
        println("Cat1 hashCode ${cat1.hashCode()}")
        println("Cat2 hashCode ${cat2.hashCode()}")
    }
    val cat3 = cat1
    if (cat1.equals(cat3)) {
        println("Cat1 equal Cat3")
        println("Cat1 hashCode ${cat1.hashCode()}")
        println("Cat3 hashCode ${cat3.hashCode()}")
    } else {
        println("Cat1 not equal Cat3")
        println("Cat1 hashCode ${cat1.hashCode()}")
        println("Cat3 hashCode ${cat3.hashCode()}")
    }
    println("toString of cat1 ${cat1.toString()}")

    println("---------Demo cho Data class---------")
    val dog1 = Dog("Dog01", "Yellow")
    dog1.weight = 12
    val dog2 = Dog("Dog01", "Yellow")
    dog2.weight = 15
    if (dog1.equals(dog2)) {
        println("dog1 equal dog2")
        println("dog1 hashCode ${dog1.hashCode()}")
        println("dog2 hashCode ${dog2.hashCode()}")
    } else {
        println("dog1 not equal dog2")
        println("dog1 hashCode ${dog1.hashCode()}")
        println("dog2 hashCode ${dog2.hashCode()}")
    }
    println("toString of dog1 ${dog1.toString()}")
    val dog3 = dog1.copy(color = "Brown")
    println("toString of dog3 ${dog3.toString()}")

//    val nameDog3 = dog3.name
//    val colorDog3 = dog3.color
//    val weightDog3 = dog3.weight

//    val nameDog3 = dog3.component1()
//    val colorDog3 = dog3.component2()

    val (nameDog3,colorDog3 ) = dog3
    val weightDog3 = dog3.weight
    println("dog3 $nameDog3 $colorDog3 $weightDog3")


}