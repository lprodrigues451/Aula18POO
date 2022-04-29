package ExercicioUm

import Exercicio.ExercicioDois.Livros

class Produto (
    nomeProdutoParametro:String,
    valorTotalProdutoParametro:Double,
    quantidadeProdutoParametro: Double,
        ){
    var nomeProduto : String = nomeProdutoParametro
    var quantidadeProduto = quantidadeProdutoParametro
    var valorTotalProduto = valorTotalProdutoParametro
    fun lerProdutos(){

        println("Produto cadastrado: $nomeProduto\n" +
                "Valor do Produto: $valorTotalProduto\n" +
                "Quantidade produto: $quantidadeProduto\n")

    }
    companion object Exibir{
        var listaProduto: ArrayList<Produto> = ArrayList()
    fun inserir(produto1: Produto){
        listaProduto.add(produto1)
    }
}


}

