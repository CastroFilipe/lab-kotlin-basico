class Retangulo(
    val altura: Int,
    val largura: Int
) {
// Acessor cutomizado(corpo de bloco)
//    val isQuadrado: Boolean
//        get() {
//            return altura == largura
//        }

// Acessor customizado Simplificado(corpo de expressão)
    val isQuadrado get() = altura == largura

    //Função com estrutura equivalente ao acessor customizado
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
