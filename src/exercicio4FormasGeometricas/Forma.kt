package exercicio4FormasGeometricas

interface Forma {

    fun calculaArea(forma: Forma) : Double

    fun calculaPerimetro() : Double

    fun getNome() : String
}