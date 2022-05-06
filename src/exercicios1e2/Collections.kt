package exercicios1e2

class Collections() {

    fun preencheLista(listaNumeros: MutableList <Int>) : MutableList <Int>{

        for (i in 0..7) {
            println("Digite um número inteiro:")
            val digita = readln().toInt()
            listaNumeros.add(digita)

        }
        return listaNumeros

    }

    fun preencheListaDois(listaNumerosDois: ArrayList <Int>) : ArrayList <Int>{

        for (i in 0..7) {
            println("Digite um número inteiro:")
            val digita = readln().toInt()
            listaNumerosDois.add(digita)

        }
        return listaNumerosDois

    }

    fun imprimeLista(listaNumeros: MutableList <Int>) {
        println(listaNumeros)
    }

}
