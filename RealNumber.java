public class RealNumber{

  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double add(RealNumber other) {
    return value + other.getValue();
  }

  public double multiply(RealNumber other){
    return value * other.getValue();
  }

  public double divide(RealNumber other){
    return value / other;
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
