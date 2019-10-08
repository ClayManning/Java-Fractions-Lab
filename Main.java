public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(1,6);
        f1.add(f2);//Adds/reduces 1/3 and 1/6 which should be 1/2 when reduced
        System.out.println("Addition");
        System.out.println(f1);
        Fraction f3 = new Fraction(1,3);
        Fraction f4 = new Fraction(6,6);
        f3.subtract(f4);//Subtracts/reduces 6/6 from 1/3 which should equal -2/3 when reduced
        System.out.println("Subtraction");
        System.out.println(f3);
        Fraction f5 = new Fraction(-2,5);
        Fraction f6 = new Fraction(1,7);
        f5.multiply(f6);//Multiplies/reduces -2/5 and 1/7 which should equal -2/35 and cannot be reduced
        System.out.println("Multiplication");
        System.out.println(f5);
        Fraction f7 = new Fraction(1,2);
        Fraction f8 = new Fraction(2,3);
        f7.divide(f8);//Divides/reduces 2/3 by 1/2 which equals 4/3 when reduced
        System.out.println("Division");
        System.out.println(f7);
        Fraction f12 = new Fraction(1,3);
        Fraction f13 = new Fraction(1,6);
       Fraction f9 = Fraction.add(f12,f13);//Another way to call the add method
        System.out.println("Addition 2"); 
       System.out.println(f9);
       Fraction f14 = new Fraction(1,3);
       Fraction f15 = new Fraction(6,6);
        Fraction f10 = Fraction.subtract(f14,f15);//Another way to call the subtract method
        System.out.println("Subtraction 2");
        System.out.println(f10);
        Fraction f16 = new Fraction(-2,5);
        Fraction f17 = new Fraction(1,7);
         System.out.println("Multiplication 2");
         Fraction f18 = Fraction.multiply(f16, f17);//Another way to call the multiply method
         System.out.println(f18);
         System.out.println("Division 2");
         Fraction f19 = new Fraction(2,3);
        Fraction f20 = new Fraction(1,2);
        Fraction f21 = Fraction.divide(f20,f19);//Another way to call the divide method
        System.out.println(f21);
    }
    
}
