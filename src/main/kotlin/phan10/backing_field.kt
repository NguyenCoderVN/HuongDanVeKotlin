package phan10


class Dog {
    var name :String = "Bull"
        get() {
            //println("Default name is $name") //StackOverflowError
            println("Default name is $field")
            return field
        }
    var weight : Int = 20
        set(value) {
            println("Default weight is $field")
            println("New weight is $value")
            field = value + 10
        }
}

fun main() {
    var dog = Dog()
    println("Name of Dog is ${dog.name}")
    dog.weight = 25
    println("Weight of Dog is ${dog.weight}")
}

// Backing field được Kotlin tạo ra khi
// thực hiện hàm getter và setter
// đối với setter "value" là giá trị truyền vào