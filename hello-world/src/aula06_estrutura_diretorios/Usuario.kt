package aula06_estrutura_diretorios

class Usuario(
    val nome: String,
    val idade: Int,
    val casado: Boolean,
    val quantidadeFilhos: Int
) {
    fun numeroDependentes(): Int{
        var dependentes = quantidadeFilhos
        if (casado) dependentes++
        return dependentes
    }

    fun getInfoUsuario(): String{
        return "Nome: $nome idade: $idade"
    }
}