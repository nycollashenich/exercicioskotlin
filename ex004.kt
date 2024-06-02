fun main(){
    for (i in -10..0){
        println(i)
    }

    println("TABUADA")
    print("Insira o valor: ")
    val valor = readLine()?.toIntOrNull()

    if (valor != null){
        for (i in 1..10){
            println("$valor X $i = ${valor * i}")
        }
    } else{
        println("Digite um valor válido.")
    }

}