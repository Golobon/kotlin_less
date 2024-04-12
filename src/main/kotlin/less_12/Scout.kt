package less_12

class Scout(name: String,
            speed: Int,
            val radarRange: Int,
            val afterburnerSpeed: Int,
    )
    : Spaceship(name, speed) {

        fun handleDataBurnRadar() {
            println("$name: обработка данных")
        }

        fun runAfterBurn() {
        println("$name: запуск двигателей")
        }
}