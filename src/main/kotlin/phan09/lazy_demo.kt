package phan09

fun main() {
    val test : String by lazy {
        println("Initialize")
        "TEST1"
        "TEST"
    }
    println(test)
    test
}