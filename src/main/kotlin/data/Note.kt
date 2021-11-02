package data

class Note(title: String) {
    var title: String = title
    get() = field// sama dengan value title
    set(value){

        if(value.isNotBlank()){
            field = title
        } else {
            println("Invalid title")
        }

    }
}

class BigNote(val title: String){
    val bigTitle: String
    get() = title.uppercase()

}