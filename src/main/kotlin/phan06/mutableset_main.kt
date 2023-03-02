package phan06

fun main() {
    val myNumber = mutableSetOf(1, 2, 3, 2, 5)
    showValue(myNumber,"")

//     println("Item at 1 is ${myNumber[1]}")
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
//
//    myNumber.sort()
//    showValue(myNumber,"sort()")

    val yourNumber = setOf(7,8,9)

    myNumber.addAll(yourNumber)
    showValue(myNumber,"addAll")

//    myNumber.removeAll(yourNumber)
//    showValue(myNumber,"removeAll")

    myNumber.retainAll(yourNumber)
    showValue(myNumber,"retainAll")

    myNumber.add(12)
    showValue(myNumber,"add(12)")

    myNumber.clear()
    showValue(myNumber,"clear()")
    }

private fun showValue(myNumber: Set<Int>, text: String) {
    println("---$text---")
    for ((i, item) in myNumber.withIndex()) {
        println("Index $i is $item")
    }
}