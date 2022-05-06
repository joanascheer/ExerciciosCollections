package exercicio4FormasGeometricas

class Circulo(
    raio: Double = 0.0,

): Forma {

    private var raioCirculo = raio
    private var area = 0.0
    private var perimetro = 0.0
    private var nomeForma: String = "Círculo"


    fun criaCirculo() : Circulo {
        println("Qual o tamanho do raio do seu círculo?")
        raioCirculo = readln().toDouble()

        println("O raio do seu $nomeForma é $raioCirculo.")

        return Circulo(raioCirculo)
    }

    override fun calculaArea(forma: Forma): Double {
        area = 3.14 * raioCirculo * raioCirculo
        println("A área do seu círculo é $area")
        return area
    }

    override fun calculaPerimetro(): Double {
        perimetro = 2 * 3.14 * raioCirculo
        println("O perímetro do seu círculo é $perimetro\n")
        return perimetro
    }

    override fun getNome(): String {
        return nomeForma
    }
}