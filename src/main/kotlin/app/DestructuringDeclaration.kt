package app

import data.Game
import data.Login
import data.MinMax
import kotlin.math.log

fun minmax(value1: Int, value2: Int): MinMax{
    return when{
        value1 > value2 -> MinMax(value2, value2)
        else -> MinMax(value1, value2)
    }
}


fun login(login: Login, callback: (Login) -> Boolean): Boolean {
    return callback(login)
}

fun main() {

    //Destructuring Declaration

    //Destructuring Declaration adalah membuat multiple variables dari sebuah object
    //Destructuring tidak bisa dilakukan untuk semua object, hanya objek yang memiliki function componentX() yang bisa dilakukan destructuring
    //saat kita membuat data class, secara otomatis akan dibuatkan function componentX() sesuai dengan jumlah dengan jumlah parameter nya

    val game = Game("Game Kotlin", 1000000)

    //tanpa data class
    //val name = game.name
    //val price = game.price

    //with data class
    val (name, price) = game

    println(name)
    println(price)


    //Destructuring di Function

    //Destructuring declaration juga bisa dilakukan ketika memanggil function
    //Dengan ini, seakan-akan kita bisa mengembalikan multiple return value pada function

    //val result = MinMax(10, 100)
    //val min = result.min
    //val max = result.max

    val (min, max) = MinMax(10, 100)
    println(min)
    println(max)

    //jika satu component tidak diinginkan
    val (n, _) = MinMax(20, 200)
    println(n)


    //Destructuring Lambda Parameter

    //Destructuring juga bisa dilakukan di lambda parameter
    //hal ini bisa mempermudah kita saat ingin mengakses data yang ada di parameter

    val login = Login("Muhammad Mayudin", "123456")

    //login(login) { login ->
    //    login.username == "Muhammad Mayudin" && login.password == "123456"
    //}

    login(login){(username, password) ->
        username == "Muhammad Mayudin" && password == "123456"
    }
}