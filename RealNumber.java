public class RealNumber{

  private double value;

  public RealNumber(double v){
    value = v;
  }
  public RealNumber(int num, int den) {
    value = (num * 1.0) / den;
  }

  public double add(RealNumber other) {
    return value + other.getValue();
  }

  public double multiply(RealNumber other){
    return value * other.getValue();
  }

  public double divide(RealNumber other){
    return value / other.getValue();
  }

  public double subtract(RealNumber other){
    return value - other.getValue();
  }

  public double getValue() {
    return value;
  }

  public String toString(){
    return "" + value;
  }
}
