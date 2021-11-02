package app

import data.Application

typealias App = Application
typealias Aplikasi = Application
typealias App2 = data2.Application


/**
 * function lamda type alias
 */
typealias StringSupplier = () -> String

fun sayHello(supplier: StringSupplier){
    println("Hello ${supplier()}")
}

fun main() {

    //Type Alias

    //Kotlin mendukung Type Alias
    //Type Alias adalah membuat nama berbeda dari tipe data yang telah ada
    //Biasanya ini digunakan ketika ada tipe data dengan nama yang sama, atau untuk mempersingkat tipe data sehingga kita tidak perlu menulisnya terlalu panjang

    val app = App("Kotlin App")

    val aplikasi = Aplikasi("Aplikasi")

    val app2 = App2("Kotlin App 2")


    //function type alias
    sayHello {
        "Mayudin"
    }
}