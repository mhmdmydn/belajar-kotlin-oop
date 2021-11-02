package app

import data.Smartphone

fun main() {

    //Dikotlin semua class itu yang pernah kita buat tanpa class parent, sebenarnnya secara otomatis dia akan menjadi class child dari class Any
    //Any adalah superclass untuk semua class yang kita buat dikotlin

    val smartphone = Smartphone("Samsung s10", "Android")

    println(smartphone.toString())
    println(smartphone.hashCode())

}