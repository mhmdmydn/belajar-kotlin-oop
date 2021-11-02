package app

import data.Student

fun main() {
    //this keyword adalah yang bisa digunakan untuk mereferensikan object saat ini
    //this ini hanya bisa digunakan class itu sendiri

    val student = Student("Joko")
    student.greeting("Muhammad Mayudin")

}