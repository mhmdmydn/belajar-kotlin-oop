package app

import data.Rectangle

fun main() {

    //kadang kita ingin mengakes function atau properties milik class parent yang sudah dibuat ulang oleh child class
    //untuk mengakses function atau properties milik class parent, kita bisa menggunakan kata kunci class super

    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}")
    println("Parent Corner ${rectangle.parentCorner}")


}