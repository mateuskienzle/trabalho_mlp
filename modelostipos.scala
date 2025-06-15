sealed trait Resultado
case class Sucesso(conteudo: String) extends Resultado
case class Erro(mensagem: String) extends Resultado