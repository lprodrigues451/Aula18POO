package ExercicioTres

import kotlin.system.exitProcess

class Menu {
    private var digitaDois: Int = 0
    private var digita: Int = 0

    private var aluno2 : Aluno = Aluno(4)
    private fun about(){
        println("CalMediaLP  \n" +
                "criado em 20 de abril 2022\n" +
                "Versão: 1.1 \n" +
                "Atualizado em : 29 de abril de 2022\n"+
                "Desenvolvedor: Luiz Paulo Rodrigues.\n"+
                "Linguagem ultilizada: Kotlin")
        menuDeVolta()
    }

    private fun menuDeVolta(){

        println("\n1 - Volta / 2- Fechar o programa")
        digitaDois = readln().toInt()

        while (digitaDois != 1 && digitaDois !=2 ){
            println("O valor digitado está incorreto")
            println("Por favor digite novamente")
            println("\n 1 - Volta / 2- Fechar o programa")
            digitaDois = readln().toInt()
        }
        when(digitaDois){
            1 -> menuSairOuCalculo()
            2 -> {
                println("\nObrigado por utilizar o sitema!")
                exitProcess(0)
            }
        }
    }
    fun menuSairOuCalculo(){

        println("\nNovo cálculo (1- sim / 2- não/ 3- About)")
        digita = readln().toInt()

        while (digita != 1 && digita!=2 && digita!= 3){
            println("ATENÇÃO!")
            println("O valor digitado está incorreto")
            println("Por favor digite novamente")
            println("\nNovo cálculo (1- sim / 2- não/ 3- About)")
            digita = readln().toInt()
        }
        when(digita){
            1 -> aluno2.notasAlunos()
            2 -> {
                println("Obrigado por utilizar o sitema!")
                exitProcess(0)
            }
            3 -> about()
        }
    }
}