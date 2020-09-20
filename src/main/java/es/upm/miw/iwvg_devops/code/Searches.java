package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {

    public Fraction findHighestFraction() {
        return new UsersDatabase().findAll()
                .map(user -> user.getFractions())
                .flatMap(fractions -> fractions.stream())
                .filter(fraction -> fraction.getDenominator() != 0)
                .reduce((f1, f2) -> f1.fractionIsHigher(f1, f2))
                .get();
    }

    public Stream<Double> findDecimalFractionByUserName(String name){
        return new UsersDatabase().findAll()
                .filter(user -> user.getName().equals(name))
                .map(user -> user.getFractions())
                .flatMap(fractions -> fractions.stream())
                .map(fraction -> fraction.decimal());
    }

}
