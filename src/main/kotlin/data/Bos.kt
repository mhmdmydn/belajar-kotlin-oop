package data

class Bos(val name: String) {


    /**
     * inner class
     * bisa akses data class outernya
     */
    inner class Employee(val name: String){
        fun hi(){
            println("Hi, my name is $name, my boss name is ${this@Bos.name}")
        }
    }
}