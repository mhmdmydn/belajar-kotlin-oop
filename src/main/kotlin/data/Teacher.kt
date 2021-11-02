package data

open class Teacher(val name : String) {

    private fun sayHello(name: String){
        println("Halo $name, nama saya ${this.name}")
    }

    protected fun sayHelloProtected(name : String){
        println("Halo $name, nama saya ${this.name}")
    }
}

class SuperTeacher(private val superName: String) : Teacher(superName){

    fun test(name: String){
        super.sayHelloProtected(name)
    }
}