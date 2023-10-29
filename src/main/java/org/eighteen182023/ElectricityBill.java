package org.eighteen182023;

public class ElectricityBill {

    public static void main(String[] args) {

        ElectricityBill e = new ElectricityBill();
        System.out.println("1st Bill:" + e.calculateElectricityBillV2(350));
        System.out.println("2nd Bill:" + e.calculateElectricityBillV2(80));
        System.out.println("3rd Bill:" + e.calculateElectricityBillV2(150));
    }

    public static double calculateElectricityBillV1(int units) {
        int b = 0;
        int i = units;

        if (i <= 100) {
            b = i * 10;
        } else {
            b = 100 * 10;
            i = i - 100;

            if (i <= 100) {
                b = b + i * 20;
            } else {
                b = b + 100 * 20;
                i = i - 100;

                b = b + i * 35;

            }
        }
        return b;
    }

    public int calculateElectricityBillV2(int units) {
        int b = 0;
        if (units <= 100)
            b = units * 10;
        else if (units <= 200)
            b = 100 * 10 + (units - 100) * 20;
        else
            b = 100 * 10 + 100 * 20 + (units - 200) * 35;
        return b;
    }
}


