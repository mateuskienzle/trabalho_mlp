val cor = "azul"
val descricao = cor match {
    case "vermelho" => "Cor quente"
    case "azul"     => "Cor fria"
    case _          => "Cor desconhecida"
}