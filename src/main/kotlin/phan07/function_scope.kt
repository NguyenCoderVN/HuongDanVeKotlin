package phan07

fun main() {
    println("Tổng giá trị của x y z là:")
    println(sumXYZ(x = 2, y = 5, z = 7))

    val tessClass = TessClass()
    println("Tổng giá trị của x y z là:")
    println(tessClass.sumXYZ(x = 2, y = 5, z = 7))
}

// Top-lever function
fun sumXYZ(
    x: Int,
    y: Int = 10,
    z: Int,
): Int {  // Body / Thân hàm nằm trong dấu ngoặc nhọn
    //localSum(x,y)
    // Local function
    fun localSum(a : Int, b : Int) {
        println("Tổng x và y là ${a+b}")
    }
    localSum(x,y)
    return x + y + z
}

class TessClass {
    // Member function
    fun sumXYZ(
        x: Int,
        y: Int = 10,
        z: Int,
    ): Int {  // Body / Thân hàm nằm trong dấu ngoặc nhọn
        return x + y + z
    }
}