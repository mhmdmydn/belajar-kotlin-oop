package app

import data.Friend

fun main() {

    //Null Safety

    //jika temen-temen sebelumnya pernah belajar bahasa pemrograman java, di java kita sering mengenal error bernama NullPointerException. Error ini terjadi ketika kita ingin mengakses properti atau functions di null object
    //Di Kotlin, Hal ini sangat jarang terjadi, karena sejak awal di kotlin tidak direkomendasikan untuk menggunakan nullable type
    //Walaupun akan menggunakan nullable type, di Kotlin kita memberitahu secara eksplisit mengunakan karakter ? (tanda tanya)
    //Kali ini kita akan bahas cara-cara agar terhindar dari error null dikotlin sehingga tidak sering kejadian seperti di java

    val friend = Friend("Muhammad Mayudin")
    friend.sayHello(friend)
    friend.sayHello(null) // null tidak akan dicetak


    //!! operator

    //Jika benar-benar yakin bahwa variable tersebut tidak null
    //Maka kita bisa menggunakan kata kunci !!(tanda seru 2X) untuk mengkonversikan dari data yang nullable menjadi tidak nullable
    //tapi ingat, konsekuensinya jika sampai ternyata datanya null, maka akan terjadi error


}