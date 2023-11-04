package org.fourthNovember2023;

public class Pattern3 {
    public static void main(String args[]) {

        int i, j, k, star = 5;
        for (i = star; i >= 1; i--) {
            for (j = star; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
