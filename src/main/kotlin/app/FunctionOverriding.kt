package app

import data.Manager

fun main() {
    //open artinya boleh dideklrasikan ulang diclass childnya
    //function overriding adalah kemampuan membuat ulang function yang sudah ada di class parent
    //secara standar, function diclass adalah final, tidak bisa dibuat ulang diclass childnya
    //agar function bisa dibuat ulang diclass childnya, kita harus menggunakan kata kunci open di depan function
    //saat kita membuat ulang function diclass child, secara standar, function tersebut bersifat open, yang artinya bisa dibuat ulang diclasss child bawahnya lagi

    val manager = Manager("Joko")
    manager.sayHello("Mayudin")


}