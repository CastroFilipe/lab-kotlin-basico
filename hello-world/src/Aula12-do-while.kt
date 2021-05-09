fun main(){
    var valor: Int = 0
    var somatorio: Int = 0
    var iteracoes: Int = 0

    do {
        println("Digite um número inteiro ou -1 para sair")
        valor = readLine()!!.toInt()

        if(valor > 0){
            somatorio += valor
            iteracoes++
        }
    } while (valor >= 0)

    println("Somatório $somatorio. A média das temperaturas informadas é ${(somatorio.toDouble()/iteracoes)}")

    var contador: Int = 0
    do {
        contador++
        println("do while contador: $contador")
    } while (contador < 3)
}