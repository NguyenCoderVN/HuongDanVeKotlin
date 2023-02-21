package phan02

// primary constructor , secondary constructor
class Dog03 (name_para: String, weight_para: Int = 15) {
    val name = name_para.uppercase()
    var weight = weight_para
    var color: String? = null // biến phải được khởi tạo
    constructor( name: String, weight: Int, color: String) : this(name,weight) {
        this.color = color
    }
    init {
        println("initializer block show name $name and color $color")
    }
    fun say() {
        println("Woo Woo")
    }
}
