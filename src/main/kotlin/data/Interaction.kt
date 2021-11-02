package data

interface Interaction {
    val name: String
    fun sayHello(name: String): Unit

    fun sayHelloConcrete(name: String){
        println("Concrete: Hello $name, my name is ${this.name} ")
    }
}

/**
 * Inheritance antar interface
 * Tidak hanya class yang punya kemempuan Inheritance
 * Interface juga bisa melakukan Inheritance dengan Inhertance lain
 * Namun Interface tidak bisa melakukan Inheritance dengan class
 */

interface Go : Interaction {

    fun go(){
        println("Go!")
    }
}

open class ContohClass(){

}

//Konflik Interface
interface MoveA {
    fun move() = println("Move A")
}

interface MoveB {
    fun move() = println("Move B")
}


class Human(override val name: String) : ContohClass(), Go, MoveA, MoveB {

    override fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }

    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("Move Human")
    }
}