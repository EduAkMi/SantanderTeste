fun main() {
    val livraria = Biblioteca("Biblioteca Palas Atena", "23/09/2020")
    println("A biblioteca ${livraria.nome} , foi inaugurada no dia ${livraria.dataDeCriacao}")
    val livro1 = Livro(111, "The Phoenix Project: A Novel About IT, DevOps, and Helping Your Business Win", "Gene Kim, Kevin Behr, George Spafford", 2013, 62.16, 2.30, "Alugado")
    val livro2 = Livro(222, "O Mundo de Sofia", "Jostein Gaarder", 1995, 33.10, 1.30, "Vendido")
    val livro3 = Livro(333, "Otelo", "William Shakespeare", 2013, 18.00, 1.00, "Disponível")
    val livro4 = Livro(444, "A tempestade", "William Shakespeare", 2002, 23.40, 1.00, "Disponível")
    livraria.cadastrarLivro(livro1)
    livraria.cadastrarLivro(livro2)
    livraria.cadastrarLivro(livro3)
    livraria.cadastrarLivro(livro4)
    println("------*-----")
    val colecao1 = Colecao("Box Grandes obras de Shakespeare")
    livraria.cadastrarColecao(colecao1, livro3)
    livraria.cadastrarColecao(colecao1, livro4)
    livraria.consultar(111)
    println("------*-----")
    val cliente1 = Cliente("Márcia Valente", "35.489.842-4")
    val cliente2 = Cliente("Lucas Bonavides Souza", "84.665.335-7")
    val cliente3 = Funcionario("Sandra Silvanas Moreira", "V654878-R")
    val cliente4 = Funcionario("Julio Moreira", "74.888.556-7")
    livraria.alugar(livro1, cliente1)
//    livraria.alugar(livro2, cliente1)
//    println("------*-----")
//    livraria.efetuarVenda(livro4, cliente2)
//    println("------*-----")
    //livraria.verificarEstoque()
}

class Biblioteca(var nome: String, var dataDeCriacao: String) {
    //var mapDeColecao = mapOf() para que o consultar acesse o map basta declarar aqui na classe ao invés de dentro da função, mas não sei como declarar os tipos genericos de classe
    // val colecao =  mapOf(Cliente to Livro)
    var listaDeLivros = mutableListOf<Livro>()
    fun cadastrarLivro(livro: Livro) {
        listaDeLivros.add(livro)
        println("${livro.codigo}  ${livro.titulo}  ${livro.autor} ${livro.anoDeLancamento}  ${livro.precoDeVenda}  ${livro.precoDeAluguel} ${livro.estadoAtual}")
    }

    fun cadastrarColecao(colecao: Colecao, livro: Livro) {
        var mapDeColecao = mapOf(colecao to livro)
        println(mapDeColecao.map { (colecao, livro) -> "Coleção:  ${colecao.nome}  - Livro   ${livro.titulo} (${livro.codigo})" })
    }

    fun consultar(codigo: Int) {
        //println(colecao.contains(codigo))
    }

    fun alugar(livro: Livro, cliente: Cliente) {
        var mapDeAluguel = mapOf(cliente to livro)
        println("Entries: " + mapDeAluguel.entries)
        println("Keys:" + mapDeAluguel.keys.forEach { client -> client.nome })
//        println("Values:" + mapDeAluguel.values)
        print("Keys: ")
        mapDeAluguel.keys.forEach { client -> println(client.nome) }
        print("Values: ")
        mapDeAluguel.values.forEach { book -> println(book.titulo) }
        mapDeAluguel.forEach { (k, v) -> println("There are ${v.titulo} ${k.nome}") }
//        println(mapDeAluguel.map { (Livro, Cliente) -> "  ${cliente.nome}  - Livro   ${livro.titulo} (${livro.codigo})" })
//        println(mapDeAluguel.map { (Livro, Cliente) -> "  ${cliente.nome}  - Livro   ${livro.titulo} (${livro.codigo})" })
        println("------*-----")
        livro.estadoAtual = "Alugado"
        println("Estado do Livro ${livro.titulo} (${livro.codigo}) foi alterado para ${livro.estadoAtual} ")
//       if(livro.estadoAtual.equals('Disponível')) {
//           print("Livro ${livro.codigo} alugado com sucesso")
//       }else{
//           print("Livro ${livro.codigo} está ${livro.estadoAtual}")
//       }
    }

    fun efetuarVenda(livro: Livro, cliente: Cliente) {
        var mapDeVenda = mapOf(cliente to livro)
        println(mapDeVenda.map { (Livro, Cliente) -> "  ${cliente.nome}  - Livro   ${livro.titulo} (${livro.codigo})" })
        println("------*-----")
        livro.estadoAtual = "Vendido"
        println("Estado do Livro   ${livro.titulo} (${livro.codigo}) foi alterado para ${livro.estadoAtual} ")
//       if(livro.estadoAtual.equals('Disponível')) {
//           print("Livro ${livro.codigo} alugado com sucesso")
//       }else{
//           print("Livro ${livro.codigo} está ${livro.estadoAtual}")
//       }
    }

    fun verificarEstoque(colecao: Colecao) {
        var disponiveis: Int = 0
        var alugados: Int = 0
        var vendidos: Int = 0
        var totalValor: Double = 0.0
//        colecao.estadoAtual.forEach{
//          if(livro.estadoAtual=='Disponível') {
//             disponiveis++
//          }elseif(livro.estadoAtual=='Alugados') {
//              alugados++
//          }elseif(livro.estadoAtual=='Vendidos') {
//                vendidos++
//                totalValor += livro.precoDeVenda
//          }
//    }
//       println("Livros disponíveis é de  $disponiveis")
//       println("Livros alugados é de  $alugados")
//       println("Livros vendidos é de  $vendidos, no total de $totalValor")
    }
}

class Livro(var codigo: Int, var titulo: String, var autor: String,
            var anoDeLancamento: Int, var precoDeVenda: Double, var precoDeAluguel: Double, var estadoAtual: String)

class Colecao(var nome: String)
open class Usuario(val nome: String, val rg: String)
class Cliente(nome: String, rg: String) : Usuario(nome, rg)
class Funcionario(nome: String, rg: String) : Usuario(nome, rg)