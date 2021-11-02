package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {

    //kata kunci super tidak hanya bisa digunakan untuk mengakses function atau properties di class parent
    //kata kunci super juga digunakan untuk mengakses constructor class parent
    //mengakses constructor class parent hanya bisa dilakukan didalam constructor didalam class childnya


    val premiumCustomer = PremiumCustomer("Mayudin")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Mayudin", 100000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}