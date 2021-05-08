package aula04_classes

// Não existe distinção entre um importe de uma classe ou função
import aula04_classes.bipolar.JavaKotlin
import aula04_classes.bipolar.printLanguageInfo

class PessoaKotlin (
    val name: String,
    val age: Int
)

fun main(){
    val pessoa1: PessoaKotlin = PessoaKotlin("Filipe", 21)
    val pessoa2 = PessoaKotlin("Douglas", 25)
    val pessoa3 = PessoaJava("Paula", 35)

    println("Nome ${pessoa1.name} age ${pessoa1.age}")
    println("Nome ${pessoa2.name} age ${pessoa2.age}")
    println("Eu vim do Java. Nome ${pessoa3.name} age ${pessoa3.age}")
    println(pessoa3)

    val pessoa4 = pessoa3.pessoaKotlin
    println("Eu sou Kotlin, mas fui gerado no java --' kkk. Nome ${pessoa4.name} age ${pessoa4.age}")

    println("##############")

    val java = JavaKotlin("Java", 1995)
    val kotlin = JavaKotlin("Kotlin", 2016)
    printLanguageInfo(java)
    printLanguageInfo(kotlin)
}