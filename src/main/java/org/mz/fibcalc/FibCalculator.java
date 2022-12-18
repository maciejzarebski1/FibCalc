package org.mz.fibcalc;

import java.math.BigDecimal;

public class FibCalculator {

    public BigDecimal calculateNthFibonacciNumberIterationMethod(int n) {
        return switch (n) {
            case 0 -> BigDecimal.valueOf(0);
            case 1, 2 -> BigDecimal.valueOf(1);
            default -> {
                BigDecimal current = BigDecimal.valueOf(1);
                BigDecimal previous = BigDecimal.valueOf(1);
                BigDecimal previous2 = BigDecimal.valueOf(0);
                for(int i = 2; i <= n; i++) {
                    current = previous.add(previous2);
                    previous2 = BigDecimal.valueOf(previous.doubleValue());
                    previous = BigDecimal.valueOf(current.doubleValue());
                }
                yield current;
            }
        };

    }
}
