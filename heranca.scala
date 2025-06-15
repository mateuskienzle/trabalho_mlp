class Veiculo(val marca: String, val ano: Int):
  def descricao(): Unit =
    println(s"Veículo da marca $marca")

class Carro(
  override val marca: String,
  override val ano: Int,
  val modelo: String
) extends Veiculo(marca, ano):
  override def descricao(): Unit =
    println(s"Carro modelo $modelo da marca $marca")