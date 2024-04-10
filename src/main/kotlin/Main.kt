import kotlin.jvm.internal.Intrinsics.Kotlin

const val AGE1 = 5
const val AGE2 = 20

fun main(args: Array<String>) {
    val dd : Boolean

    val int1 = 4; var int2 = 4

    val result = if (int2 > int2) "ddd" else "ff"

    val x = when (readln()!!.toInt()) {
        10 -> {
            "10".chars(); println("dd");
        }
        20 -> "20"
        30 -> "30"
        else -> "Her"
    }
    println(x::toString)
    kotlin.Unit
}

