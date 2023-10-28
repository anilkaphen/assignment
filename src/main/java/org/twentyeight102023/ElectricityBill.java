package org.twentyeight102023;

public class ElectricityBill {
    public static void main (String args[]){

        int units =350;
        System.out.println("Total amount of "+ units +" units: ");
        System.out.println(
                calculateBill(units));
    }
    public static int calculateBill(int units){
        {
            int first_unit = 10;
            int second_unit = 20;
            int third_unit = 35;
            int fourth_unit = 40;

            if (units <= 100) {
                return units * first_unit;
            }
            else if (units <= 200) {
                return (100 * first_unit)
                        + (units - 100)
                        * second_unit;
            }
            else if (units <= 300) {
                return (100 * first_unit)
                        + (100 * second_unit)
                        + (units - 200)
                        * third_unit;
            }
            else if (units > 300) {
                return (100 * first_unit)
                        + (100 * second_unit)
                        + (100 * third_unit)
                        + (units - 300)
                        * fourth_unit;
            }
            return 0;
        }
    }
}
