public class RationalNumber extends RealNumber{

  private int numerator;
  private int denominator;

  public RationalNumber(int num, int den){
    super(1.0);
    numerator = num;
    denominator = den;
  }

  public int getValue(){
    return numerator / denominator;
  }

  public int compareQ(RationalNumber q){
    return 0;
  }

  public int getNumerator() {
    return 0;
  }

  public int getDenominator() {
    return 0;
  }

  public RationalNumber reciprocal() {
    return null;
  }

  public String toString(){
    return "";
  }

}
