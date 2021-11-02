package app

import data.Fruit

fun main() {

    //Operator Overloading

    //Kotlin mendukung operator overloading, artinya kita bisa membuat function dari operator-operator seperti operator matematika, dan lain-lain
    //Kemampuan ini membuat kita bisa melakukan operasi apapun diobject seperti layaknya tipe data Integer
    //ada banyak sekali operator yang bisa dioverride di Kotlin


    //Unary Prefix Operator
    //Expresion    Translated to
    //+a            a.unaryPlus()
    //-a            a.unaryMinus()
    //!a            a.not()

    //Increment dan Decrement
    //Expression    Translate to
    //a++           a.inc() + see below
    //a--           a.dec() + see below

    //Aritmatik Operator
    //Expression    Translate to
    //a + b         a.plus(b)
    //a - b         a.minus(b)
    //a * b         a.times(b)
    //a / b         a.div(b)
    //a % b         a.rem(b), a.mod(b) (deprecated)
    //a..b          a.rangeTo(b)

    //In Operator
    //Expression    Translate to
    //a in b        b.contains(a)
    //a !in b       !b.contains(a)

    //Index Access Operator
    //Expression            Translate to
    //a[i]                  a.get(i)
    //a[i, j]               a.get(i, j)
    //a[i_1, ..., i_n]      a.get(i_1, ..., i_n)
    //a[i] = b              a.set(i, b)
    //a[i, j] = b           a.set(i, j, b)
    //a[i_1, ..., i_n] = b  a.set(i_1, ..., i_n, b)

    //Invoke Operator
    //Expression        Translate to
    //a()               a.invoke()
    //a(i)              a.invoke(i)
    //a(i, j)           a.invoke(i, j)
    //a(i_1, ..., i_n)  a.invoke(i_1, ..., i_n)

    //Assigment Operator
    //Expression        Translate to
    //a += b            a.plusAssign(b)
    //a -= b            a.minusAssign(b)
    //a *= b            a.timesAssign(b)
    //a /= b            a.divAssign(b)
    //a %= b            a.remAssign(b), a.modAssign(b) (deprecated)

    //Equality Operator
    //Expression        Translate to
    //a == b            a?.equals(b) ?: (b === null)
    //a != b            !(a?.equals(b) ?: (b === null)

    //Comparison Operator
    //Expression        Translate to
    //a > b             a.compareTo(b) > 0
    //a < b             a.compareTo(b) < 0
    //a >= b            a.compareTo(b) >= 0
    //a <= b            a.compareTo(b) <= 0

    //Comparison Operator
    //Expression        Translate to

    //Membuat Operator Overloading
    //Untuk membuat operator overloading, kita bisa menggunakan kata kunci operator sebelum deklarasi function nya

    val fruit1 = Fruit(100)
    val fruit2 = Fruit(100)

    //jika tidak ada kata kunci operator harus seperti ini
    //val fruit3 = fruit1.plus(fruit2)

    val fruit3 = fruit1 + fruit2
    println(fruit3)

    //operator minus
    println(fruit3 - Fruit(10))


}