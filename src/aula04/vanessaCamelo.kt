package aula04

fun main() {
//    1) Escrever o código que deve analisar três números inteiros e retornar o maior deles.
    val primeiroNumero = 7
    val segundoNumero = 3
    val terceiroNumero = 23
    //Usando if
    if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
        println("O $primeiroNumero é maior que $segundoNumero e que o $terceiroNumero")
    } else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
        println("O $segundoNumero é maior que $primeiroNumero e que o $terceiroNumero")
    } else if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
        println("O $terceiroNumero é maior que $primeiroNumero e que o $segundoNumero")
    } else {
        println("Os números são iguais")
    }
    //Usando when
    when {
        primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero -> println("O $primeiroNumero é maior que $segundoNumero e que o $terceiroNumero")
        segundoNumero > primeiroNumero && segundoNumero > terceiroNumero -> println("O $segundoNumero é maior que $primeiroNumero e que o $terceiroNumero")
        terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero -> println("O $terceiroNumero é maior que $primeiroNumero e que o $segundoNumero")
        else -> println("Os números são iguais")
    }
    //Usando maxOf()
    println("O ${maxOf(primeiroNumero, segundoNumero, terceiroNumero)} é o maior número")
    //Usando max() deprecated
    //Array
    val numeros = arrayOf(primeiroNumero, segundoNumero, terceiroNumero)
    //Usando max() deprecated
    //Usando maxOrNull
    println("O ${numeros.maxOrNull()} é o maior número")
    //Usando maxOf
    println("O ${numeros.maxOf { it }} é o maior número")

//    2) Escrever o código que deve analisar duas cadeias de texto e, caso sejam diferentes, retornar true, ou, caso sejam iguais, retornar false.
    val primeiraString = "Apolo"
    val segundaString = "música"
    //Usando equals
    println("$primeiraString é igual a $segundaString? '  ${primeiraString.equals(segundaString, false)}")
    //Usando equals e if
    if (primeiraString.equals(segundaString)) {
        println("As Strings são iguais")
    } else {
        println("As Strings são diferentes")
    }
    //Usando apenas if
    if (primeiraString == segundaString) {
        println("As Strings são iguais")
    } else {
        println("As Strings são diferentes")
    }
    //Usando compareTo
    println("$primeiraString é igual a $segundaString? '  ${primeiraString.compareTo(segundaString, true) == 0}")

    //3) Escrever o código que deve analisar um número inteiro e, caso ele seja par, retornar true, caso contrário, retorna false.
//    val numero = 6
//    //Usando if comum
//    if (numero % 2 == 0) {
//        println(true)
//    } else {
//        println(false)
//    }
//    //Usando if direto
//    println(if (numero % 2 == 0) true else false)
//    //Usando if e rem
//    println(if (numero.rem(2) == 0) true else false)
////4) Escrever um programa que imprima na tela os primeiros 100 números inteiros positivos ímpares.
//    Usando while
//    var numerosImpares = 0
//    var contador = 0
//    while (contador <= 100) {
//        if (numerosImpares % 2 != 0) {
//            println(" ($contador) -  $numerosImpares")
//            contador++
//        }
//        numerosImpares++
//    }
//    //Usando for
//    val numImpares = 100
//    print(numImpares)
//    for (cont in 1..numImpares) {
//        if (cont % 2 != 0) {
//            print(cont)
//        }
//    }
//
//    //5) Escrever um código que deve analisar quatro números inteiros e, caso numA seja maior que numC e numD ou caso numB seja maior que numC e numD, retornar true, caso contrário, retornar false.
//    val numA = 7
//    val numB = 3
//    val numC = 23
//    val numD = 15
//    //Usando if
//    if ((numA > numC && numA > numD) || (numB > numC && numB > numD)) {
//        println(true)
//    } else {
//        println(false)
//    }
//    //Usando when
//    when {
//        (numA > numC && numA > numD) || (numB > numC && numB > numD) -> println(true)
//        else -> println(false)
//    }
//
//    //Usando while
//    var numero = 0
//    var contador = 0
//    while (contador <= 100) {
//        println("$numero")
//        contador++
//        numero++
//    }
//    //Usando for
//    val nume = 100
//    for (num in 1..nume) {
//        println("$num")
//    }
}