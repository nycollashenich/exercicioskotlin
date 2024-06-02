// Classe e objetos

class pessoa(val nome: String, val idade: Int)

fun main(){
    val pessoa = pessoa("João", 30)
    println("Nome: ${pessoa.nome}")
    println("Idade: ${pessoa.idade}")
}