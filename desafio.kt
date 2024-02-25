enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val conteudo: ConteudoEducacional = ConteudoEducacional("Android", 200)
    val conteudos= mutableListOf<ConteudoEducacional>()
    conteudos.add(conteudo);


    val formacao = Formacao("Kotin", Nivel.AVANCADO, conteudos)
    formacao.matricular(Usuario("Diego"))

    println(formacao)
    println( formacao.inscritos)
}