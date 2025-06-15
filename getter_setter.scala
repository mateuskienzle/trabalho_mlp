class Produto:
  private var _estoque = 0
  private val limite = 100

  def estoque: Int = _estoque

  def estoque_=(valor: Int): Unit =
    if valor <= limite then _estoque = valor
    else alertar()

  private def alertar(): Unit =
    println("Aviso: quantidade excede o limite permitido")