fun main(){
    val cidade = "Belém"
    val estado = "Pará"
    val valor1 = 10
    val valor2 = 30

    println("A cidade de " + cidade + " fica no " + estado)

    //com template string
    println("A cidade de $cidade fica no $estado")

    println("A soma de " + valor1 + " + " + valor2 + " é igual a "+ soma(10, 30))

    //com template string
    println("A soma de $valor1 + $valor2 é igual a ${soma(valor1, valor2)}")
}

fun soma(num1: Int, num2: Int) = num1 + num2