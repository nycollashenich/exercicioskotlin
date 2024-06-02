fun main(){
    val pessoas = mapOf("Alice" to 25, "Bob" to 30, "Lery" to 50)

    for ((nome, idade) in pessoas) {
        println("$nome tem $idade anos")
    }
}
