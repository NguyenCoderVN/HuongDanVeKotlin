package phan02

fun main(args: Array<String>) {
    var myDog = Dog("Lucky", 15, "Yellow")
    println("myDog have name ${myDog.name} ${myDog.weight} ${myDog.color}")
    myDog.weight = 20
    println("myDog have name ${myDog.name} ${myDog.weight} ${myDog.color}")

    var myDogs = arrayOf( Dog("Lucky", 15, "Yellow"),  Dog("Bob", 20, "Brown") )
    println("myDog2 have name ${myDogs[1].name} ${myDogs[1].weight} ${myDogs[1].color}")

    var myDog1 = Dog("Lucky", color = "Black")
    println("myDog have name ${myDog1.name} ${myDog1.weight} ${myDog1.color}")

    var myDog2 = Dog01("Lucky", 15, "Yellow")
    println("myDog have name ${myDog2.name} ${myDog2.weight} ${myDog2.color}")

    var myDog3 = Dog02("Lucky", 15, "Yellow")
    println("myDog3 have name ${myDog3.name} ${myDog3.weight} ${myDog3.color}")

    var myDog4 = Dog02("Lucky", 40)
    println("myDog4 have name ${myDog4.name} ${myDog4.weight} ${myDog4.color}")

    var myDog5 = Dog03("Lucky", 40, "Orange")
    println("myDog5 have name ${myDog5.name} ${myDog5.weight} ${myDog5.color}")

}