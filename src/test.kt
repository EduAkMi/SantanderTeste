fun main() {
    // 10 10 5
    val primeiroNumero = 10
    val segundoNumero = 20
    val terceiroNumero = 20
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

    if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
        println("O $primeiroNumero é maior que $segundoNumero e que o $terceiroNumero")
    } else if (segundoNumero > terceiroNumero) {
        println("O $segundoNumero é maior que $primeiroNumero e que o $terceiroNumero")
    } else if (terceiroNumero > primeiroNumero) {
        println("O $terceiroNumero é maior que $primeiroNumero e que o $segundoNumero")
    } else {
        println("Os números são iguais")
    }
}