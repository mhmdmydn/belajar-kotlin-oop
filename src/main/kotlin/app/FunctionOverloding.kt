package app

import data.Student

fun main() {
    //function overloading adalah kemampuan membuat function dengan nama yang sama di dalam class

    val student = Student("Maman")

    print("Function : ")
    student.sayHello("Bambang")
    print("Function Overloading: ")
    student.sayHello("Muhammad", "Mayudin")
    student.run()
}