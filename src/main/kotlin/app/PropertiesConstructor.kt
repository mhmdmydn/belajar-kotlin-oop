package app

import data.User

fun main() {
    val user = User("Muhammad Mayudin", "123456")

    println(user.username)
    println(user.password)
}