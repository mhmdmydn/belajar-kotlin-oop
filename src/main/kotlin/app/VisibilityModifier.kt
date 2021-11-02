package app

import data.SuperTeacher

fun main() {

    //Visibility Modifier
    // Class, Interface, Constructor, Function dan Properties (Termasuk Getter Dan Setter) bisa memiliki visibility modifiers di kotlin
    //Ada 4 Visibility modifiers dikotlin, yaitu: public, private, protected, internal
    //secara standar visibility modifiers dikotlin adalah public

    //Keterangan
    //public : jika tidak menyebutkan, maka secara otomatis visibility modifiers nya adalah public, yang artinya bisa diakses dari mana pun
    //private : artinya hanya bisa diakses ditempat deklarsinya saja
    //protected : artinya hanya bisa diakses ditempat deklarasinya, dan juga turunannya
    //internal : artinya hanya bisa diakses di module/project yang sama


    val superTeacher = SuperTeacher("Muhammad Mayudin")
    superTeacher.test("Joko")
}