package data

open class Shape {

    open val corner: Int = -1

    open fun printName(){
        println(" This is Shape")
    }

}

class Rectangle: Shape(){
    override val corner: Int = 4

    //mengambil properties corner yang ada diparent class shape
    val parentCorner: Int = super.corner

    //super function
    override fun printName() {
        super.printName()
        println("This is Rectangle")
    }
}

class Triangle : Shape(){
    override val corner: Int = 3
}
