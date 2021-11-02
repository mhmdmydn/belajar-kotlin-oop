package data

class Car(private val paramBrand: String, private val paramYear: Int = 2020) {

    //jika ingin menjalan sesuatu harus didahului initializer block
    //ini di eksekusi ketika constructor dipanggil
    init {
        println("Car $paramBrand dibuat")
    }



    var brand: String = paramBrand
    var year: Int = paramYear


    override fun toString(): String {
        return "User with username : ${this.paramBrand}"
    }
}