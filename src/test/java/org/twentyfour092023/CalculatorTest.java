package org.twentyfour092023;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void AddForCalculator() {
        calculator.add(5, 8);
        Assert.assertEquals(calculator.result, 13);
    }

    @Test
    public void SubtractForCalculator() {
        calculator.subtract(8, 5);
        Assert.assertEquals(calculator.result, 3);
    }


    @Test
    public void MultiplyForCalculator() {
        calculator.multiply(5, 8);
        Assert.assertEquals(calculator.result, 40);
    }


    @Test
    public void DivideForCalculator() {
        calculator.divide(40, 5);
        Assert.assertEquals(calculator.result, 8);
    }

}
