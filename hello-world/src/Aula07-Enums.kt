enum class Color(val red: Int, val green: Int, val blue: Int) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    BLACK(0, 0, 0);

    fun rgbToDecimal(): Int = ((red * 256 + green) * 256 + blue)
}

fun main(){
    val decimalRed = Color.RED.rgbToDecimal()
    println(decimalRed)
}