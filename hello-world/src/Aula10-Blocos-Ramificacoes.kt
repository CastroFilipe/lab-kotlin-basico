
fun avaliar2(exp: Expressao): Int =
    when(exp) {
        is Numero -> { //bloco
            println("Número ${exp.valor}")
            exp.valor
        }
        is Soma -> avaliar2(exp.esquerdo) + avaliar2(exp.direito)
        else -> throw IllegalAccessException("Expressão não conhecida")
    }

fun main(){
    //((2+3) + 4) = 9
    val resultado = avaliar2(Soma(Soma(Numero(2), Numero(3)), Numero(4)))
    println(resultado)
}


