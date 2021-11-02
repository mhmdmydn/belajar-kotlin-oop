package app

import data.Minus
import data.Modulo
import data.Operation
import data.Plus

fun operation(value1: Int, value2: Int, operation: Operation): Int {
    return when(operation){
        is Plus -> value1 + value2
        is Minus -> value1 - value2
        is Modulo -> value1 % value2
    }
}


fun main() {

    //Sealed Class

    //Sealed class merupakan jenis class yang didesain untuk inheritance
    //Sealed class tidak bisa diintansiasi menjadi object, dan secara standar sealed class merupakan abstract class
    //Sealed class sangat cocok digunakan sebagai class Parent


    //Sealed Class di When Expression
    //Sealed class sangat berguna saat kita mengunakan when expression
    //dengan menggunakan sealed class, kita bisa membatasi hanya class turunannya yang perlu di check

    println(operation(10, 10, Plus()))
    println(operation(10, 5 , Minus()))
    println(operation(10, 3, Modulo()))
}