public class RationalNumber extends RealNumber
{
  private int numerator,denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the getDenominator() is 0, make the fraction 0/1 instead
  *@param nume the getNumerator()
  *@param deno the getDenominator()
  */
  public RationalNumber(int nume, int deno){
    super(((double)nume) / deno);
    if (deno == 0) {
      numerator = 0;
      denominator = 1;
    } else {
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }

  public double getValue(){
    return (double)numerator / denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(getDenominator(),getNumerator());
  }

  public boolean equals(RationalNumber other){
    return getNumerator() * other.getDenominator() == getDenominator() * other.getNumerator();
  }
  //public boolean equals(RealNumber other){
  //  return other.equals(this);
  //}


  public String toString(){
    if (getDenominator() == 1) {
      return getNumerator() + "";
    }
    return getNumerator() + "/" + getDenominator();
  }

  private static int gcd(int a, int b){
    int temp;
    if (a < b) {
      temp = a;
      a = b;
      b = temp;
    }
    int r;
    while (true) {
      r = a % b;
      if (r == 0) {break;}
      a = b;
      b = r;
    }
    return b;
  }
  private static int lcm(int a, int b) {
    return a * b / gcd(a,b);
  }

  /**
  *Divide the getNumerator() and getDenominator() by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
      if (getDenominator() < 0) {
        denominator = getDenominator() * -1;
        numerator = getNumerator() * -1;
      }
      int t1 = getNumerator();
      int t2 = getDenominator();
      numerator = getNumerator()/gcd(t1,t2);
      denominator = getDenominator()/gcd(t1,t2);
  }
  public RationalNumber multiply(RationalNumber other){
    RationalNumber a = new RationalNumber(this.getNumerator() * other.getNumerator(),this.getDenominator() * other.getDenominator());
    a.reduce();
    return a;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber a = new RationalNumber(this.getNumerator() * other.getDenominator(),this.getDenominator() * other.getNumerator());
    a.reduce();
    return a;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int b = lcm(this.getDenominator(),other.getDenominator());
    int a = b / this.getDenominator() * this.getNumerator();
    int c = b / other.getDenominator() * other.getNumerator();
    return new RationalNumber(a+c,b);
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int b = lcm(this.getDenominator(),other.getDenominator());
    int a = b / this.getDenominator() * this.getNumerator();
    int c = b / other.getDenominator() * other.getNumerator();
    return new RationalNumber(a-c,b);
  }
}
