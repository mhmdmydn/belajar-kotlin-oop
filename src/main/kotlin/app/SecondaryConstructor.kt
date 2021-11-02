package app

import data.Address

fun main() {

    val address1 = Address("Jalan A Ke B", "Jakarta")
    val address2 = Address("Jalan B ke A", "Bandung", "Indonesia")

    println(address1.street)
    println(address2.street)
}