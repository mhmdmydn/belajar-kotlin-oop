package data

enum class Gender(val descripton: String) {
    MALE("Male"),
    FEMALE("Female");

    fun printDescription(){
        println(descripton)
    }

}