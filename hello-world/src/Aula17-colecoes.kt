import java.util.Arrays

fun main(){
    //ArraysList Java
    val frutas1 = Arrays.asList("Maçã", "Banana", "Laranja")

    //ArraysList Java
    val frutas2 = ArrayList<String>()
    frutas2.add("Mamão")
    frutas2.add("Uva")

    //ArraysList Kotlin
    val frutas3 = arrayListOf("Maçã", "Banana", "Laranja")

    println("última fruta: ${frutas3.last()}")

    //Conjunto
    val conjuntoNumeros = setOf(10, 29, 43, 21, 32)

    println("Maior número ${conjuntoNumeros.maxOrNull()}")
    println("Menor número ${conjuntoNumeros.minOrNull()}")
}