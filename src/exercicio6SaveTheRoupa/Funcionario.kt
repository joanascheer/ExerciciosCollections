package exercicio6SaveTheRoupa

class Funcionario(
    var nome: String = "",
    var senha: Int = 0,
) : Valida {

    val objFuncionario: Funcionario = Funcionario("Joana", 1234)

    fun menuFuncionario() {

        println(
            "Seja bem vindo(a)!\n" +
                    "[1] Entrar | [2] Cadastrar | [3] Voltar ao menu anterior | [4] Sair"
        )
        when (readln()) {
            "1" -> {
                validaFuncionario()
            }
            "2" -> {
                cadastroFuncionario()
                validaFuncionario()
            }
            "3" -> {
                GuardaVolumes().menuSecundario()
            }
            "4" -> {
                GuardaVolumes.sair()
            }
        }
    }

    private fun cadastroFuncionario(): Funcionario {
        println("Nome do funcionário:")
        nome = readln()
        println("Senha:")
        senha = readln().toInt()

        GuardaVolumes.listaFuncionarios.add(Funcionario())

        return Funcionario()

    }

}