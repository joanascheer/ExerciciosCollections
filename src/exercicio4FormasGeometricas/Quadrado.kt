package exercicio4FormasGeometricas

class Quadrado(
    private var lado : Double = 0.0,
    private var nomeForma: String = "Quadrado"
) : Quadrilatero(
    lado1 = lado,
    lado2 = lado,
    lado3 = lado,
    lado4 = lado
), Forma {
    private var area = 0.0
    private var perimetro = 0.0


    fun criaQuadrado(): Quadrado {
        println("Qual o tamanho dos lados do seu quadrado?")
        lado = readln().toDouble()

        println("Os lados do seu $nomeForma medem $lado cada.\n")

        return Quadrado(lado)
    }

    override fun calculaArea(forma: Forma): Double {
        area = lado * lado
        println("A área do seu $nomeForma é $area")
        return area
    }

    override fun calculaPerimetro(): Double {
        perimetro = lado * 4
        println("O perímetro do seu $nomeForma é $perimetro\n")
        return perimetro
    }

    override fun getNome(): String {
        return nomeForma
    }
}