package less_12
fun main() {
//    val ship = Spaceship("name",1000)
//    ship.runSystemDiagnistic()
//    ship.switchToWarpMode()

    val scout1: Scout = Scout("Scout1", 500, 100, 1000)
    scout1.runSystemDiagnistic()
    scout1.switchToWarpMode()
    scout1.runAfterBurn()
    scout1.handleDataBurnRadar()
    println(scout1.unmanned)
    println()

    val industrial1: Industrial = Industrial("industrial1", 500, 8)
    industrial1.runSystemDiagnistic()
    industrial1.switchToWarpMode()
    industrial1.launchScanningDrones()
    println(industrial1.unmanned)
    println()
}