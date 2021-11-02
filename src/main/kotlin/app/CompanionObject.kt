package app

import data.Application

fun main() {

    //Companion Object

    //Companion object adalah kemampuan membuat inner object di dalam class, tanpa harus menggunakan nama object
    //Companion object secara otomatis akan menggunakan nama Companion, atau bisa langsung diakses lewat nama classnya

    println(Application.sayHello("Muhamamad Mayudin"))
    println(Application.Companion.sayHello("Budi"))
}