//Desafio de código Kotlin//
    
enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("$usuario matriculado na formação $nome.")
    }

    fun desmatricular(usuario: Usuario) {
        inscritos.remove(usuario)
        println("$usuario removido da formação $nome.")
    }

    fun listarInscritos() {
        println("Inscritos na formação $nome: $inscritos")
    }
}

fun main() {
    val usuario1 = Usuario()
    val usuario2 = Usuario()

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos")

    val formacao = Formacao("Desenvolvimento Kotlin", listOf(conteudo1, conteudo2))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.listarInscritos()

    formacao.desmatricular(usuario1)
    formacao.listarInscritos()
}
