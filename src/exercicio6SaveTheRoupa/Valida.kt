package exercicio6SaveTheRoupa

import exercicio6SaveTheRoupa.GuardaVolumes.Cria.dicionario
import kotlin.system.exitProcess

interface Valida {

    fun validaFuncionario() {
        println("Senha:")
        val senhaRecebida = readln().toInt()

        if (senhaRecebida == Funcionario().senha) {
            GuardaVolumes().mostraListaDePecas(dicionario)
            GuardaVolumes().menuSecundario()
        } else {
            println("Você deve ser funcionário para executar esta ação.")
            exitProcess(0)
        }
    }
}