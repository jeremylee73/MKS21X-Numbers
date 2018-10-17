public class RationalNumber extends RealNumber{

  private int numerator;
  private int denominator;

  public RationalNumber(int num, int den){
    super(num, den);
    numerator = num;
    denominator = den;
  }

  public double getValue(){
    return (numerator * 1.0)/ denominator;
  }

  public double getNumerator() {
    return numerator;
  }

  public double getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal() {
    RationalNumber ans = new RationalNumber(this.denominator, this.numerator);
    return ans;
  }

  public boolean equals(RationalNumber other){
    if (numerator * other.denominator == denominator * other.numerator) {
      return true;
    }
    return false;
  }

  private static int gcd(int a, int b){
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }

  public void reduce() {
    int oldNum = this.numerator;
    int oldDen = this.denominator;
    numerator = numerator / gcd(oldNum, oldDen);
    denominator = denominator / gcd(oldNum, oldDen);
  }

  public String toString(){
    if (this.numerator == 0) {
      return "" + 0;
    } else if (this.denominator == 1) {
      return "" + numerator;
    }
    this.reduce();
    return numerator + " / " + denominator;
  }
}
