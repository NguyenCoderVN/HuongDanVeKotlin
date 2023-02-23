package phan03

fun main() {
    var myDog = Dog()
    myDog.image = "New Image"
    println("myDog image ${myDog.image}")
    println("myDog food ${myDog.food}")
    println("myDog habitat ${myDog.habitat}")
    myDog.eat()
    myDog.say()
    myDog.sleep()

    println("-------------")

    var myBabyDog = BabyDog()
    println("myBabyDog image ${myBabyDog.image}")
    println("myBabyDog food ${myBabyDog.food}")
    println("myBabyDog habitat ${myBabyDog.habitat}")
    myBabyDog.eat()
    myBabyDog.say()
    myBabyDog.sleep()

    println("-------------")

    var myCat = Cat()
    println("myCat image ${myCat.image}")
    println("myCat food ${myCat.food}")
    println("myCat habitat ${myCat.habitat}")
    myCat.eat()
    myCat.say()
    myCat.sleep()

    val nam_address = Address("15 Ly Thuong Kiet","Tan Binh", "VietNam")
    val namEmployee = Employee("Nguyen Van Name","Nam_Image", nam_address)
}