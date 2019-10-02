public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(1,6);
        f1.add(f2);
        System.out.println(f1);
        Fraction f3 = new Fraction(1,3);
        Fraction f4 = new Fraction(6,6);
        f3.subtract(f4);
        System.out.println(f3);
        Fraction f5 = new Fraction(-2,5);
        Fraction f6 = new Fraction(1,7);
        f5.multiply(f6);
        System.out.println(f5);
        Fraction f7 = new Fraction(1,2);
        Fraction f8 = new Fraction(2,3);
        f7.divide(f8);
        System.out.println(f7);
    }
    
}
