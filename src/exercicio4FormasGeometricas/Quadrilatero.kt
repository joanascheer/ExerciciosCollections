package exercicio4FormasGeometricas

open class Quadrilatero(
    lado1: Double = 0.0,
    lado2: Double = 0.0,
    lado3: Double = 0.0,
    lado4: Double = 0.0,
) {
    open fun calculaPerimetroQuadrilatero(lado1: Double) : Double{
        val perimetro = lado1 * 4
        println("O perímetro do seu quadrilátero é $perimetro")
        return perimetro
    }

    open fun calculaPerimetroQuadrilatero(lado1: Double, lado2: Double) : Double{
        val perimetro = (lado1 * 2) + (lado2 * 2)
        println("O perímetro do seu quadrilátero é $perimetro")
        return perimetro
    }



}