package app

import data.Student
import data.upperCase

fun main() {

    //Extension Properties
    //selain function, kita juga bisa membuat extension untuk properties dikotlin
    //Untuk membuat extension properties, kita bisa membuat properties dengan Getter dan Setter

    val student: Student? = Student("Joko")
    println(student?.upperCase)
}