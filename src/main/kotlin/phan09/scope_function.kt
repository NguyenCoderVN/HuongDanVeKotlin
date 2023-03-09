package phan09

class Dog {
    var name : String? = null
    var weight : Int? = null
    override fun toString(): String {
        return "name=$name, weight=$weight"
    }
}

fun main() {
    val dog = Dog()

    // Demo hàm mở rộng : also, apply, let, run
    dog.also {
        it.name = "Bull01"
        it.weight = 15
    }
    println(dog)

    dog.apply {
//        this.name = "Bull01"
//        this.weight = 15
        name = "Bull02"
        weight = 16
    }
    println(dog)

    dog.let {
        it.name = "Bull03"
        it.weight = 17
    }
    println(dog)

    dog.run {
        name = "Bull04"
        weight = 18
    }
    println(dog)

    // Demo hàm thông thường : with
    with(dog){
        name = "Bull05"
        weight = 19
    }
    println(dog)

    // Demo trả về đối tượng : also và apply
    val dog01 = dog.also {
        it.name = "Bull01"
        it.weight = 15
    }
    println(dog01)

    val dog02 = dog.apply {
//        this.name = "Bull01"
//        this.weight = 15
        name = "Bull02"
        weight = 16
    }
    println(dog02)

    // Demo trả về lambda
    val textLet = dog.let {
        it.name = "Bull03"
        it.weight = 17
        "textLet $it"
    }
    println(textLet)

    val textRun = dog.run {
        name = "Bull04"
        weight = 18
        "name $name, weight $weight"
    }
    println(textRun)

    val textWith = with(dog){
        name = "Bull05"
        weight = 19
        "name $name, weight $weight"
    }
    println(textWith)

    //Tìm hiểu thêm về hàm let
    val number = mutableListOf("one", "two", "three","four","five")
    val result = number.filter { it.length > 3 }
    println(result)

    number.filter { it.length > 3 }.let (::println)

    val str : String? = "Welcome"
    str?.let {
        println("Show $it")
    }
}