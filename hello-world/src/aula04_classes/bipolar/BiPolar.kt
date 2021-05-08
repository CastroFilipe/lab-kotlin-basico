package aula04_classes.bipolar

class JavaKotlin(
    val nome: String,
    val anoLancamento: Int
)

fun printLanguageInfo(obj: JavaKotlin){
    println("A linguagem ${obj.nome} foi lançada em ${obj.anoLancamento}")
}