package Kotlin

class Pessoa {
var nome: String = " Gilberto "
var cpf: String = "95614354620"

inner class Endereco {


    var rua : String = "teste"
}
}
fun main () {

    val Gilberto = Pessoa()
    println(Gilberto.nome)
    println(Gilberto.cpf)

    println(Gilberto.Endereco () )
}