package exercicio4FormasGeometricas

import kotlin.system.exitProcess

class Menus {
    init {
        println("Seja bem vindo(a)!\n" +
                "Hora de calcular!\n")
        menuPrincipal()
    }

    private fun menuPrincipal() {
        println("Quantas formas deseja criar? Caso não queira criar nenhuma, tecle 0 para sair do sistema.\n")
        val quantidade = readln().toInt()
        if (quantidade == 0) {
            sair()
        } else {

            for (i in 1..quantidade) {
                println("Escolha a forma que deseja criar!\n" +
                        "[1] - Quadrado\n" +
                        "[2] - Retângulo\n" +
                        "[3] - Círculo\n" +
                        "[4] - Sair do sistema")
                when (readln()) {
                    "1" -> {
                        val quadrado = Quadrado().criaQuadrado()
                        listaDeFormas.add(quadrado)
                        quadrado.calculaArea(quadrado)
                        quadrado.calculaPerimetro()
                    }
                    "2" -> {
                        val retangulo = Retangulo().criaRetangulo()
                        listaDeFormas.add(retangulo)
                        retangulo.calculaArea(retangulo)
                        retangulo.calculaPerimetro()
                    }
                    "3" -> {
                        val circulo = Circulo().criaCirculo()
                        listaDeFormas.add(circulo)
                        circulo.calculaArea(circulo)
                        circulo.calculaPerimetro()
                    }
                    "4" -> {
                        sair()
                    }
                }
            }

            mostraLista()

        }

    }

    private fun mostraLista() {
        println("*** Sua lista de formas ***\n")
        listaDeFormas.forEach {
            println(it.getNome())
        }
    }

    companion object Cria {
        fun sair() {
            println("Tudo bem, até a próxima!")
            exitProcess(0)
        }

        val listaDeFormas = ArrayList<Forma>()

        var nomeForma: String = ""
    }
}