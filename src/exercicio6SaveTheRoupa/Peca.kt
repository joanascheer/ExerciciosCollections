package exercicio6SaveTheRoupa

abstract class Peca (
    var marca: String,
    var modelo: String,
) {


    abstract fun retirada()

    abstract fun devolverPecas(numero: Int)

    abstract fun getNome() : String
}