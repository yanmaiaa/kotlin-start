package com.ydmaia

//Generics no contexto de uma pilha
class MutableStack<E>(vararg items: E) {              // 1 vararg (Receberá uma list de um tipo E genérico)

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)        // 2

    fun peek(): E = elements.last()                     // 3 Pega último elemento sem remover

    fun pop(): E = elements.removeAt(elements.size - 1) //Remove último elemento

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})" //sobrestcrita
}


fun main() {
    val stack = MutableStack(0.62, 3.14, 2.7)
    stack.push(9.87)
    println(stack) //[0.62, 3.14, 2.7,9.87]

    println("peek(): ${stack.peek()}")
    println(stack) //[0.62, 3.14, 2.7,9.87] Vai pegar o topo da pilha mas não remove (9.87)

    //Vai de 1... até o tamanho da pilha essa anotação com o '..' significa isso
    for (i in 1..stack.size()) { //Fazendo um laço de repetição removendo da pilha até que não reste mais nenhum item
        println("pop(): ${stack.pop()}")
        println(stack)
    }
}