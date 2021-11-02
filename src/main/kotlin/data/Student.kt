package data

class Student(val name: String) {

    fun sayHello(yourName: String): Unit{
        println("Hello $yourName, My name is $name")
    }

    //harus membedakan dan menambahkan parammeter di function
    fun sayHello(firstName: String, lastName: String): Unit{
        println("Hello $firstName $lastName, My name is $name")
    }

    //function yang menggunakan this keyword
    fun greeting(name: String): Unit{
        println("Hello $name, my name is ${this.name}")
    }


    fun run(){
        println("Im run")
    }


}

/**
 * Extension Function
 */
fun Student?.sayName(name: String){
    if(this != null){
        println("Hello $name, my name is ${this.name}")
    }
}


/**
 * Extension Properties
 */

val Student.upperCase : String
get() = this.name.uppercase()


