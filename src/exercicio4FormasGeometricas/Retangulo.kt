package exercicio4FormasGeometricas

class Retangulo(
    private var base: Double = 0.0,
    private var altura: Double = 0.0,
    private var nomeForma: String = "Retângulo",
): Quadrilatero(
    lado1 = base,
    lado2 = base,
    lado3 = altura,
    lado4 = altura,
), Forma {

    private var perimetro = 0.0
    private var area = 0.0


    fun criaRetangulo() : Retangulo {
        println("Qual a base do seu $nomeForma?")
        base = readln().toDouble()
        println("Qual a altura do seu $nomeForma?")
        altura = readln().toDouble()

        println("A base do seu $nomeForma é $base e a altura $altura.")

        return Retangulo(base, altura)
    }

    override fun calculaArea(forma: Forma): Double {
        area = base * altura
        println("A área do seu $nomeForma é $area")
        return area
    }

    override fun calculaPerimetro(): Double {
        perimetro = (base * 2) + (altura * 2)
        println("O perímetro do seu $nomeForma é $perimetro\n")
        return perimetro
    }

    override fun getNome(): String {
        return nomeForma
    }

    override fun calculaPerimetroQuadrilatero(lado1: Double, lado2: Double): Double {
        return super.calculaPerimetroQuadrilatero(lado1, lado2)
    }

}