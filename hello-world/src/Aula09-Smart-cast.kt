interface Expressao

class Numero(val valor: Int): Expressao

class Soma(val esquerdo: Expressao, val direito: Expressao): Expressao

fun avaliar(expressao: Expressao): Int {

    //Smartcast
    if(expressao is Numero){
        return expressao.valor
    }

    //SmartCast
    if(expressao is Soma){
        return avaliar(expressao.esquerdo) + avaliar(expressao.direito)
    }

    throw IllegalAccessException("Expressão não conhecida")
}

fun main(){
    //((2+(3+2)) + 4) = 9
    val resultado = avaliar(Soma(Soma(Numero(2), Soma(Numero(3),Numero(2))), Numero(4)))
    println(resultado)
}


