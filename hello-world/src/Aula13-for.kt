import java.util.*
import kotlin.collections.HashMap

fun main(args: Array<String>){

    for (numero in 1..6) {
        println("for: $numero")
    }

    args.forEach { println("com foreach $it") }

    for (argumento in args) {
        println("argumento $argumento")
    }

    for(letra in 'A'..'Z') {
        print("$letra, ")
    }

    println()

    val dicionario = HashMap<String, String>()
    dicionario.putAll(Arrays.asList(
        Pair("House", "Casa"),
        Pair("Color", "Cor"),
        Pair("Sun", "Sol"),
        Pair("Yellow", "Amarelo"),
        Pair("Sunday", "Domingo")
    ))

    for ((key, traducao) in dicionario) {
        println("$key - $traducao")
    }
    println()

    //Exemplo de uso da classe PAIR
    val par = Pair(1, "A")
    println("first ${par.first} second ${par.second}")
}