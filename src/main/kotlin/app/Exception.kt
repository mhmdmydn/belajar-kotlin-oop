package app

import exception.ValidationException
import java.lang.NullPointerException


fun validateSayHello(name: String){
    if(name.isBlank()){
        throw ValidationException("Name is Blank")
    } else {
        println("Hello $name")
    }
}

fun main() {

    //Exception

    //Saat kita membuat program, kita akan selalu berhadapan dengan error
    //Banyak sekali jenis error, baik itu error yang sudah diduga, seperti validation error, atau error yang tidak terduga, seperti ada jaringan error, koneksi ke database error dan lain-lain
    //Error di kotlin direpresentasikan dengan Exception, dimana semau tipe data error pasti akan selalu class turunan Throwable
    //Untuk membuat error di Kotlin sangatlah mudah, kita bisa menggunakan kata kunci throw, diikuti dengan object errornya

//    validateSayHello("Mayudin")
//    validateSayHello("") //error ValidationException


    //Try Catch

    //Jika dalam program Kotlin kita terjadi exception, maka secara otomatis program kita akan berhenti
    //Kadang kita tidak ingin sampai kejadian seperti itu
    //Dikotlin, bisa menangkap exception, lalu melakukan sesuatu jika terjadi error
    //Try Catch di Kotlin digunakan untuk mencoba melakukan sesuatu, jika terjadi error maka akan ditangkap dan kita bisa memberi reaksi sesuai dengan yang kita mau

    try {
        validateSayHello("Mayudin")
        validateSayHello("")
        println("Program")//tidak akan dijalankan
    } catch (error : ValidationException){
        println("Error with message : ${error.message}")
    }

    //Multiple Catch

    //Saat kita mengeksekusi sebuah kode program di blok Try, bisa dimungkinkan tidak hanya terjadi satu jenis exception, bisa saja terjadi beberapa jenis exception
    //dikotlin, kita bisa menggunakan multiple block catch, untuk menangkap jenis exception yang berbeda


    try {
        validateSayHello("Mayudin")
        validateSayHello("")
        println("Program")//tidak akan dijalankan
    } catch (error : ValidationException){
        println("Error with message : ${error.message}")
    } catch (error: NullPointerException){
        println("Error with message : ${error.message}")
    } catch (error: Throwable){
        println("Error with message : ${error.message}")
    }

    //Finally

    //Finally adalah block kode yang bisa ditambahkan di Try Catch
    //Block finally akan selalu dieksekusi kode program Try Catch di eksekusi, baik itu sukses ataupun gagal
    //Ini cocok untuk menempatkan kode yang memang harus dilakukan tidak peduli baik itu kodenya sukses atau gagal


    try {
        validateSayHello("Mayudin")
        validateSayHello("")
        println("Program")//tidak akan dijalankan
    } catch (error : ValidationException){
        println("Error with message : ${error.message}")
    } catch (error: NullPointerException){
        println("Error with message : ${error.message}")
    } catch (error: Throwable){
        println("Error with message : ${error.message}")
    }finally {
        println("Program selesai")
    }
}