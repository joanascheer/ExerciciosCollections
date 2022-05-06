package exercicios1e2

fun main() {
    // mutablelist é um método que usamos para constuir uma lista mutavel, e cujos
    // elementos podem se repetir. sua ordem é importante.
    val listaNumeros : MutableList<Int> = mutableListOf()
    Collections().preencheLista(listaNumeros)
    Collections().imprimeLista(listaNumeros)

    // arraylist é uma classe que tem métodos que podemos utilizar
    val listaNumerosDois : ArrayList <Int> = arrayListOf()
    Collections().preencheListaDois(listaNumerosDois)
    Collections().imprimeLista(listaNumerosDois)



}