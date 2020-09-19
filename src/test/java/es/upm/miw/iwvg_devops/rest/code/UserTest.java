package es.upm.miw.iwvg_devops.rest.code;

import es.upm.miw.iwvg_devops.code.Fraction;
import es.upm.miw.iwvg_devops.code.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    User newUser;
    List<Fraction> fractions;

    @BeforeEach
    void execute() {
        fractions = new ArrayList<>();
        newUser = new User("3", "Pedro", "Martin", fractions);
    }

    @Test
    void testGetId() {
        assertEquals("3", newUser.getId());
    }

    @Test
    void testGetName() {
        assertEquals("Pedro", newUser.getName());
    }

    @Test
    void testSetName() {
        newUser.setName("Alex");
        assertEquals("Alex", newUser.getName());
    }

    @Test
    void testGetFamilyName() {
        assertEquals("Martin", newUser.getFamilyName());
    }

    @Test
    void testSetFamilyName() {
        newUser.setFamilyName("Gonzalez");
        assertEquals("Gonzalez", newUser.getFamilyName());
    }

    @Test
    void testGetFractions() {
        assertEquals(fractions.toString(), newUser.getFractions().toString());
    }

    @Test
    void testSetFractions() {
        List<Fraction> fractions1 = new ArrayList<>();
        Fraction fraction1 = new Fraction(1, 4);
        Fraction fraction2 = new Fraction(1, 2);
        fractions1.add(fraction1);
        fractions1.add(fraction2);
        newUser.setFractions(fractions1);
        assertEquals(fractions1.toString(), newUser.getFractions().toString());
    }

    @Test
    void testAddFraction() {
        Fraction fraction1 = new Fraction(1, 6);
        newUser.addFraction(fraction1);
        assertEquals(fractions.toString(), newUser.getFractions().toString());
    }

    @Test
    void testFullName() {
        Fraction fraction1 = new Fraction(2, 2);
        fractions.add(fraction1);
        assertEquals("Pedro Martin", newUser.fullName());
    }

    @Test
    void testInitials() {
        Fraction fraction1 = new Fraction(6, 2);
        fractions.add(fraction1);
        assertEquals("P.", newUser.initials());
    }

    @Test
    void testToString() {
        Fraction fraction1 = new Fraction(1, 2);
        fractions.add(fraction1);
        assertEquals("User{" +
                        "id='" + "3" + '\'' +
                        ", name='" + "Pedro" + '\'' +
                        ", familyName='" + "Martin" + '\'' +
                        ", fractions=" + fractions +
                        '}',
                "User{" +
                        "id='" + newUser.getId() + '\'' +
                        ", name='" + newUser.getName() + '\'' +
                        ", familyName='" + newUser.getFamilyName() + '\'' +
                        ", fractions=" + newUser.getFractions() +
                        '}');
    }
}
