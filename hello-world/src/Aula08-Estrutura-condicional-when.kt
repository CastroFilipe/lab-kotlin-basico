fun traduzir(cor: Color) =
    when (cor) {
        Color.RED -> "Vermelho"
        Color.GREEN -> "Verde"
        Color.BLUE -> "Azul"
        Color.ORANGE -> "Laranja"
        Color.YELLOW -> "Amarelo"
        Color.BLACK -> "Preto"
    }

fun obterTemperatura(cor: Color): String{
    return when(cor) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "Quente"
        Color.BLUE, Color.GREEN -> "Fria"
        Color.BLACK -> "Neutra"
    }
}

fun main(){
    printInfo(Color.GREEN)
    printInfo(Color.BLACK)
}

fun printInfo(cor: Color){
    print("Tradução de ${cor.name} é ${traduzir(cor)}, ")

    println("sendo considerada uma cor de temperatura ${obterTemperatura(cor)}")
}