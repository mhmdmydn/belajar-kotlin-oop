package app

import data.Action

/**
 * Deklarasi Anonymous Class
 */

fun fireAction(action: Action){
    action.action()
}

/**
 * Deklarasi Simple Action Interface
 */

class SimpleAction : Action {
    override fun action() {
        println("This is simple action")
    }
}

fun main() {

    fireAction(SimpleAction())

    //Anonymous Class

    //saat kita ingin membuat object, maka kita diwajibkan untuk menggunakan deklarasi class yang lengkap
    //namun, kotlin mendukung pembuatan object dari class yang bahkan belum lengkap
    //bahkan, dikotlin, kita bisa membuat object dari interface
    //kemampuan ini dinamakan anonymous class
    //untuk membuat anonymous class, kita bisa mengunakan kata kunci object diikuti dengan deklarasi class Child seperti pewarisannya

    fireAction(object : Action {
        override fun action() {
            println("Action one")
        }
    })
    fireAction(object : Action {
        override fun action() = println("Action Two")

    })

}