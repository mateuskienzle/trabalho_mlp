enum Prioridade(val nivel: Int):
  case Baixa extends Prioridade(1)
  case Media extends Prioridade(2)
  case Alta extends Prioridade(3)

  def descricao: String = nivel match
    case 1 => "Pouco urgente"
    case 2 => "Importante"
    case 3 => "Urgente"