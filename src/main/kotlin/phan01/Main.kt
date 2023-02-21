package phan01

fun main(args: Array<String>) {
    println("Hello Kotlin")
    var x = 10
    var y = x + 10
    println("Giá trị của y là $y")

    var a = 10.25
    println("Giá trị của a là $a")
    var b: Float = a.toFloat()
    println("Giá trị của b là $b")
    var c:Float = b
    //var c:Float = a

    var text = "a"
    //var text1:Char = text
    var text1:String = text

    var text02 =  "abc"
    println("Ký tự đầu của text02 là ${text02[0]}")

    var myArray : Array<Long> = arrayOf(15,16,20)
    var testInt:Int = myArray[2].toInt()
    println("Giá trị của testInt là $testInt")

    val d = 10
    //d = 15

//    println("Mời bạn nhập một số")
//    var enterInt : Int = readLine()!!.toInt()
//    if (enterInt % 2 == 0) {
//        println("Số bạn vừa nhập là số chẳn")
//    } else {
//        println("Số bạn vừa nhập là số lẻ")
//    }

    val day = 7
    when (day) {
        2 -> println("Thứ 2")
        3 -> println("Thứ 3")
        4 -> println("Thứ 4")
        5 -> println("Thứ 5")
        6 -> println("Thứ 6")
        7 -> println("Thứ 7")
        8 -> println("Chủ nhật")
        else -> println("Ngày không hợp lệ")
    }

    val testFor = 5

    for (i in 1..testFor) {
        println("Giá trị i là $i")
    }

    for (i in 1 until testFor) {
        println("Giá trị i là $i")
    }

    for (i in testFor downTo  1) {
        println("Giá trị i là $i")
    }

    val array01 = arrayOf("Một","Hai","Ba","Bốn")
    for (item in array01) {
        println("Giá trị item là $item")
    }

    var itemWhile = 1
    while (itemWhile<=10) {
        println("Giá trị là $itemWhile")
        itemWhile++
    }

    var itemDoWhile = 1
    do {
        println("Giá trị là $itemDoWhile")
        itemDoWhile++
    } while (itemDoWhile<=0)

    var testNull : String? = null
    println("$testNull")

    var size = testNull?.length
    println("$size")

//    var size1 = testNull!!.length
//    println("$size1")

    var test123 : String? = null
    var size123 = test123?.length ?:"Biến này là null"
    println("$size123")

    val value1 = 5
    val value2 = 10
    max(value1,value2)
    println(max1(value1,value2))
    println(max2(value1,value2))
}

fun max(value1:Int, value2: Int) {
    if (value1>value2) {
        println("value1 lớn hơn value2 ")
    } else {
        println("value2 lớn hơn value1 ")
    }
}
fun max1(value1:Int, value2: Int) : String {
    if (value1>value2) {
        return "value1 lớn hơn value2 "
    } else {
        return "value2 lớn hơn value1 "
    }
}
fun max2(value1:Int, value2: Int) : String =
    if (value1>value2)  "value1 lớn hơn value2 "
    else "value2 lớn hơn value1 "
