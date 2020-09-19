package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    Fraction fraction;
    Fraction fraction1;
    Fraction fractionResult;

    @BeforeEach
    void execute() {
        fraction = new Fraction(3, 4);
        fraction1 = new Fraction(6, 8);
        fractionResult = new Fraction();
    }

    @Test
    void testGetNumerator() {
        assertEquals(3, fraction.getNumerator());
    }

    @Test
    void testSetNumerator() {
        fraction.setNumerator(4);
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(4, fraction.getDenominator());
    }

    @Test
    void testSetDenominator() {
        fraction.setDenominator(5);
        assertEquals(5, fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.75, fraction.decimal());
    }

    @Test
    void testIsProper() {
        assertEquals(true, fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertEquals(false, fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        assertEquals(true, fraction.isEquivalent(fraction1));
    }

    @Test
    void testAdd() {
        assertEquals(new Fraction(3, 2).decimal(), fractionResult.add(fraction, fraction1).decimal());
    }

    @Test
    void testMultiply() {
        assertEquals(new Fraction(9, 16).decimal(), fractionResult.multiply(fraction, fraction1).decimal());
    }

    @Test
    void testDivide() {
        assertEquals(1.0, fractionResult.divide(fraction, fraction1).decimal());
    }

    @Test
    void testToString() {
        assertEquals("Fraction{" +
                        "numerator=" + 3 +
                        ", denominator=" + 4 +
                        '}',
                "Fraction{" +
                        "numerator=" + fraction.getNumerator() +
                        ", denominator=" + fraction.getDenominator() +
                        '}');
    }
}
