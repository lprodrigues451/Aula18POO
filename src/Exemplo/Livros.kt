package Exercicio.ExercicioDois

class Livros (
    tituloParamentro:String,
    qtdPaginasParametro: Int,
    paginasLidasParametro:Int
        ){
    var titulo: String = tituloParamentro
    var qtdPaginas : Int = qtdPaginasParametro
    var paginasLidas: Int = paginasLidasParametro
    var listaLivro: ArrayList<Livros> = ArrayList()

    fun verificarProgresso(){
        var porcentagem: Double = (paginasLidas *100/ qtdPaginas).toDouble()
        println("Você ja leu $porcentagem por cento do livro")
    }

    fun lerNomePagina(){
        println("O livro ${titulo} possui ${qtdPaginas} páginas")
    }

    fun inserirLivros(livros: Livros) {
        listaLivro.add(livros)
    }

    fun exibirLivros() {
        listaLivro.forEach {
            it.lerNomePagina()
            it.verificarProgresso()
        }

    }

}

