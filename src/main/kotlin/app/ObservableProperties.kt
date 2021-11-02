package app

import data.Account

fun main() {

    //Observable Properties

    //Salah satu standar library yang disediakan oleh Kotlin untuk delegating di properties adalah observable properties
    //Dengan observable properties, kita bisa tahu properties, value sebelum dan value sesudah ketika sudah diubah

    val account = Account()

    account.description = "Contoh"
    account.description = "Di Ubah"
    account.description = "Hello World"
}