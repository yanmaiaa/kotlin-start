package com.ydmaia

fun describeString(maybeString: String?): String {              // 1
    if (maybeString != null && maybeString.length > 0) {        // 2
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"                           // 3
    }
}

fun main() {

    println(describeString(null));
    var neverNull: String = "This can't be null";            // 1

    //neverNull = null;                                       // 2 Não podemos atribuir pra uma string não nula um valor null

    var nullable: String? = "You can keep a null here";      // 3 Se for querer declarar como null futuramente, fazemos algo como isso colocando a '?'

    nullable = null;                                         // 4

    var inferredNonNull = "The compiler assumes non-null";   // 5 Aqui quando não definimos o tipo ocorre o mesmo ao tentar reatribuir

    //inferredNonNull = null;                                  // 6

    fun strLength(notNull: String): Int {                   // 7 Esperando um valor não nulo
        return notNull.length;
    }

    //forma alternativa:

    fun strLengthAlternative(str: String?): Int{
        return str?.length ?: 0; //pra dar certo usa essa '?' pois acessaremos de forma segura, já que pode vir null
    }

    println(strLengthAlternative(neverNull));
    //println(strLength(nullable));                                   // 8
    //strLength(nullable);                                     // 9

}