package exercicio6SaveTheRoupa

import kotlin.system.exitProcess

class GuardaVolumes(

) {

    init {
        menuPrincipal()
    }
    private var identificador: Int = 0


    private fun guardaPecas(listaDePecas : ArrayList<Peca>) : Int {
            dicionario[identificador] = listaDePecas

        println("Obrigado(a)! Seu número identificador é $identificador")
        return identificador
    }

    private fun menuPrincipal() : ArrayList <Peca>{
        println("Quantas peças você vai guardar?")
        val quantidade = readln().toInt()

        for (i in 1..quantidade) {
            println("Que peças você vai guardar?\n" +
                    "[1] - Camiseta\n" +
                    "[2] - Calça\n" +
                    "[3] - Tênis\n" +
                    "[4] - Meia\n" +
                    "[5] - Sair do sistema")
            when(readln()) {
                "1" -> {
                    val camiseta = Camiseta().criaCamiseta()
                    listaDePecas.add(camiseta)
                    sucesso()
                }
                "2" -> {
                    val calca = Calca().criaCalca()
                    listaDePecas.add(calca)
                    sucesso()
                }
                "3" -> {
                    val tenis = Tenis().criaTenis()
                    listaDePecas.add(tenis)
                    sucesso()
                }
                "4" -> {
                    val meia = Meia().criaMeia()
                    listaDePecas.add(meia)
                    sucesso()
                }
                "5" -> {
                    sair()
                }
            }

        }

        guardaPecas(listaDePecas)
        menuSecundario()

        return listaDePecas
    }

    fun mostraListaDePecas(dicionario: HashMap<Int, ArrayList<Peca>>) {
        dicionario.forEach { (k, v) ->
            println("$k - $v")
        }
    }

    private fun mostraPecas() {

        //mostrar dicionario completo, nao e pro usuario e sim pra funcionario
        println("Digite o número recebido")
        var numero = readln().toInt()
        numero = identificador

        dicionario.forEach { (numero, v) ->
            println("$numero: $v")
        }
    }

    private fun devolverPecas() {
        println("Que peça gostaria de devolver?\n" +
                "[1] - Camiseta\n" +
                "[2] - Calça\n" +
                "[3] - Tênis\n" +
                "[4] - Meia\n" +
                "[5] - Nenhuma, sair do sistema")
        when(readln()) {
            "1" -> {
                Camiseta().retirada()
                menuSecundario()
            }
            "2" -> {
                Calca().retirada()
                menuSecundario()
            }
            "3" -> {
                Tenis().retirada()
                menuSecundario()
            }
            "4" -> {
                Meia().retirada()
                menuSecundario()
            }
            "5" -> {
                sair()
            }
        }
        println("Digite o número recebido:")
        val numero = readln().toInt()

        dicionario.remove(numero)
    }

    private fun mostraMinhasPecas(listaDePecas: ArrayList<Peca>) {
        println("*** Sua lista de peças ***\n")
        listaDePecas.forEach {
            println("${it.getNome()}:\n" +
                    "Marca: ${it.marca}\n" +
                    "Modelo: ${it.modelo}\n")
        }
        menuSecundario()
    }

    private fun limparLista() {
        println("Tem certeza de que deseja retirar todos os seus produtos?\n" +
                "[1] - Sim | [2] - Não")
        when(readln()) {
            "1" -> {
                listaDePecas.clear()
                sucesso()
            }
            "2" -> {

            }
        }
    }

    internal fun menuSecundario() {
        println("O que deseja fazer agora?\n" +
                "[1] - Ver todo o conteúdo do guarda volumes.\n" +
                "[2] - Ver todas as minhas peças guardadas\n" +
                "[3] - Guardar mais peças\n" +
                "[4] - Retirar alguma peça do guarda volumes\n" +
                "[5] - Retirar todas as minhas peças\n" +
                "[6] - Sair")
        when(readln()) {
            "1" -> {
                Funcionario().menuFuncionario()
            }
            "2" -> {
                mostraMinhasPecas(listaDePecas)
            }
            "3" -> {
                menuPrincipal()
            }
            "4" -> {
                devolverPecas()
            }
            "5" -> {
                limparLista()
            }
            "6" -> {
                sair()
            }
        }
    }




    companion object Cria {
        val listaDePecas: ArrayList <Peca> = ArrayList()
        val listaFuncionarios: ArrayList <Funcionario> = ArrayList()

        fun sair() {
            println("Ok, nos vemos na próxima!")
            exitProcess(0)
        }

        fun sucesso() {
            println("Processo executado com sucesso!")
        }
        internal var dicionario: HashMap<Int, ArrayList<Peca>> = HashMap()

    }




}