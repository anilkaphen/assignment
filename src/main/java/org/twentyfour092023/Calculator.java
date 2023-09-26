package org.twentyfour092023;

public class Calculator implements ICalculator {

    public int a;
    public int b;
    int result;
    @Override
    public int add(int a, int b) {

        result = a+b ;
        return result ;
    }

    @Override
    public int subtract(int a, int b) {
        result =a-b;
        return result;

    }

    @Override
    public int multiply(int a, int b) {
        result =a*b;
        return result;

    }

    @Override
    public int divide(int a, int b) {
        result =a/b;
        return result;

    }
}





