package exercicio6SaveTheRoupa

import exercicio6SaveTheRoupa.GuardaVolumes.Cria.dicionario
import exercicio6SaveTheRoupa.GuardaVolumes.Cria.listaDePecas
import exercicio6SaveTheRoupa.GuardaVolumes.Cria.sucesso

class Calca(
    marca: String = "",
    modelo: String = "",
    nome: String = "Calça",

    ) : Peca(
    marca,
    modelo
) {

    private var nome: String = nome
    override fun getNome(): String {
        return nome
    }

    fun criaCalca(): Calca {
        println("Tipo de Produto:")
        nome = readln()
        println("Qual a marca da sua calça?")
        marca = readln()
        println("Qual o modelo da sua calça?")
        modelo = readln()
        listaDePecas.add(Calca())

        return Calca()
    }

    override fun retirada() {
        println(
            "Tem certeza de que deseja fazer a retirada?\n" +
                    "[1] SIM | [2] NÃO"
        )
        when (readln()) {
            "1" -> {
                listaDePecas.remove(Calca())
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