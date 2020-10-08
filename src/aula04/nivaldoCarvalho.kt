fun main() {
    // questão 01
    val tresInteiros = arrayListOf(60, 194, 2)
    println("1) o maior número de $tresInteiros é: ${tresInteiros.max()}")
    //  questão 02
    val palavra1 = "alface"; val palavra2 = "banana"
    println("2) `$palavra1` é diferente de `$palavra2`? ${palavra1 != palavra2}")
    // questão 03
    val numeroInteiro = 145
    println("3) $numeroInteiro é par? ${numeroInteiro % 2 == 0}")
    // questão 04
    val primeirosCemImpares = (1..100).filter { n -> n % 2 != 0 }
    println("4) primeiros 100 ímpares: $primeirosCemImpares")
    // questão 05
    val numA = 25; val numB = 24; val numC = 23; val numD = 22
    val resultado = ((numA > numC) && (numA > numD)) || ((numB > numC) && (numB > numD))
    println("5) $numA é maior que $numC e $numD OU $numB é maior que $numC e $numD? $resultado")
    // questão 06
    val primeirosCemPositivos = (1..100).toList()
    println("6) primeiros 100 positivos: $primeirosCemPositivos")
}