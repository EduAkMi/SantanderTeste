fun main() {
//    1) Escrever o código que deve analisar três números inteiros e retornar o maior deles.
//    2) Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.
//    3) Escrever o código que deve analisar um número inteiro e, caso ele seja par, retornar true, caso contrário, retorna false.
//    4) Escrever um programa que imprima na tela os primeiros 100 números inteiros positivos ímpares.
//    5) Escrever um código que deve analisar quatro números inteiros e, caso numA seja maior que numC e numD
//       ou caso numB seja maior que numC e numD, retornar true, caso contrário, retornar false.
//    6) Escrever um programa que exiba os primeiros 100 números positivos.

    ex1(10, 20, 30)
//    ex2("text1", "text1")
//    ex3(32)
//    ex4()
//    ex5(40, 14, 72, 34)
//    ex6()
}

fun ex1(x: Int, y: Int, z: Int) {
    if (x > y && x > z)
        println("O maior número é: $x")
    else if (y > z)
        println("O maior número é: $y")
    else
        println("O maior número é: $z")
}

fun ex2(text1: String, text2: String) {
    if (text1 == text2)
        println(true)
    else
        println(false)
}

fun ex3(number: Int) {
    if (number % 2 == 0)
        println(true)
    else
        println(false)
}

fun ex4() {
    var count = 0
    var numbers = 0
    while (count != 100) {
        if (numbers % 2 != 0) {
            count++
            println("$count: $numbers")
        }
        numbers++
    }
}

fun ex5(numA: Int, numB: Int, numC: Int, numD: Int) {
    if ((numA > numC && numA > numD) || (numB > numC && numB > numD))
        println(true)
    else
        println(false)
}

fun ex6() {
    var numbers = 0
    do {
        numbers++
        print("$numbers ")
    } while (numbers < 100)
}