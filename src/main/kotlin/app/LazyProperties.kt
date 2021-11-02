package app

import data.Account

fun main() {

    //Lazy Properties

    //Selain delegation diclass, kotlin mendukung delegation di properties, Namun materi ini tidak akan dibahas disini, karena butuh mengerti dahaulu tentang generic programming, materi delegation di properties akan dibahas di series kotlin generic
    //Salah satu implementasi delegating properties yang sudah disediakan oleh kotlin adalah, lazy properties
    //Lazy adalah standar library yang telah disediakan agar properties baru di inisialisasi  ketika properties itu diakses

    val account = Account()
    println(account.name)
    println(account.name)
    println(account.name)

}