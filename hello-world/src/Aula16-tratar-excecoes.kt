import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main(){
    println(lerIdade())
}

//retorna um inteiro ou nulo no caso de erro na leitura do arquivo
fun lerIdade(): Int?{
    val reader = FileReader(File("src/idades.txt"))
    val buffer = BufferedReader(reader)

    try {
        val numero = buffer.readLine()
        return numero.toInt()
    } catch (ex: NumberFormatException) {
        println("Não é um número")
        return null
    } finally {
        buffer.close()
    }
}