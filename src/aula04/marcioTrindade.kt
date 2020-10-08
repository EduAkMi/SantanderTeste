fun main() {
//Ex 1
    var list= listOf(1,2,3)
    var maior = 0
    for(i in list){
        maior = i
    }
    println(maior)
//Ex 2
    val frase1 = "frase 1"
    val frase2 = "frase 2"
    println(frase1==frase2)
// Ex 3
    var num = 5
    println(num%2==0)
// Ex 4
    for(i in 1..100){
        if (i%2>0){
            println(i)
        }
    }
//Ex 5
    var numA = 1
    var numB = 2
    var numC = 3
    var numD = 4
    if (numA > numC && numA > numD || numB > numC && numB > numD) {
        println(true)
    } else {
        println(false)
    }
//Ex 6
    for (i in 1..100){
        println(i)
    }
}