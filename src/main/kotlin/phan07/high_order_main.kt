package phan07

fun main() {
//    rollDice(1..6, 3, { result: Int -> println(result) })
    rollDice(1..6, 3) { result: Int -> println(result) }
}

fun rollDice(
    range: IntRange,
    time: Int,
    callback: (result: Int) -> Unit
) {
    for (i in 0 until time) {
        val result = range.random()
        // Tham số cuối cùng làm một hàm
        callback(result)
    }
}
