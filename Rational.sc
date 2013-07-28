class Rational(n: Int, d: Int) {
  require(d!=0)
  def this(numer: Int) = this(numer, 1)

  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g

  override def toString = numer + "/" + denom

  def +(that: Rational): Rational =
    new Rational(n * that.denom + that.numer * d, d * that.denom)
  def *(that: Rational) = new Rational(numer * that.numer, denom * that.denom)
  def <(that:Rational) = n * that.denom < that.numer * d
  def max(that:Rational) = if (<(that)) that else this
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

implicit def intToRational(x: Int) = new Rational(x)

val r = new Rational(1, 2)
new Rational(1, 3) + new Rational(4, 5)
new Rational(1, 3) < new Rational(2, 3)
new Rational(2, 3) < new Rational(1, 3)
new Rational(2, 3) max new Rational(1, 3)
new Rational(2)
new Rational(1, 2) * new Rational(2, 3)
4 * new Rational(1, 2)
new Rational(1, 2) * 4






