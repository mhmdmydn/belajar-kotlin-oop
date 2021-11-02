package app

import data.Cat

fun main() {
    //Abstract Properties Dan Function
    //Saat kita membuat class abstract, kita bisa membuat properties abstract dan function abstact didalam class tersebut
    //Properties dan function yang bersifat abstract, artinya wajib dibuat ulang di class childnya

    val cat = Cat()
    cat.run()
    println(cat.name)

}