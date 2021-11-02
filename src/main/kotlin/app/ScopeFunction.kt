package app

import data.Student

fun main() {


    //ScopeFunction
    //Kotlin memiliki standar library yang berisikan beberapa function yang bisa digunakan untuk
    //Function tersebut adalah let, run, with, apply, dan also

    //Let Function
    //Let Function bisa digunakan sebagai reference block agar kita bisa lebih mudah ketika ingin memanipulasi sebuah object
    //Let Function memiliki parameter object itu sendiri, sehingga kita bisa menggunakan kata kunci it untuk mendapat referensi terhadap object itu sendiri

    val student = Student("Muhammad Mayudin")

    val result = student.let {
        "Let Function = Student Name: ${it.name}"
    }
    println(result)


    student.let {
        println(it.name)
        it.sayHello("Muhammad", "Mayudin")
    }

    //Run Function
    //Run function mirip dengan let function
    //Yang membedakan adalah, pada run function, tidak ada parameter pada lambda nya , sehingga kita tidak bisa mengakses reference object menggunakan kata kunci it, Namun kita masih bisa menggunakan kata kunci this

    student.run {
        println("Run Function = Student Name: " + this.name)
    }

    //Apply Function
    //Apply Function hampir sama dengan run function
    //Yang membedakan adalah return value dari apply function ada reference object itu sendiri

    student.apply {
        println("Apply Function = Student Name : " + this.name)
    }

    //Also Function
    //Also Function mirip dengan let function
    //Yang membedakan adalah, pada also function, return value nya adalah reference ke object itu sendiri

    val resultStudent: Student = student.also {
        "Also Function = Student Name : ${it.name}"
    }

    println(resultStudent)

    student.also {
        println("Also Function = Student Name : " + it.name)
    }


    //With Function
    //With function mirip dengan run function, menggunakan reference this
    //Yang membedakan adalah, with function bukanlah extension function, jadi tidak bisa digunakan langsung dari object-nya
    //Kita harus memanggilnya with function secara manual

    with(student){
        println("With Function = Student Name : "+ this.name)
    }

}