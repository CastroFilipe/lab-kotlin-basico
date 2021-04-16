class Retangulo(
    val altura: Int,
    val largura: Int
) {
    val isQuadrado: Boolean
        get() = altura == largura

    fun isNotQuadrado(): Boolean {
        return altura != largura
    }
}

fun main(){
    val figura1 = Retangulo(11, 10)
    val figura2 = Retangulo(11,12)

    if (figura1.isQuadrado) println("figura1 é Quadrado") else println("figura1 é retangulo")
    if (figura2.isNotQuadrado()) println("figura2 não é Quadrado") else println("figura2 é Quadrado")
}
