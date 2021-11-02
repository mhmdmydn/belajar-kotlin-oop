package app

import data.Company

fun main() {

    //hashCode adalah function yang gunakan sebagai representasi angka unit untuk objek yang kita buat
    // function hashCode sangat berguna saat kita mengonversikan objek kita menjadi angka
    //salah satu penggunaan hashCode yang banyak dilakukan adalah struktur data, misalnya untuk memastikan tidak adanya data duplicate, agar lebih mudah, dicek nilai hashCodenya jika hascode sama, maka dianggap object tersebut sama

    val company1 = Company("Mayudin")
    val company2 = Company("Mayudin")


    println(company1.hashCode())
    println(company2.hashCode())

    println(company1.hashCode() == company2.hashCode())

}