package phan06

fun main() {
    val mapNumber = mapOf("One" to 1, "Two" to 2, "Three" to 3, "Three" to 5)

    for ((key, value) in mapNumber) {
        println("Key is $key, value is $value")
    }
    if (mapNumber.containsKey("One")) {
        println("contain One")
    }
    if (mapNumber.containsValue(3)) {
        println("contain 3 value")
    }
}