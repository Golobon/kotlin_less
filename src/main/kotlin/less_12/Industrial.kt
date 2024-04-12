package less_12

class Industrial(name: String,
                 speed: Int,
                 val numberOfMiners: Int,
    )
    : Spaceship(name, speed, unmanned = true) {

        fun launchScanningDrones() {
            println("$name: зканирующие дроны запущены")
        }
    override fun runSystemDiagnistic() {
        super.runSystemDiagnistic()
        println("$name: запуск диагностики дронов и майнеров")
    }

}