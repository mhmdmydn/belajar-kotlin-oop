package app

import data.Bos
import data.Employee
import data.Manager
import data.VicePresident

fun main() {

    //Polymorphism
    //Polymorphism berasal dari bahasa Yunani yang berarti banyak bentuk.
    //Dalam OOP, polymorphism adalah kemampuan sebuah object berubah bentuk menjadi bentuk lain.
    //Polymorphism erat hubungannya dengan inheritance

    var employee: Employee = Employee("Mayudin")
    employee.sayHello("Bambang")

    employee = Manager("Joko")
    employee.sayHello("Maman")

    employee = VicePresident("Masa")
    employee.sayHello("Etika")

}