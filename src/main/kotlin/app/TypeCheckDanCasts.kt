package app

import data.HandPhone
import data.Laptop

fun printObject(any : Any){
    if(any is Laptop){
        println("Laptop ${any.name}")
    } else if(any is HandPhone){
        println("Handphone ${any.name}")
    }else {
        println(any)
    }

}

fun printObjectWhen(any: Any){
    when (any) {
        is Laptop -> println("Laptop ${any.name}")
        is HandPhone -> println("Handphone ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any){
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any){
    val value: String? = any as? String
    println(value)
}

fun main() {

    //Dalam Object Oriented Programming kita akan bertemu dengan banyak sekali tipe data (class) dan pewarisan (Inheritance)
    //kadang kita butuh melakukan pengecekan tipe data, atau abahkan melekukan konversikan data

    printObject("Mayudin")
    printObject(2)
    printObject(Laptop("Acer"))
    printObject(HandPhone("IPhone"))


    // is dan !is Operator
    // is digunakan untuk melakukan pengecekan apakah sebuah data merupakan tipe data tertentu
    // !is digunakan untuk melakukan pengecekan apakah sebuah data bukan merupakan tipe data tertentu
    printObject(Laptop("ROG"))
    printObject(HandPhone("Samsung"))


    //Smart Casts
    //Kotlin memiliki mekenisme konversi data secara otomatis setelah kita melakukan pengecekan mengunakan is
    //setelah kita melakukan pengecekan mengunakan is, maka secara otomatis tipe data yang kita cek akan berubah menjadi tipe data yang kita check di Object tersebut


    //Casts di when expression
    //selain menggunakan if untuk melakukan pengecekan tipe data dan konversi tipe data
    //kita juga bisa menggunakan when expression
    //penggunaan when expression ekan lebih sederhana dibanding if expression dalam melakukan pengecekan dan konversi tipe data

    printObjectWhen("Mayudin")
    printObjectWhen(2)
    printObjectWhen(Laptop("ROG"))
    printObjectWhen(HandPhone("Samsung"))

    //Unsafe Casts
    //Kotlin juga mendukung konversi tipe data secara paksa menggunakan kata kunci as
    //Namun konversi mengunakn as sangat tidak aman jika ternyata tipe datanya tidak sesuai

    printString("Muhammad Mayudin")
    //printString(1) ERROR : java.lang.ClassCastException Karena tipe data any konversi menjadi string

    //Safe casts nullable
    printStringSafe("mayudin") //mayudin
    printStringSafe(1)//null
}