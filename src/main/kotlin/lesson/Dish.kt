package lesson

class Dish (
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false,
) {
    fun addToFavorites(){
        println("Блюдо $name добавлено в избранное")
        inFavorites = true
    }
    fun removeFromFavorites(){
        println("Блюдо $name удалено их избранного")
        inFavorites = false
    }
    fun startCooking(){
        println("Началась готовка блюда $name")
    }
    fun donwloadIngredients(): List<String>{
        return ingredients
    }
}