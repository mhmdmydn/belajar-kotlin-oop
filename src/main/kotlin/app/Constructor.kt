package app

import data.Car

fun main() {
    val toyota = Car("Toyota")
    val almaz = Car("Muling", 2019)

    println(toyota.brand)
    println(toyota.year)
    println(almaz.brand)
    println(almaz.year)
}