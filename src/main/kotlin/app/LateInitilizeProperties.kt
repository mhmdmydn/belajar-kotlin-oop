package app

import data.Televesion

fun main() {

    //Late-Initialized Properties

    //standarnya, properties dikotlin wajib di inisialisasi di awal saat deklarasi properties tersebut
    //namun dikotlin kita juga bisa menunda inisialisasi data para properties
    //dengan mengunakan kata kunci lateinit, kita bisa membuat properties tanpa harus langsung mengisi data
    //kata kunci lateinit hanya digunakan di var, tidak bisa digunakan di val


    //biasanya orang-orang mengunakan lateinit itu framework atau library dari java

    //Kesimpulannya adalah mau bikin properties tapi tidak mau di inisialisasi data awal tinggal di tambahkan lateinit var


    val televesion = Televesion()

    televesion.initTelevesion("Samsung")

    println(televesion.brand)//Samsung

    //println(televesion.brand)//ERROR : kotlin.UninitializedPropertyAccessException: lateinit property brand has not been initialized

}