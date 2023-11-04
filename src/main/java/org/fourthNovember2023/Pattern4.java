package org.fourthNovember2023;

public class Pattern4 {

    public static void main(String args[]) {

        int i, j, k, star = 5;
        for (i = 0; i <= star; i++) {
            for (j = 1; j <= star - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}