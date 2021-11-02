package app

import data.Rectangle
import data.Shape

fun main() {

    // menggunakan kata kunci super untuk mencetak function pada parent class

    val shape = Shape()
    shape.printName()

    val rectangle = Rectangle()
    rectangle.printName()
}