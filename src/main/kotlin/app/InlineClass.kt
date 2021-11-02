package app

import data.Token

fun main() {

    //Inline Class

    //Kadang kita hanya membuat class dengan satu properties
    //terlalu banyak class akan ada konsekuensinya, yaitu memakan konsumsi memory yang lebih banyak ketika program dijalankan
    //kotlin memiliki kemampuan untuk mengubah class menjadi inline dengan menggunakan kata kunci inline

    val token = Token("Ini Token")

    println(token.value)
    println(token.toUpper("Ini Token"))

}