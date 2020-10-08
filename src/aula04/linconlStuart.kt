fun main() {
    //1
    val n1 = 50
    val n2 = 20
    val n3 = 30
    var numeroMaior = n1
    if (numeroMaior < n2) {
        numeroMaior = n2
    }
    if (numeroMaior < n3) {
        numeroMaior = n3
    }
    println(numeroMaior)
//2
    val t1 = "teste"
    val t2 = "teste"
    val resposta = t1 != t2
    println(resposta)
//3
    val par = 2
    val ehPar = par % 2 == 0
    println(ehPar)
//4
    for (num in 1 until 100 step 2) {
        println(num)
    }
}