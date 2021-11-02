package app

import data.Car

fun main() {
    //toString() adalah function yang digunakan untuk memberitahukan representasi String dari Object
    //Saat kit melakukan println object, sebenarnya function toString() akan dipanggil
    //Standardnya, function toString() akan mengembalikan referensi kode unik dari object
    //kita bisa meng-override function toString() jika ingin mengubah reprensentasi dari string pada object kita

    val car = Car("Toyota", 2006)
    println(car)
}