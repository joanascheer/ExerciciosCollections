package exercicio6SaveTheRoupa

import exercicio6SaveTheRoupa.GuardaVolumes.Cria.dicionario
import exercicio6SaveTheRoupa.GuardaVolumes.Cria.listaDePecas
import exercicio6SaveTheRoupa.GuardaVolumes.Cria.sucesso

class Meia(
    marca: String = "",
    modelo: String = "",
    nome: String = "Meia",

    ) : Peca(
    marca,
    modelo
) {

    private var nome: String = nome
    override fun getNome(): String {
        return nome
    }

    fun criaMeia(): Meia {
        println("Tipo de Produto:")
        nome = readln()
        println("Qual a marca da sua meia?")
        marca = readln()
        println("Qual o modelo da sua meia?")
        modelo = readln()
        listaDePecas.add(Meia())

        return Meia()
    }

    override fun retirada() {
        println(
            "Tem certeza de que deseja fazer a retirada?\n" +
                    "[1] SIM | [2] NÃO"
        )
        when (readln()) {
            "1" -> {
                listaDePecas.remove(Meia())
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