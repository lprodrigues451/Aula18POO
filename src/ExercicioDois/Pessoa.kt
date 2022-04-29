package ExercicioDois

import java.time.LocalDate
import java.time.LocalDateTime

class Pessoa {
    var idade : Int = 0
    private var dia : Int = 0
    private var mes : Int = 0
    private var ano : Int = 0
    var nome: String = ""

    fun calculaIdade():Int{
        val diaHoje = LocalDate.now().dayOfMonth
        val mesHoje = LocalDate.now().monthValue
        val anoHoje = LocalDate.now().year

        if (mes < mesHoje){
            idade = anoHoje - ano

        }else if (mes == mesHoje){
            if (dia <= diaHoje){
                idade = anoHoje - ano
            } else {
                idade = (anoHoje-1) - ano
            }

        } else if (mes > mesHoje ){
            idade = (anoHoje-1) - ano
        }
        return idade
        //var date2 = LocalDate.now();
    }

    fun informarIdade(idade: Int){
        println("Hoje teria $idade anos")
    }

    fun informarNome(){
        //var date = LocalDateTime.now();
        println(nome)
    }

    fun ajustaDataDeNascimentos (diaInformado: Int, mesInformado: Int, anoInformado: Int){
        dia = diaInformado
        mes = mesInformado
        ano = anoInformado
        println("nascido em ${dia}/${mes}/${ano}")

    }
}