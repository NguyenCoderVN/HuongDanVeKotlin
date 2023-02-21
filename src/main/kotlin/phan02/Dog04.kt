package phan02

// primary constructor , secondary constructor
class Dog04 (name_para: String, weight_para: Int = 15) {
    val name = name_para.uppercase().also(::println)
    var weight = weight_para.also(::println)
    var color: String? = null // biến phải được khởi tạo
    constructor( name: String, weight: Int, color: String) : this(name,weight) {
        this.color = color.also(::println)
    }
    init {
        println("initializer block show name $name and color $color")
    }
    fun say() {
        println("Woo Woo")
    }
}
