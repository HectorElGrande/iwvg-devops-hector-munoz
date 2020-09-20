package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.Searches;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchesTest {

    @Test
    void findHighestFractionTest() {
        Fraction value = new Searches().findHighestFraction();
        assertEquals("2/1", value.getNumerator() + "/" + value.getDenominator());
    }

}
