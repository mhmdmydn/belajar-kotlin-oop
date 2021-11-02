package app

import data.BigNote
import data.Note

fun main() {


    //Getter Dan Setter
    //Di bahasa pemrogramman Java, ada sebuah konsep yang bernama Getter dan Setter saat membuat properties
    //Getter adalah function yang dibuat untuk mengambil data properties
    //Setter adalah function untuk mengubah data properties
    //di kotlin kita tidak perlu menual untuk membuat function getter dan setter nya, karena sudah difasilitasi sehingga lebih mudah


    val note = Note("Diary pertamaku")

    println(note.title)

    note.title = ""

    println(note.title)

    val bigNote = BigNote("Belajar Kotlin")

    println(bigNote.title)
    println(bigNote.bigTitle)

}