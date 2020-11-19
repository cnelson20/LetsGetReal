public class tester {
  public static void main(String[] args) {
    //System.out.println(RationalNumber.gcd(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
    RealNumber a1 = new RealNumber(125.0/3.0);
    RealNumber a2 = new RealNumber(375.0);
    System.out.println("Expects true");
    System.out.println(a1.equals(a2.divide(new RealNumber(9.0))));
    System.out.println("\nExpects false");
    System.out.println(a1.equals(a2));
    RationalNumber a4 = new RationalNumber(125,3);
    RationalNumber a5 = new RationalNumber(375,9);
    RationalNumber a6 = new RationalNumber(125,2);
    System.out.println("\nExpects true");
    System.out.println(a4.equals(a5));
    System.out.println("\nExpects true");
    System.out.println(a4.equals(a1));
    System.out.println("\n\nExpects false");
    System.out.println(a4.equals(a6));
    System.out.println("\n\nExpects false");
    System.out.println(a6.equals(a1));
  }
}
