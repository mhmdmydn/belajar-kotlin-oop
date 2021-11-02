package app

import data.Rectangle
import data.Shape
import data.Triangle

fun main() {
    //selain membuat ulang function overriding diclass child, dikotlin juga kita bisa membuat ulang properties
    //secara standar, properties diclass bersifat final, tidak bisa dibuat ulang diclass child nya, agar bisa dibuat ulangnya, kita harus mengunakan kata open

    val shape = Shape()
    println(shape.corner)

    val rectangle = Rectangle()
    println(rectangle.corner)

    val triangle = Triangle()
    println(triangle.corner)


}