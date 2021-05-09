fun main(){
    println(porcentagem(20))
    println(porcentagem(100))
    println(porcentagem(200))
}

fun porcentagem(numero: Int) : String {
    return if (numero in 0..100) "$numero%" else throw IllegalArgumentException("Valor inválido. Deve ser entre 0 e 100")
}