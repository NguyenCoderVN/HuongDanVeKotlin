package Phan01

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


}