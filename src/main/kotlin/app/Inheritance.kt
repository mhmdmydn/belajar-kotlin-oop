package app

import data.Manager
import data.VicePresident

fun main() {
    //inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
    //dalam artian, kita bisa membuat class parent dan class child
    //dikotlin, tiap class child, hanya bisa punya satu class parent, namum satu class parent bisa punya banyak class child
    //secara standar, diclass yang dibuat dikotlin adalah final (tidak bisa diwariskan), agar bisa diwariskan, kita harus menggunakan kata kunci open didepan class

    val manager = Manager("Joko")
    manager.sayHello("Muhammad")

    val vicePresident = VicePresident("Joko")
    vicePresident.sayHello("Mayudin")


}