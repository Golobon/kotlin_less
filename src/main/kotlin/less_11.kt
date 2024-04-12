fun main() {
    val nullableString: String? = null
    nullableString ?: 0
    println(nullableString?.length ?: -1)
}