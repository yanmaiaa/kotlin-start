package com.ydmaia

class MutableStack02<E>(vararg items: E) {              // 1

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack02(${elements.joinToString()})"
}


fun <E> mutableStackOf(vararg elements: E) = MutableStack02(*elements) //Function utilitária
//significa que quando essa function for chamada eu quero criar uma nova MutableStack02 passando o varargs pra ela

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7) //Poderíamos colocar o tipo de forma explícita como:
    //mutableStackOf<Double>(0.62, 3.14, 2.7)
    println(stack)
}