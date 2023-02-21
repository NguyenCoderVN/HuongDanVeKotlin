package phan02

// primary constructor , secondary constructor, getter, setter
class Dog05 (name_para: String, weight_para: Int = 15) {
    val name = name_para.uppercase().also (::println)
        get() {   //  // Custom Getter
            return field.lowercase()
        }
    var weight = if(weight_para > 5) weight_para else throw IllegalArgumentException("weight is too low")
//        private set
        set(value){ // Custom Setter
            field = if(value > 5) value else throw IllegalArgumentException("weight is too low")
        }
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
