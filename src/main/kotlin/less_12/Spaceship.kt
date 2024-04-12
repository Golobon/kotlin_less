package less_12

open class Spaceship(
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
) {
    fun switchToWarpMode() {
        println("$name: переход в warp режим")
    }
    open fun runSystemDiagnistic() {
        println("$name: запуск диагностики")
    }
}