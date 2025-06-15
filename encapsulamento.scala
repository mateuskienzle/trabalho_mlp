class Conta(codigo: Int, private val saldoInicial: Double):
  private def logInterno(): Unit =
    println("Log de acesso interno")

  def exibirSaldo(): Unit =
    println(s"Saldo atual: $saldoInicial")
    logInterno()

val conta = Conta(123, 500.0)
// conta.logInterno() // Erro de compilação
// println(conta.saldoInicial) // Erro de compilação
conta.exibirSaldo()