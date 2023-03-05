package phan07

fun main() {
    println("Tổng giá trị của x y z là:")
    println(sum(2, 5, 7))
    println(sum(x = 2, y = 5, z = 7))
    println(sum(x = 2, z = 7))
    sumNoReturn(5, 2, 3)
    sumNoReturn(x = 5, y = 2, z = 3)
    sumNoReturn(x = 5, z = 3)
}

fun sum(
    x: Int,
    y: Int = 10,
    z: Int,
): Int {  // Body / Thân hàm nằm trong dấu ngoặc nhọn
    return x + y + z
}

fun sumNoReturn(
    x: Int,
    y: Int = 10,
    z: Int,
) {  // Body / Thân hàm nằm trong dấu ngoặc nhọn
    println("Tổng giá trị của x y z là: ${x + y + z}")
}
