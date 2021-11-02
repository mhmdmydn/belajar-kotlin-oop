package app

import data.Human

fun main() {

    //Di kotlin, deklarasi tidak hanya dalam bentuk class, ada juga bentuk Interface
    //Interface adalah blueprint, prototype atau cetakan di kotlin
    //berbeda dengan class, Interface tidak bisa langsung dibuat sebagai object
    //Interface hanya bisa diturunkan, dan biasanya interface digunakan kontrak untuk class - class turunanya.
    //secara standar, semua properties dan function di interface adalah abstarct

    val human = Human("Joko")
    human.sayHello("Muhammad Mayudin")


    //Concrete Function di interface
    //Function di interface memilik pengeculian, tidak harus abstract
    //Kita bisa membuat concrete function diinterface, artinya function tersebut tidak wajib untuk dibuat ulang dichild class nya
    human.sayHelloConcrete("Muhammad Mayudin")


    //Multiple Inheritance dengan interface
    //Inheritance di class hanya boleh memiliki satu class parent
    //Di interfaces, sebuah class Child bisa memiliki banyak interface parent

    human.go()

    //Konflik Interface
    human.move()

    //memperbaiki konflik diinterface

}