package phan05

fun main() {
    Example.showNumber()
    Example.increase()
    Example.increase()
    Example.showNumber()
    println("Number 1 is ${Example.number1}")
}

class Example {
    fun callMe() = "Call a function No.1"
    val callMe2 = callMe2()

    companion object {
        init {
            println("Singleton is stated")
        }
        private var number = 0
        const val number1 = 10
        fun showNumber() = println("The number is $number")
        fun increase() = number++
        fun callMe2() = "Call a function No.2"
    }
}