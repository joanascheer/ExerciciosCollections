package exercicio6SaveTheRoupa

import exercicio6SaveTheRoupa.GuardaVolumes.Cria.dicionario
import exercicio6SaveTheRoupa.GuardaVolumes.Cria.listaDePecas


class Tenis(
    marca: String = "",
    modelo: String = "",
    nome: String = "Tênis",

    ) : Peca(
    marca,
    modelo
) {

    private var nome: String = nome
    override fun getNome(): String {
        return nome
    }

    fun criaTenis(): Tenis {
        println("Tipo de Produto:")
        nome = readln()
        println("Qual a marca do seu tênis?")
        marca = readln()
        println("Qual o modelo do seu tênis?")
        modelo = readln()
        listaDePecas.add(Tenis())

        return Tenis()
    }

    override fun retirada() {
        println(
            "Tem certeza de que deseja fazer a retirada?\n" +
                    "[1] SIM | [2] NÃO"
        )
        when (readln()) {
            "1" -> {
                listaDePecas.remove(Tenis())
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
        GuardaVolumes.sucesso()
    }
}