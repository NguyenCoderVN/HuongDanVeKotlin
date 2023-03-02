package phan06

fun main() {

    val myNumber = listOf(1, 2, 3, 2, 5)
    showValue(myNumber,"")

    println("Item at 1 is ${myNumber[1]}")
    println("Size is ${myNumber.size}")
    println("contains 3 ${myNumber.contains(3)}")
    println("sum ${myNumber.sum()}")
    println("average ${myNumber.average()}")
    println("min ${myNumber.min()}")
    println("max ${myNumber.max()}")

//    myNumber[2] = 6
//    showValue(myNumber,"myNumber[2] = 6")

//    myNumber.reverse()
//    showValue(myNumber,"reverse()")

//    myNumber.sort()
//    showValue(myNumber,"sort()")


}

private fun showValue(myNumber: List<Int>, text: String) {
    println("---$text---")
    for ((i, item) in myNumber.withIndex()) {
        println("Index $i is $item")
    }
}