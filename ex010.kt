fun main(){
    val nome: String? = null
    val saudacao =  nome?: "Usuário desconhecido"
    println("Olá $saudacao")
}