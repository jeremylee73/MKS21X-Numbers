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

  public int getNumerator() {
    return numerator;
  }

  public int getDenominator() {
    return denominator;
  }

  public RationalNumber reciprocal() {
    RationalNumber ans = new RationalNumber(this.denominator, this.numerator).reduce();
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

  private RationalNumber reduce() {
    if (this.numerator == 0) {
      return new RationalNumber(0, 1);
    } else if (this.denominator == 1) {
      return new RationalNumber(numerator, 1);
    }
    int newNum = numerator / gcd(numerator, denominator);
    int newDen = denominator / gcd(numerator, denominator);
    RationalNumber ans = new RationalNumber(newNum, newDen);
    return ans;
  }

  public String toString(){
    RationalNumber ans = new RationalNumber(numerator, denominator).reduce();
    if (ans.numerator == 0) {
      return "" + 0;
    } else if (ans.denominator == 1) {
      return "" + numerator;
    }
    return ans.numerator + " / " + ans.denominator;
  }

  public RationalNumber add(RationalNumber other) {
    RationalNumber convertedA = new RationalNumber((numerator * other.denominator), (denominator * other.denominator));
    RationalNumber convertedB = new RationalNumber((other.numerator * denominator), (denominator * other.denominator));
    RationalNumber ans = new RationalNumber((convertedA.numerator + convertedB.numerator), convertedA.denominator).reduce();
    return ans;
  }

  public RationalNumber subtract(RationalNumber other) {
    RationalNumber convertedA = new RationalNumber((numerator * other.denominator), (denominator * other.denominator));
    RationalNumber convertedB = new RationalNumber((other.numerator * denominator), (denominator * other.denominator));
    RationalNumber ans = new RationalNumber((convertedA.numerator - convertedB.numerator), convertedA.denominator).reduce();
    return ans;
  }

  public RationalNumber multiply(RationalNumber other){
    return new RationalNumber((numerator * other.numerator), (denominator * other.denominator)).reduce();
  }

  public RationalNumber divide(RationalNumber other){
    RationalNumber recip = other.reciprocal();
    return this.multiply(recip);
  }

}
