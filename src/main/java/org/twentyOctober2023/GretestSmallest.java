package org.twentyOctober2023;

public class GretestSmallest {
    public static void main(String[] args) {
        GretestSmallest gretestSmallest = new GretestSmallest();
        int num1 = 10, num2 = 15, num3 = 20, num4 = 5;
        gretestSmallest.findLargest(num1, num2, num3);
        gretestSmallest.findTwoLargest(num1, num2);
        gretestSmallest.findSmallest(num1, num2, num3, num4);
    }

    public int findLargest(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }

    public int findTwoLargest(int num1, int num2) {
        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public int findSmallest(int num1, int num2, int num3, int num4) {
        if (num1 <= num2 && num1 <= num3 && num1 <= num4) {
            return num1;
        } else if (num2 <= num1 && num2 <= num3 && num2 <= num4) {
            return num2;
        } else if (num3 <= num4 && num3 <= num2 && num3 <= num1) {
            return num3;
        } else {
            return num4;
        }
    }
}


