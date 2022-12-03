package com.ydmaia

fun main() {

    var a: String = "initial"  // 1 variável mutável, podendo reatribuir o momento em que quisermos
    println(a)
    val b: Int = 1             // 2 val é imutável, ou seja, não pode atribuir em momento algum
    val c = 3                  // 3 inferência de tipo, assim como no javascript, não é obrigatório tipar
    println(b);
    println(c);

    var d = "Teste";
    println(d);

    var e: Int; //Ainda não foi inicializada e com isso dá erro
    //println(e);

    //O que podemos fazer, é algo do tipo baixo:
    fun someCondition() = true;

    val f: Int  // 1

    if (someCondition()) {
        f = 1   // 2
    } else {
        f = 2   // 2
    }

    println(f) // 3
}