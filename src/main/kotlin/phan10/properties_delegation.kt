package phan10

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

// Properties Delegation

// Đầu tiên chúng tạo một lớp và ủy quyền getter và setter cho
// lớp DelegateDog()
class Dog01 {
    var name : String by DelegateDog()
}

// Ta tạo lớp DelegateDog()
// Sau đó ta implement

class DelegateDog : ReadWriteProperty<Any? , String> {
    private var formatValue : String = ""
    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
         // ở đây ta trả về giá trị formatValue, mặt đinh ban đầu là ""
        return formatValue
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        // ở đây ta sẽ format thành in hoa khi truyền vào
        formatValue = value.uppercase()
    }

}

// Chúng ta hiện thực như sau
fun main() {
    val dog01 = Dog01()
    dog01.name = "lucky" // ở đây ta truyền vào là chữ thường
    // Ta xuất thông tin
    println("New name is ${dog01.name}")
}

// Vậy chúng ta đã ủy quyền delegation tạo giá trị
// cho thuộc tính qua lớp DelegateDog
// Qua đó chúng ta có thể tái sử dụng được code

// Cám ơn các bạn đã quan tâm theo dõi