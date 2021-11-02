package app

import data.Student
import data.sayName

fun main() {

    //Extension Function
    //Menambahkan function pada tipe data yang sudah ada

    //Extension Function bukanlah function diclass
    //perlu diperhatikan, bahwa membuat extension function, kita tidak memodifikasi class aslinya
    //extension function hanyalah sebuah function bantuan yang artinya, kita tidak bisa mengakses data private atau protected dari class tersebut

    val student: Student? = Student("Joko")

    student.sayName("Muhammad Mayudin")
}