package phan05

fun main() {
    Singleton.showNumber()
    val number1 = Singleton
    val number2 = Singleton
    val number3 = Singleton
    number1.increase()
    number2.increase()
    number3.increase()
    Singleton.showNumber()
    ShowPerson.getWorker()
    ShowPerson.showName
    ShowPerson.showName()
}

object ShowPerson : Person(name = "NguyenCoderVN"), Worker {
    override fun getWorker() {
        println("I am a worker")
    }
    val showName = super.showName()
    override fun showName() {
        println("My name is abc")
    }
}

object Singleton {
    init {
        println("Singleton is started")
    }

    private var number = 0
    fun showNumber() = println("The number is $number")
    fun increase() = number++
}

interface Worker {
    fun getWorker()
}

open class Person(private val name : String) {
    open fun showName() {
        println("My name is $name")
    }
}

