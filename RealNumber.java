public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public RealNumber add(RealNumber other){
     return new RealNumber(getValue() + other.getValue());
  }

  public RealNumber multiply(RealNumber other){
    return new RealNumber(getValue() * other.getValue());
  }

  public RealNumber divide(RealNumber other){
    return new RealNumber(getValue() / other.getValue());
  }

  public RealNumber subtract(RealNumber other){
    return new RealNumber(getValue() - other.getValue());
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other){
    if (this.getValue() == 0 || other.getValue() == 0) {
      return this.getValue() == 0 && other.getValue() == 0;
    }
    return Math.abs((this.getValue() - other.getValue()) / this.getValue()) < .00001;
  }
}
