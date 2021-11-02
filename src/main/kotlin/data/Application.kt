package data

class Application(val name: String) {

    object Utilities {
        fun toUpper(value: String): String{
            return value.uppercase()
        }
    }

    companion object {
        fun sayHello(value: String): String{
            return value
        }
    }
}