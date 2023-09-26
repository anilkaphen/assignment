package org.twentyfour092023;

public class Main {
    public static void main(String [] args){
        Calculator calculator = new Calculator();

     int resultadd =    calculator.add(5,6);
        System.out.println("Addition " + resultadd);
        int resultminus =    calculator.subtract(10,6);
        System.out.println("Minus " + resultminus);
        int resultmultiply =    calculator.multiply(5,6);
        System.out.println("Multiply " + resultmultiply);
        int resultdivide =    calculator.divide(10,2);
        System.out.println("Divide " + resultdivide);
    }
}
