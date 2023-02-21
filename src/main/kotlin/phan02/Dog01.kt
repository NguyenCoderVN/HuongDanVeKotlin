package phan02

// primary contructor
class Dog01 (name_para: String, weight_para: Int = 10, color_para : String) {
    val name = name_para.uppercase()
    var weight = weight_para
    var color = color_para
    fun say() {
        println("Woo Woo")
    }
}
