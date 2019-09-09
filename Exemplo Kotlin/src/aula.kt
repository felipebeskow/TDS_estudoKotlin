fun main() {
    println("Ola Mundo!!!")
    val a=2
    val b=3
    println("A soma de $a mais $b é ${SOMA(a,b)}")

    val andorinha = Passaro("andorinha")
    andorinha.falar()
}

fun SOMA(a:Int,b:Int):Int{
    return a + b
}

class Passaro{
    var especie:String

    constructor(especie:String){
        this.especie = especie
    }

    fun falar(){
        println("Eu sou um Passaro da Especie $especie")
    }
}