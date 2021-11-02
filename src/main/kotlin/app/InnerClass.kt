package app

import data.Bos

fun main() {

    //Inner Class

    //Dikotlin, kita bisa membuat class (Inner) didalam class (Outer)
    //Namun walapun class inner tersebut berada dalam class Outer, namun class inner tidak bisa mengakses data yang ada di dalam class Outer
    //agar class inner bisa mengakses data yang ada di dalam class outer, kita bisa menggunakan kata kunci inner

    val boss = Bos("joko")

    val budi = boss.Employee("Budi")

    val MuhammadMayudin = boss.Employee("Muhammad Mayudin")

    budi.hi()
    MuhammadMayudin.hi()

}