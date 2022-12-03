package com.ydmaia

class Customer; //Classe simples, sem nada, construtor padrão sem parâmetros adicionais

class Contact(val id: Int, var email: String);   // 2 Com construtor personalizado

fun main() {

    val customer = Customer();                  // 3 instanciando a classe sem palavra reservada new

    val contact = Contact(1, "mary@gmail.com") ; // 4 criando objeto a partir da instância da classe

    println(contact.id);                       // 5 Acessando o id da classe instanciada
    contact.email = "jane@gmail.com";            // 6 reatribuindo outro e-mail;
}