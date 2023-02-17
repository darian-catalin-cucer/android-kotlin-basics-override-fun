open class Vehicle {
    open fun drive() {
        println("The vehicle is driving")
    }
}

class Car : Vehicle() {
    override fun drive() {
        println("The car is driving")
    }
}

fun main() {
    val vehicle: Vehicle = Car()
    vehicle.drive() // prints "The car is driving"
}
