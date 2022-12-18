package org.mz.fibcalc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibController {

    private final FibCalculator calculator = new FibCalculator();

    @GetMapping("/fibonacci/{n}")
    public RequestOutput getNthFibonacciNumber(@PathVariable int n) {
        return new RequestOutput(
                "FibCalc",
                "Maciej Zarębski",
                "I2S 2.5",
                calculator.calculateNthFibonacciNumberIterationMethod(n));
    }
}
