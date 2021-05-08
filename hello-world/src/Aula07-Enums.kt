enum class Color(private val red: Int, private val green: Int, private val blue: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    BLACK(0, 0, 0);

    fun rgbToDecimal(): Int = ((red * 256 + green) * 256 + blue)
}

enum class Week(){
    SEG, TER, QUA, QUI, SEX, SAB, DOM
}

fun main(){
    val decimalRed = Color.RED.rgbToDecimal()
    println(decimalRed)

    println(Week.DOM)
}