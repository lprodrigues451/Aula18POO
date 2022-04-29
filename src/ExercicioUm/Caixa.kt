package ExercicioUm
import ExercicioUm.Produto.Exibir.inserir
import ExercicioUm.Produto.Exibir.listaProduto


class Caixa() {
    var soma = 0.0
    init {
        println("Bem vindo")
    }

    fun cadastrarProdutos(){

        println("Informe quantidade do produto:")
        val quantidadeDigitado = readln().toInt()

        for (i: Int in 1..quantidadeDigitado) {
            println("Informe o nome do produto: ")
            val nomeProdutoDigitado = readln()
            println("Informe o valor do $nomeProdutoDigitado ")
            val valorDigitado = readln().toDouble()
            println("Informe a quantidade de produto: ")
            val qtdDoProdutoDigitado = readln().toDouble()
            val produtoCadastrado = Produto(nomeProdutoDigitado, valorDigitado, qtdDoProdutoDigitado)
            inserir(produtoCadastrado)
            soma += valorDigitado * qtdDoProdutoDigitado
        }


    }
    fun exibirProdutos() {
        listaProduto.forEach {
            it.lerProdutos()
        }

    }

    fun valorProdutos(){
        println(soma)
    }

}
