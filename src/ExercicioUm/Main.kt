package ExercicioUm

fun main() {
    val caixa2 = Caixa()
    menu(caixa2)
}
fun menu(caixa2: Caixa) {

    println("1- Cadastrar os produtos")
    println("2- Exibir Produtos")
    println("3- Calcular a Compra")
    println("4- Sair")
    val opcao = readln().toInt()

    when(opcao){
        1 -> {
            caixa2.cadastrarProdutos()
            menu(caixa2)
        }
        2 -> {
            caixa2.exibirProdutos()
            menu(caixa2)
        }
        3-> {
            caixa2.valorProdutos()
            menu(caixa2)
        }

        else -> {
            println("\n Opção Inválida \n")
            menu(caixa2)
        }
    }
}
