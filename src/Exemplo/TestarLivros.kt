package Exercicio.ExercicioDois

fun main() {
    val livroFavorito : Livros = Livros("", 0, 0)

    livroFavorito.titulo = "O Pequeno Príncipe"
    livroFavorito.qtdPaginas = 98
    println("O livro ${livroFavorito.titulo} possui ${livroFavorito.qtdPaginas} páginas")
    livroFavorito.paginasLidas= 20
    livroFavorito.verificarProgresso()
    livroFavorito.paginasLidas= 50
    livroFavorito.verificarProgresso()

    for(i: Int in 1 .. 2){

        println("Por favor informe o nome do ${i} livro ")
        var nomeLivroDigitado = readln()
        println("Por favor informe a quantidade de página tem o $nomeLivroDigitado")
        var qtdPaginasDigitada = readln().toInt()
        println("Quantas páginas lidas até agora?")
        var paginasLidasDigitada = readln().toInt()

        var livroCadastrado = Livros(nomeLivroDigitado, qtdPaginasDigitada, paginasLidasDigitada)

        livroFavorito.inserirLivros(livroCadastrado)
    }

    livroFavorito.exibirLivros()

}