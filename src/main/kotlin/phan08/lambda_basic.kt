package phan08

fun main() {
    sum(5, 7)
//    val sumLambda: (Int, Int) -> Unit = { x: Int, y: Int -> println(x + y) }
//    val sumLambda = { x: Int, y: Int -> println(x + y) }
    val sumLambda: (Int, Int) -> Unit = { x, y -> println(x + y) }
    sumLambda(5, 6)
    sum(5, 8, object : GetSum {
        override fun executive(x: Int, y: Int) {
            println(x + y)
        }
    })
    sumLambda(4, 8, sumLambda)
    sumLambda(4, 10, { x, y -> println(x + y) })
    sumLambda(4, 15) { x, y -> println(x + y) }

    var result = 0
    sumLambda(4, 20) { x, y -> result = x + y }
    println(result)
    sumLambdaAddTen(10) { x -> println(x * 2) }
    sumLambdaAddTen(10) { println(it * 2) }

    val sumLambda01: (Int, Int) -> Int = { x, y ->
        println("Giá Trị X là $x")
        x * y
        x + y
    }
    println(sumLambda01(8, 9))

    println(convertWeight("TanSangTa")(15.0))
    println(convertWeight("TanSangKg")(15.0))
}

fun convertWeight(text: String): (Double) -> Double {
    when (text) {
        "TanSangTa" -> return { it * 10 }
        "TanSangKg" -> return { it * 1000 }
        "KgSangGram" -> return { it * 1000 }
        else -> return { it }
    }
}

fun sum(x: Int, y: Int) {
    val z = x + y
    println(z)
}

fun sum(x: Int, y: Int, operator: GetSum) {
    operator.executive(x, y)
}

fun sumLambda(x: Int, y: Int, operator: (Int, Int) -> Unit) {
    operator(x, y)
}

fun sumLambdaAddTen(x: Int, operator: (Int) -> Unit) {
    operator(x + 10)
}

interface GetSum {
    fun executive(x: Int, y: Int)
}