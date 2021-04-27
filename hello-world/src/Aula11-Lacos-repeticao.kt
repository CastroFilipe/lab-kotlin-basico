fun main(){
    for (numero in 1..6) {
        println("for: $numero")
    }

    var contador: Int = 0
    while (contador < 5) {
        contador++
        println("contador : $contador")
    }

    do {
        contador++
        println("do while contador: $contador")
    } while (contador < 10)
}