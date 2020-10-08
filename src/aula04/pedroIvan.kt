fun main() {
//    var listNumbers = arrayListOf(5, 3, 2)
//    var maior = -1
//    for (num in 0..2) {
//        if (maior < listNumbers[num]) {
//            maior = listNumbers[num]
//        }
//    }
//    println(maior)
    //EX 2
//    var nome1 = "Texto1"
//    var nome2 = "Texto1"
//    if (nome1 == nome2) {
//        println(true)
//    } else {
//        println(false)
//    }
//    //EX 3
//    var numeroInteiro = 5
//    if (numeroInteiro % 2 == 0) {
//        println(true)
//    } else {
//        println(false)
//    }
//    //EX 4
//    var listNumeros = arrayListOf<Int>()
//    var number = 0
//    while (number <= 100) {
//        if (number % 2 == 1) {
//            listNumeros.add(number)
//        }
//        number++
//    }
//    println(listNumeros)
//    //EX 5
//    var listNum = arrayListOf<Int>(1, 2, 3, 4)
//    if ((listNum[0] > listNum[2] && listNum[0] > listNum[3]) || (listNum[1] > listNum[2] && listNum[1] > listNum[3])) {
//        println(true)
//    } else {
//        println(false)
//    }
//    //EX 6
    var listNumerosPositivos = arrayListOf<Int>()
    var numberPos = -50
    while (numberPos <= 50) {
        if (numberPos >= 0) {
            listNumerosPositivos.add(numberPos)
        }
        numberPos++
    }
    println(listNumerosPositivos)
}