fun main() {
    olamundoJava()
    val a=2
    val b=3
    println("A soma de $a e $b é ${soma(a,b)}")
}

fun olamundo(){
    println("Ola Mundo!!!")
}

fun soma(a:Int, b:Int) : Int {
    return a + b
}

fun olamundoJava(){
   System.out.println("Olá Mundo!");
}