package phan09

fun main() {
    val test = Test()
//    println(test.name)
    // UninitializedPropertyAccessException
    test.name = "Test"
    println(test.name)
}

class Test {
    lateinit var name : String
}

// Phải khởi tạo biến trước khi sử dụng.
// Đối số phải là var tức mutable có thể thay đổi.
// Biến với khai báo lateinit không chấp nhận null
