package data

class Friend(val name: String) {

    fun sayHello(friend: Friend?){
        if(friend != null){
            println("Hello ${friend.name}")
        }

        //safe call mengunakan
        //println("Hello ${friend?.name}")

        //Elvis  Operator
        //val name = friend?.name ?: ""
        //println("Hello $name")


        //!! operator
        //val name = friend!!.name
        //println(name) //jika tidak null akan dicetak jika null akan mendapatkan error NullPointerException


    }
}