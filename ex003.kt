fun main(){
    println("Insira um valor: ")
    val num = readln().toInt()

    if (num > 0){
        println("O número é positivo")
    } else if (num < 0){
        println("O número é negativo")
    } else {
        println("O número é zero!")
    }
}
