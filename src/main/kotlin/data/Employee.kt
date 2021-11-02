package data

/**
 * parent class
 */
open class Employee(val name: String) {

    open fun sayHello(name: String){
        println("Hello $name, my name is ${this.name}")
    }

}

/**
 * child class
 */
open class Manager(name : String) : Employee(name){
    final override fun sayHello(name: String) {
        println("Hello $name, my name is Manager ${this.name}")
    }
}

/**
 * child class
 */
class SuperManager(name: String) : Manager(name){
//    error
//    override fun sayHello(name: String) {
//
//    }
}

/**
 * child class
 */
open class VicePresident(name : String) : Employee(name){
    override fun sayHello(name: String) {
        println("Hello $name, my name is Vice President ${this.name}")
    }
}
