package org.twentyOctober2023;

public class GretestSmallest {

    public static void main(String[] args) {

        int num1 = 10, num2 = 15, num3 = 20, num4 = 5;
        findLargest(num1, num2, num3);
        findTwoLargest(num1, num2);
        findSmallest(num1, num2, num3, num4);
    }

    static void findLargest(float num1, float num2, float num3) {
        if (num1 >= num2 && num1 >= num3) {
            System.out.println(num1 + " is the max number");

        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println(num2 + " is the max number");

        } else {
            System.out.println(num3 + " is the max number");

        }
    }

  public   static void findTwoLargest(int num1, int num2) {
        if (num1 >= num2) {
            System.out.println(num1 + " is the max number");
        } else if (num2 >= num1) {
            System.out.println(num2 + " is the max number");
        } else {
            System.out.println("\n both  number are same");
        }

    }

    static void findSmallest(int num1, int num2, int num3, int num4) {

        if (num1 <= num2 && num1 <= num3 && num1 <= num4) {
            System.out.println(num1 + " is the min number");

        } else if (num2 <= num1 && num2 <= num3 && num2 <= num4) {
            System.out.println(num2 + " is the min number");

        } else if (num3 <= num4 && num3 <= num2 && num3 <= num1) {
            System.out.println(num3 + " is the min number");

        } else {
            System.out.println("\n all  number are same");
        }
    }
}


