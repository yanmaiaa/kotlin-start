package com.ydmaia

fun main() {

    fun printAll(vararg messages: String) {                            // 1 é onde passamos parÇametros do mesmo tipo de quantidades indefinidas
        for (m in messages) println(m) //pega um array com todas as mensagens, independente da quntidade e imprima
    }
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")                 // 2

    fun printAllWithPrefix(vararg messages: String, prefix: String) {  //3 Argumentos nomeados
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )

    fun log(vararg entries: String) {
        printAll(*entries)                                             // 5 Se estou chamando uma função que tem vararg, para
                                                                        //que ele não entenda como um array, colocamos o '*'.
    }
    //Importante saber que um vararg em tempo de execução é um array
}