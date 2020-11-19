public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public RealNumber add(RealNumber other){
     return new RealNumber(value + other.getValue());
  }

  public RealNumber multiply(RealNumber other){
    return new RealNumber(value * other.getValue());
  }

  public RealNumber divide(RealNumber other){
    return new RealNumber(value / other.getValue());
  }

  public RealNumber subtract(RealNumber other){
    return new RealNumber(value - other.getValue());
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+value;
  }

  public boolean equals(){
    return (value - other.value) / value < .00001;
  }
}
