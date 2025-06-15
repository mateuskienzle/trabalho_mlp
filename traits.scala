trait AnimalEstimacao(nome: String):
    def idade: Int
    override def toString() = s"Animal de Estimação $nome"
class Cachorro(nome: String, val idade: Int)
    extends AnimalEstimacao(nome)