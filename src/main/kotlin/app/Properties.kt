package app

import data.Person

fun main() {
    val mayudin = Person()
    mayudin.firstName = "Muhammad"
    mayudin.middleName = ""
    mayudin.lastName = "Mayudin"

    println(mayudin.firstName)
    println(mayudin.middleName)
    println(mayudin.lastName)
}