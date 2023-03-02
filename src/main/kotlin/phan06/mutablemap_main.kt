package phan06

fun main() {
    val mapNumber = mutableMapOf("One" to 1, "Two" to 2, "Three" to 3)

    mapNumber.put("Four", 4)
    mapNumber.put("Four", 5)

    val yourNumber = mutableMapOf("Seven" to 7, "Ten" to 10)

    mapNumber.putAll(yourNumber)

    mapNumber.remove("Seven")

    mapNumber.clear()

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