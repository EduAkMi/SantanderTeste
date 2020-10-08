package aula04

fun main() {
    //1
    val numeros = arrayListOf("1", "2", "3")
    val ordenado = numeros.sortedDescending()
    println(ordenado[0])
    //2
    val frase1 = "Oi cadeia de texto"
    val frase2 = "Oi cadeia de texto"
    if (frase1 == frase2) {
        println("false")
    } else if (frase1 != frase2) {
        println("true")
    }
    //3
    val numeroInteiro = 11
    if (numeroInteiro % 2 == 0) {
        println("par")
    } else {
        println("impar")
    }
    //4
    for (num in 1..100) {
        if (num % 2 != 0) {
            println(num)
        }
    }
}