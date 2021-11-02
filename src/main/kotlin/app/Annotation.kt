package app

import program.MyApplication

fun main() {

    //Annotation
    //Annotation adalah menambahkan metadata ke kode program yang kita buat
    //Tidak semua orang membutuhkan Annotation, biasanya Annotation digunakan saat kita ingin membuat Library / framework
    //Annotation sendiri bisa diakses menggunakan reflection, yang akan kita bahas nanti
    //Untuk membuat kelas annotation, kita bisa menggunakan kata kunci annotation sebelum membuat class tersebut
    //Annotion hanya boleh memiliki properties via primary constructor, tidak boleh memiliki members lainnya (function atau properties di body)

    //Attribute Annotation
    //@Target           = Memberitahu annotation bisa digunakan dimana ? class, function, properties, dan lain-lain
    //@Retention      = Memberitahu annotation apakah disimpan di hasil kompilasi, dan apakah bisa dibaca oleh reflection
    //@Repeatable       = Memberitahu annotation apakah bisa digunakan lebih dari sekali di target yang sama ?
    //@MustBeDocumented = Memberitahu annotation apakah perlu didokumentasikan di public API

    val myApplication = MyApplication("Kotlin", 1)
    println(myApplication.info())
}