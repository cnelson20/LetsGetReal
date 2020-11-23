public class tester {
  public static void main(String[] args) {
    //System.out.println(RationalNumber.gcd(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
    RealNumber a1 = new RealNumber(125.0/3.0);
    RealNumber a2 = new RealNumber(375.0);
    System.out.println("1. Expects true");
    System.out.println(a1.equals(a2.divide(new RealNumber(9.0))));
    System.out.println("\n2. Expects false");
    System.out.println(a1.equals(a2));
    RationalNumber a4 = new RationalNumber(125,3);
    RationalNumber a5 = new RationalNumber(375,9);
    RationalNumber a6 = new RationalNumber(125,2);
    System.out.println("\n3. Expects true");
    System.out.println(a4.equals(a5));

    //125/3 = 125.0/3.0;
    System.out.println("\n4. Expects true");
    System.out.println(a4.equals(a1));
    System.out.println(a1.equals(a4));
    System.out.println("\n5. Expects false");
    System.out.println(a4.equals(a6));
    System.out.println("\n6. Expects false");
    System.out.println(a6.equals(a1));
    System.out.println("\n7. Expects 125/4");
    System.out.println(a6.multiply(new RationalNumber(1,2)));
    System.out.println("\n8. Expects 125/1");
    System.out.println(a6.divide(new RationalNumber(1,2)));
    //add & subtract
    RationalNumber b1 = new RationalNumber(11,27);
    RationalNumber b2 = new RationalNumber(1,3);
    System.out.println("\n9. Expects 20/27");
    System.out.println(b1.add(b2));
    System.out.println("\n10. Expects 2/27");
    System.out.println(b1.subtract(b2));
    System.out.println("\n10. Expects 1");
    System.out.println(a6.compareTo(a5));
    System.out.println("\n10. Expects 0");
    System.out.println(a4.compareTo(a1));
    System.out.println("\n10. Expects -1");
    System.out.println(a4.compareTo(a2));

  }
}
