fun main(args: Array<String>) {
    val list: List<Int> = listOf(1, 2, 7, 3, 4, 5, 6, 7, 8, 9, 10)
    val list2 = list.sorted().toMutableList()
    list2.forEach { println(it) }
}

