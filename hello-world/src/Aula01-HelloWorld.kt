fun main(){
    println("Hello World!")
    println(max(10,11))
    println(min(20,7))
}

//Função com corpo de bloco
fun max(num1: Int, num2: Int): Int {
    return if (num1 > num2) num1 else num2
}

//Função com corpo de expressão. Obs: Indicar o tipo retornado é opcional
fun min(num1: Int, num2: Int): Int = if (num1 > num2) num2 else num1