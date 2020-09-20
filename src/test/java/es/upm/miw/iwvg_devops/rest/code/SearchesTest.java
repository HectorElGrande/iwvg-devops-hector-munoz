package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.Searches;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {

    @Test
    void testFindHighestFraction() {
        Fraction value = new Searches().findHighestFraction();
        assertEquals("2/1", value.getNumerator() + "/" + value.getDenominator());
    }

    @Test
    void testFindDecimalFractionByUserName(){
        assertEquals(List.of(0.0, 1.0, 2.0, 0.2, -0.5, 0.5, 1.0), new Searches().findDecimalFractionByUserName("Oscar")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFamilyNameInitialByAnyProperFraction(){
        assertEquals(List.of("F.", "B.", "L.", "B."), new Searches().findUserFamilyNameInitialByAnyProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFirstFractionSubtractionByUserName(){
        assertEquals("Fraction{" +
                "numerator=" + 11 +
                ", denominator=" + 5 +
                '}', new Searches().findFirstFractionSubtractionByUserName("Ana").toString());
    }

}
