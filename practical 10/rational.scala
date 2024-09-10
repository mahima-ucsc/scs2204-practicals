package p10

class Rational(n: Int, d: Int = 1) {
  require(d != 0, "Denominator must be a non-zero number")
  private val g = gcd(n.abs, d.abs)
  val numerator = n / g
  val denominator = d / g

  def neg: Rational = new Rational(-numerator, denominator)

  def sub(other: Rational): Rational = new Rational(
    numerator * other.denominator - other.numerator * denominator,
    denominator * other.denominator
  )

  override def toString: String = s"$numerator/$denominator"

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}

@main def main() =
  val x = Rational(3, 4)

  println("x: " + x)
  println("x.neg: " + x.neg)

  val y = Rational(5, 8)
  val z = Rational(2, 7)

  println("x: " + x)
  println("y: " + y)
  println("z: " + z)
  println("x - y - z: " + x.sub(y).sub(z))
