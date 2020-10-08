fun main() {
    var num1 = 5
    var num2 = 7
    var num3 = 3
    if(num1 > num2 && num1 > num3){ 
        println("maior numero é $num1")
    }
    else if(num2 > num1 && num2 > num3){ // SUGESTÃO: REMOVER REDUNDÂNCIA DE VERIFICAÇÃO
        println("maior numero é $num2")
    }
    else if(num3 > num1 && num3 > num2)
    {
        println("maior numero é $num3")
    }
    var txt1 = "textoqualquer"
    var txt2 = "algumacoisa"
    if(txt1 != txt2){
        println(true)
    }
    else{
        println(false)
    }
    var numeroInteiro = 10
    if(numeroInteiro % 2 == 0)
    {
        println(true)
    }
    else{
        println(false)
    }
    for (num in 1..100)
    {
        if(num % 2 != 0){
            println(num)
        }
    }
}