package lesson

fun main() {
    val dish1: Dish = Dish(
        name = "Рыба",
        id = 1,
        category = "Морское",
        ingredients = listOf("Рыба", "Соль"),
    )
    val dish2: Dish = Dish(
        name = "Мясо",
        id = 1,
        category = "Земное",
        ingredients = listOf("Мясо", "Соль", "Специи"),
        inFavorites = true,
    )
    val ingredient1: Ingredient = Ingredient(
        "Картошка",
        1,
        1,
        false)
    println(ingredient1.name)
    println()
    val ingredient2: Ingredient = Ingredient(
        "Пушок",
        1,
        1,
        false)
    println(ingredient2.name)
    println()
    val ingredient3: Ingredient = Ingredient(_isNeedToPrepare = false)
    println(ingredient3.name)
    println()
    println("Действия")
    dish1.addToFavorites()
    println(dish1.inFavorites)
    dish1.startCooking()
    println()
    println("Действия")
    dish2.addToFavorites()
    println(dish2.inFavorites)
    val ingredients = dish2.donwloadIngredients()
    println(ingredients)
    dish2.removeFromFavorites()
    println(dish2.inFavorites)

}