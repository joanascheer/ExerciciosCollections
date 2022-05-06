package exercicio6SaveTheRoupa

import exercicio6SaveTheRoupa.GuardaVolumes.Cria.dicionario
import exercicio6SaveTheRoupa.GuardaVolumes.Cria.listaDePecas
import exercicio6SaveTheRoupa.GuardaVolumes.Cria.sucesso

class Camiseta(
    marca: String = "",
    modelo: String = "",
    nome: String = "Camiseta",

    ) : Peca(
    marca,
    modelo
) {

    private var nome: String = nome

    override fun getNome(): String {
        return nome
    }

    fun criaCamiseta(): Camiseta {
        println("Tipo de Produto:")
        nome = readln()
        println("Qual a marca da sua camiseta?")
        marca = readln()
        println("Qual o modelo da sua camiseta?")
        modelo = readln()
        listaDePecas.add(Camiseta())

        return Camiseta()
    }

    override fun retirada() {

        println(
            "Tem certeza de que deseja fazer a retirada?\n" +
                    "[1] SIM | [2] NÃO"
        )
        when (readln()) {
            "1" -> {
                listaDePecas.remove(Camiseta())
            }
            "2" -> {
                GuardaVolumes().menuSecundario()
            }
        }
    }

    override fun devolverPecas(numero: Int) {
        println("Qual o seu número de identificação?")
        val numero = readln().toInt()
        dicionario.remove(numero)
        sucesso()
    }
}