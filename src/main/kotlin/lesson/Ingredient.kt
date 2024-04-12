package lesson

class Ingredient(val name: String = "Boo", val weight: Int = 7, val count: Int = 9, _isNeedToPrepare: Boolean) {


    init {
        println("Создан: $name")
    }
}