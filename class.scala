class Pessoa(var nome: String, val idade: Int)

val p1 = new Pessoa("Maria", 28)
println(p1.nome) // Maria
println(p1.idade) // 28

p1.nome = "Ana"
// p1.idade = 30 // Erro de compilação

class Produto(val nome: String, val preco: Double):
  println(s"Produto criado: $nome, Preço: $preco")
  val imposto: Double = preco * 0.1
  def precoFinal: Double = preco + impost

val prod = new Produto("Caneta", 2.0)
println(prod.precoFinal) // 2.2