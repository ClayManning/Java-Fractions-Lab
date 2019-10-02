
public class Fraction {

    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void add(Fraction fraction) {
        int lcd;
        int temp;
        if (this.denominator == fraction.denominator) {
            this.numerator += fraction.numerator;
            this.reduce();
            this.toString();
        } else {
            lcd = this.lcd(fraction);
            temp = this.numerator;
            this.numerator = this.numerator * fraction.denominator;
            fraction.numerator = fraction.numerator * this.denominator;
            this.denominator = lcd;
            this.numerator = this.numerator + fraction.numerator;
            this.reduce();
            this.toString();
        }
    }

    public void subtract(Fraction fraction) {
        int lcd;
        int temp;
        if (this.denominator == fraction.denominator) {
            this.numerator -= fraction.numerator;
            this.reduce();
            this.toString();
        } else {
            lcd = this.lcd(fraction);
            temp = this.numerator;
            this.numerator = this.numerator * fraction.denominator;
            fraction.numerator = fraction.numerator * this.denominator;
            this.denominator = lcd;
            this.numerator = this.numerator - fraction.numerator;
            this.reduce();
            this.toString();
        }
    }

    public void multiply(Fraction fraction) {
        this.denominator = this.denominator * fraction.denominator;
        this.numerator = this.numerator * fraction.numerator;
        this.reduce();
        this.toString();
    }

    public void divide(Fraction fraction) {
        this.flip();
        this.multiply(fraction);
    }

    public void flip() {//Flips fraction for division
        int temp = this.denominator;
        this.denominator = this.numerator;
        this.numerator = temp;
    }

    public int lcd(Fraction fraction) {//Finds common denominator for addition/subtraction
        return this.denominator * fraction.denominator;
    }

    public Fraction reduce() {
        int a;
        int b;
        a = this.numerator;
        b = this.denominator;
        int temp = gcd(a, b);
        Fraction result = new Fraction((this.numerator / temp), (this.denominator / temp));
        return result;
    }

    public static int gcd(int a, int b) { //Euclids algorithm
        if (a == 0) {
            return b;
        }

        return gcd(b % a, a);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

}
