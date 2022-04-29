package ExercicioDois

fun main() {
    val pessoaUm : Pessoa = Pessoa()
    pessoaUm.nome = "Albert Einstein"
    pessoaUm.informarNome()
    pessoaUm.ajustaDataDeNascimentos(14, 3, 1879)
    pessoaUm.informarIdade(pessoaUm.calculaIdade())

    //println("${pessoaUm.nome} (nascido em ${pessoaUm.dia}/${pessoaUm.mes}/${pessoaUm.ano})")
    println("\n-----------------------------------------------------------------------------\n")
    val pessoaDois : Pessoa = Pessoa()
    pessoaDois.nome = "Isaac Newton"
    pessoaDois.informarNome()
    pessoaDois.ajustaDataDeNascimentos(4,1,1643)
    pessoaDois.informarIdade(pessoaDois.calculaIdade())



}