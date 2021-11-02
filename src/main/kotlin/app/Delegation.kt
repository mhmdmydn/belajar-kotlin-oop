package app

import data.MyBase
import data.MyBaseDelegation

fun main() {

    //Delegation

    //salah satu design pattern lain yang populer adalah Delegation
    //Delegation sederhananya adalah meneruskan properties atau function ke object yang lain
    //Kotlin mendukung delegation tanpa harus membuat kode secara manual

    val base = MyBase()
    base.sayHello("Eko")
    base.sayGoodBye("Budi")


    val myBaseDelegation = MyBaseDelegation(base)
    myBaseDelegation.sayHello("Joko")
    myBaseDelegation.sayGoodBye("Maman")


    //Override Delegation
    //Dalam delegation, properties dan function secara otomatis akan didelegasikan ke object yang dipilih
    //Namun kita tetap bisa meng-override properties dan function jika kita mau


}