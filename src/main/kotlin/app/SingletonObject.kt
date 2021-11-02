package app

import data.Application
import data.Utilities

fun main() {

    //Singleton Object
    //Salah satu konsep Design Pattern yang sangat populer adalah singleton object
    //Singleton Oject adalah object yang hanya dibuat sekali
    //Di Kotlin, membuat singleton object sangat mudah, hanya denagn menggunakan kata kunci object
    //Cara membuat singleton object dikotlin sama seperti membuat class biasanya
    //Singleton object mirip dengan class, bisa diextend class ataupun interface
    //Namun singleton object tidak memiliki constructor


    println(Utilities.name)
    println(Utilities.toUpper("Mayudin"))

    //Inner Object
    //Di Kotlin, singleton object bisa dibuat didalam sebuah class
    //namun berbeda dengan inner class, singelton object tidak bisa mengakses properties atau function yang ada diouter class nya

    println(Application.Utilities.toUpper("Muhammad"))
}