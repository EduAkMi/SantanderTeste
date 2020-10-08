fun main() {
    println("Exercício 1")
    val inteiros = arrayListOf(1, 20, 5)
    println(inteiros.max())
    println("Exercício 2")
    val texto1 = "Primeiro Texto"
    val texto2 = "Segundo Texto"
    println(texto1 == texto2)
    println("Exercício 3")
    val inteiro = 3
    println(inteiro % 2 == 0)
    println("Exercício 4")
    for(num in 0..99 step 2){
        println(num + 1)
    }
}