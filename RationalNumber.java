public class RationalNumber extends RealNumber
{
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    super(nume * 1.0 / deno);
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
    return numerator / denominator;
  }

  public int getNumerator(){
    return numerator;
  }

  public int getDenominator(){
    return denominator;
  }

  public RationalNumber reciprocal(){
    return new RationalNumber(denominator,numerator);
  }

  public boolean equals(RationalNumber other){
    return numerator * other.denominator == denominator * other.numerator;
  }
  public boolean equals(RealNumber other){
    return other.equals(this);
  }


  public String toString(){
    return numerator + "/" + denominator;
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
  private int lcm(int a, int b) {
    return a * b / gcd(a,b);
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced after construction.
  */
  private void reduce(){
      int t1 = numerator;
      int t2 = denominator;
      numerator = numerator/gcd(t1,t2);
      denominator = denominator/gcd(t1,t2);
  }
  public RationalNumber multiply(RationalNumber other){
    RationalNumber a = new RationalNumber(this.numerator * other.numerator,this.denominator * other.denominator);
    a.reduce();
    return a;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    RationalNumber a = new RationalNumber(this.numerator * other.denominator,this.denominator * other.numerator);
    a.reduce();
    return a;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int b = lcm(this.denominator,other.denominator);
    int a = b / this.denominator * this.numerator;
    int c = b / other.denominator * other.numerator;
    return new RationalNumber(a+c,b);
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int b = lcm(this.denominator,other.denominator);
    int a = b / this.denominator * this.numerator;
    int c = b / other.denominator * other.numerator;
    return new RationalNumber(a-c,b);
  }
}
