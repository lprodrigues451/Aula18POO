package ExercicioTres

class Aluno(quantidadeParametro: Int) {
    private var soma: Double = 0.0
    var media: Double = 0.0
   /* get() {
        println("Media é :")
        return field
    }*/
    private var quantidadeDeAluno = quantidadeParametro
    val notaDoAlunoPrimeiro = DoubleArray(quantidadeDeAluno)

    init {
        println("--------------------------------------------------")
        println("Olá professor(a), Bem vindo(a) ao CalMediaLP   ")
        println("--------------------------------------------------")
    }

    private fun digitarNotasAluno() {


        for (i in notaDoAlunoPrimeiro.indices) {

            do {
                println("Por favor informe a ${i + 1} nota do aluno: ")
                notaDoAlunoPrimeiro[i] = readln().toDouble()

                if (notaDoAlunoPrimeiro[i] !in 0.0..10.0) {
                    println("A nota deve ser entre 0 e 10")
                }
            } while (notaDoAlunoPrimeiro[i] !in 0.0..10.0)

        }
        calcularMedia()
    }

    private fun calcularMedia() {

        notaDoAlunoPrimeiro.forEach { i ->
            soma += i
        }
        val menu = Menu()
        media = soma / 4
        println("-----------------------------")
        println("Média do aluno : $media")
        println("-----------------------------")
        menu.menuSairOuCalculo()
    }

    fun notasAlunos() {
        digitarNotasAluno()

    }
}
