package phan07

fun main() {
    val sum = sumXY(3,5)
    val mul = multiXY(3,5)
    println("Tổng x và y là : $sum")
    println("Tích của x và y là : $mul")
    println("Ba ký từ đầu của Kotlin là "+getSubString()("Kotlin",3))

}

//Closure Function: là hàm có thể truy cập và sửa đổi
//các thuộc tính được xác định bên ngoài phạm vi của hàm.

fun getSubString() : (text:String, number:Int) -> String {
    return fun(text:String, number:Int) : String {
        return text.substring(0, number)
    }
}

// Hàm ẩn danh với expression
val sumXY = fun(x: Int, y: Int): Int = x + y

// Hàm ẩn danh với block
val multiXY = fun(x: Int, y: Int): Int {
    val z = x * y
    return z
}

