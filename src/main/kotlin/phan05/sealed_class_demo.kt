package phan05

fun main() {
    val vehicle : Vehicle = Car("ABC")
    getVehicle(vehicle)
    val vehicle2 : Vehicle = Accord
    getVehicle(vehicle2)
}

sealed class Vehicle(var manufacturer: String) {
    abstract fun start()
    abstract val model : String
}

data class Car (
    override val model: String
) : Vehicle("Honda") {
    override fun start() {
        println("Car is start")
    }
}

data class Bicycle (
    override val model: String
) : Vehicle("Martin") {
    override fun start() {
        println("Bicycle is start")
    }
}

object Accord : Vehicle("Honda") {
    override fun start() {
        println("Accord is start")
    }

    override val model: String = "Accord"
}

fun getVehicle (vehicle: Vehicle) =
    when(vehicle) {
        Accord -> println("This is ${vehicle.manufacturer} - ${vehicle.model}")
        is Bicycle -> println("This is ${vehicle.manufacturer} - ${vehicle.model}")
        is Car -> println("This is ${vehicle.manufacturer} - ${vehicle.model}")
    }