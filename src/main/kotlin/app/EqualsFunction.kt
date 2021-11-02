package app

import data.Company

fun main() {

    //Equals Function, dikotlin object dibandingkan mengunakan operasi == atau !=
    //Saat kita membandingkan objek menggunakan operasi == atau !=, sebenernya kotlin akan mengunakan function equals milik class Any
    //Untuk mengubah cara cara membandingkan kita bisa meng-override function equals milik class Any

    val company1 = Company("Mayudin")
    val company2 = Company("Mayudin")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)
}