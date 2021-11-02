package app

import data.Product

fun main() {

    //Data Class

    //kadang kita sering membuat classs hanya digunakan sebagai representasi dari data
    //data class cocok digunakan dalam hal ini
    //data class merupakan class yang secara otomatis akan membuat function equals, hashCode, toString dan copy dari semua properties yang terdapat diprimary constructor yang dimiliki oleh data class

    val product = Product("Indomie", 5000, "Food")

    println(product)


    //Copy Data Class

    //Data Class memiliki function copy yang bisa digunakan untuk menduplikasi objecta
    //bahkan metode copy yang terdapata didata class bisa digunakan untuk menduplikasi sekaligus mengubah properties nya
    val product2 = product.copy(name = "Supermie")
    println(product2)
}