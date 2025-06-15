case class X(val a: Int)

val x1 = X(1) // Uso implícito do apply
val x2 = X(2)
val x2alterado = x2.copy(a = 1)
println(x1 == x2) // false
println(x1 == x2alterado) // true
x1 match { // Uso implícito do unapply
    case X(1) => println("Um")
    case X(n) => println(n)
} // Imprime "Um"