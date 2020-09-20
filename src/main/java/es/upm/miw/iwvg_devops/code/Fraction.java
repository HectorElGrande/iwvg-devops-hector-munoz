package es.upm.miw.iwvg_devops.code;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * <p>
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * <p>
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * <p>
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * <p>
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * <p>
 * Comparar fracciones
 * <p>
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * <p>
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que tiene: Por numerador el producto de los numeradores. Por
 * denominador el producto de los denominadores.
 * <p>
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 */
public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
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

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return this.getNumerator() < this.getDenominator();
    }

    public boolean isImproper() {
        return this.getNumerator() > this.getDenominator();
    }

    public boolean isEquivalent(Fraction fraction1) {
        return this.getNumerator() * fraction1.getDenominator() == this.getDenominator() * fraction1.getNumerator();
    }

    public Fraction add(Fraction fraction1, Fraction fraction2) {
        int numerator = fraction1.numerator * fraction2.denominator + fraction2.numerator * fraction1.denominator;
        int denominator = fraction1.denominator * fraction2.denominator;
        Fraction frFinal = new Fraction(numerator, denominator);
        return frFinal;
    }

    public Fraction subtraction(Fraction fraction1, Fraction fraction2){
        int num=fraction1.numerator*fraction2.denominator-fraction2.numerator*fraction1.denominator;
        int den=fraction1.denominator*fraction2.denominator;
        Fraction fractionFinal = new Fraction(num,den);
        return fractionFinal;
    }

    public Fraction multiply(Fraction fraction1, Fraction fraction2) {
        int numerator = fraction1.getNumerator() * fraction2.getNumerator();
        int denominator = fraction1.getDenominator() * fraction2.getDenominator();
        Fraction fractionResult = new Fraction(numerator, denominator);
        return fractionResult;
    }

    public Fraction divide(Fraction fraction1, Fraction fraction2) {
        int numerator = fraction1.getNumerator() * fraction2.getDenominator();
        int denominator = fraction1.getDenominator() * fraction2.getNumerator();
        Fraction frFinal = new Fraction(numerator, denominator);
        return frFinal;
    }

    public Fraction fractionIsHigher(Fraction f1, Fraction f2) {
        return (f1.decimal() > f2.decimal()) ? f1 : f2;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
