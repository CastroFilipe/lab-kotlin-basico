fun main(){

    var valor: Int = 0
    var somatorio: Int = 0
    var iteracoes: Int = 0

    while (valor >= 0) {
        println("Digite um número inteiro ou -1 para sair")
        valor = readLine()!!.toInt()

        if(valor > 0){
            somatorio += valor
            iteracoes++
        }
    }

    println("Somatório $somatorio. A média das temperaturas informadas é ${(somatorio.toDouble()/iteracoes)}")

    var contador: Int = 0
    while (contador < 5) {
        contador++
        println("contador : $contador")
    }

}