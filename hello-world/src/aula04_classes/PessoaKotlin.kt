package aula04_classes

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
}