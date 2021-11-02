package app

import data.City
import data.Country

fun main() {

    //saat kita membuat class, kita akan menjadikan sebuah class sebagai abstract
    //Abstract class artinya, class tersebut tidak dibuat sebagai object, hanya bisa diturunkan diclass lainya


    val city = City("Tangerang")
    val country = Country("Indonesia")

    println(city.name)
    println(country.name)
}