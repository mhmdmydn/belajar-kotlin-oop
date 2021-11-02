package app

import data.Gender

fun main() {

    //Enum Class

    //Enum class merupakan reprenstasi dari class yang sudah tetep nilainya
    //Biasanya enum class digunakan untuk jenis data yang sudah baku, seperti jenis kelamin, arah mata angin dan sejenisnya.
    //Untuk membuat enum class, kita bisa menggunakan kata kunci enum sebelum deklarasi classnya
    //kita tidak bisa membuat object dari class enum, namun kita bisa mendeklarasi langsung object yang tersedia untuk enum class tersebut


    val man = Gender.MALE
    val women = Gender.FEMALE
    val allGenders : Array<Gender> = Gender.values()

    val manFromString =  Gender.valueOf("MALE")
    val womenFromString = Gender.valueOf("FEMALE")

    println(man)
    println(women)
    println(allGenders.toList())


    //Properties Dan Function di Enum Class

    //Enum class adalah class seperti biasanya pada umumnya
    //Enum class bisa memiliki properties ataupun function
    //Namun jika properties nya di set mengunakan constructor, maka saat pembuatan object enum, wajib diisi, dan jika terdapat abstract function, wajib dioverride pada saat pembuatan object enum

    man.printDescription()
    women.printDescription()
}