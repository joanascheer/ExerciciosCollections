package exercicio5Map

class Cores {

    fun montaListaDeCores(listaCores: HashMap<String, String>) : HashMap <String, String> {

        listaCores[BOLA] = "Vermelha"
        listaCores[BONECA] = "Azul"
        listaCores[CARRO] = "Roxo"
        listaCores[TESOURA] = "Vermelha"
        listaCores[XICARA] = "Branca"
        listaCores[ESTOJO] = "Preto"
        listaCores[ESCADA] = "Amarela"

        return listaCores
    }

        fun mostraListaCores(listaCores: HashMap<String, String>) {
            listaCores.forEach { k, v ->
                println("$k = $v")
            }
        }
    }