package data

abstract class Animals {

    abstract val name: String
    abstract fun run()
}

class Cat() : Animals() {
    override val name: String = "Cat"

    override fun run() {
        println("Cat run!")
    }

}