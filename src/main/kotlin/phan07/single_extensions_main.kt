package phan07

fun main() {
    println("Tổng của a và b là: ")
    println(sumAB(2,8))
    val string = "Kotlin and Java"
    println(string.sub(6))
}

//Single-Expression Function
//fun sumAB(a : Int, b :Int) : Int {
//    return a + b
//}
fun sumAB(a : Int, b :Int) : Int = a + b

//Extensions Function
fun String.sub(number : Int): String {
    return this.substring(0,number)
}