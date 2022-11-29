package com.ydmaia

fun printMessage(message: String): Unit {                               // 1 Unit é um tipo de void ou uma unidade de qualquer coisa, não é obrigatório colocar
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // 2 Não retorna nada e por isso o Unit foi retirado
    //O segundo parâmeto é chamado de valor padrão, ou seja, caso não seja passado nenhum argumento no prefix, o valor padrão dele será o "Info".
    println("[$prefix] $message") //aqui é uma interpolação de string, assim como no JS
}

fun sum(x: Int, y: Int): Int {                                          // 3
    return x + y
}

fun multiply(x: Int, y: Int) = x * y     // 4 Inline function...é uma forma de diminuir verbosidade do código ao termos apenas uma linha no retorno de uma função

fun main() { //função que vai executar todas as outras funções acima
    printMessage("Hello")                                               // 5
    printMessageWithPrefix("Hello", "Log")                // 6
    printMessageWithPrefix("Hello")                             // 7
    printMessageWithPrefix(prefix = "Log", message = "Hello")   // 8 Se usarmos os parâmtros já nomeados, podemos inverter a ordem de passagem dos mesmos
    //diferente do que foi passado ao construir a função.
    println(sum(1, 2))                                            // 9
    println(multiply(2, 4))                                       // 10
}